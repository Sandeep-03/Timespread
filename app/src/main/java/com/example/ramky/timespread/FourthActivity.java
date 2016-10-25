package com.example.ramky.timespread;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {


    TextView tv1,tv2,tc1;
    Button button1;
    EditText et1,et2,et3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        TextView tv1 = (TextView) findViewById(R.id.tv1);
        TextView tc1 = (TextView) findViewById(R.id.tc1);
        TextView tv2 = (TextView) findViewById(R.id.tv2);
        final EditText et1 = (EditText) findViewById(R.id.et1);
        final EditText et2 = (EditText) findViewById(R.id.et2);
        final EditText et3 = (EditText) findViewById(R.id.et3) ;
        final Button button1 = (Button) findViewById(R.id.button1);
        final String data1 = getIntent().getExtras().getString("data");
        System.out.println(data1);

        tc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("http://timespread.mybluemix.net/termsandconditions"));
                startActivity(viewIntent);
            }
        });



        assert button1 != null;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                    if (et2.getText().toString().equals(et3.getText().toString())) {
                        // Not null and OK, launch the activity
                        startActivity(new Intent(FourthActivity.this, NinthActivity.class));

                    } else {
                        // Username or password false, display and an error
                        et2.setError("Password didn't match");
                        et3.setError("password didn't match");

                    }

                }



        });
    }

}
