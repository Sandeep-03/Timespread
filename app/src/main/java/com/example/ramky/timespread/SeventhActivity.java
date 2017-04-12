package com.example.ramky.timespread;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ImageView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class SeventhActivity extends AppCompatActivity implements View.OnClickListener{
    protected Button selectReceiversBtn;
    protected CharSequence[] receivers = {
            "Receiver1", "Receiver2", "Receivers3"};
    protected ArrayList<CharSequence> selectedReceivers = new ArrayList<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        selectReceiversBtn = (Button) findViewById(R.id.select_receivers);
        selectReceiversBtn.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.select_receivers:
                showSelectReceiversDialog();
                break;
            default:
                break;
        }
    }

    protected void onChangeSelectedReceivers() {
        StringBuilder stringBuilder = new StringBuilder();

        for(CharSequence receivers : selectedReceivers)
            stringBuilder.append(receivers + ",");
        selectReceiversBtn.setText(stringBuilder.toString());
    }

    protected void showSelectReceiversDialog() {
        boolean[] checkedReceivers = new boolean[receivers.length];
        int count = receivers.length;

        for(int i = 0; i < count; i++)
            checkedReceivers[i] = selectedReceivers.contains(receivers[i]);

        DialogInterface.OnMultiChoiceClickListener receiversDialogListener = new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                if(isChecked)
                    selectedReceivers.add(receivers[which]);
                else
                    selectedReceivers.remove(receivers[which]);

                onChangeSelectedReceivers();
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder
                .setTitle("Select Receivers")
                .setMultiChoiceItems(receivers, checkedReceivers, receiversDialogListener)
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}