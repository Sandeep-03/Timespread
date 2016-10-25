package com.example.ramky.timespread;

import android.os.StrictMode;
import android.util.Log;

import org.json.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//***************************************************************************************************************************************************
public class Login {

    private String response;

    Login()
    {
        response = "true";
    }

    static JSONObject jObj = null;
    String json = " ";
    InputStream ps = null;


    String checklogin(String rollno,String password) {


        try {

            URL url = new URL("http://timespread.mybluemix.net/user/login");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");

           String input = "{\"rollNo\":\""+rollno+"\",\"password\":\""+password+"\"}";
            System.out.println(input);

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());

            InputStream inStream = null;
            inStream = conn.getInputStream();
            BufferedReader bReader = new BufferedReader(new InputStreamReader(inStream));
            String temp,line, response = "";
            while ((temp = bReader.readLine()) != null)
                response += temp;
            while((line=bReader.readLine())!= null)
                System.out.println(line);
            bReader.close();
            inStream.close();
            os.flush();
            if (conn.getResponseCode() ==200)
                return "true";

            else
            return "false";


        } catch (MalformedURLException e) {

            e.printStackTrace();
            return "false";

        } catch (IOException e) {

            e.printStackTrace();
            return "false";

        }


    }

 /****************************************************************************************************************************************************/

    String checkroll(String rollno)
    {
        try {
            URL url = new URL("http://timespread.mybluemix.net/user/rollno");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");


            String input = "{\"rollNo\":\""+rollno+"\"}";


            System.out.println(input);

            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            InputStream inStream = conn.getInputStream();

            Scanner s = new Scanner(inStream).useDelimiter("\\A");
            String result = s.hasNext() ? s.next() : "";

            inStream.close();
            os.flush();

            return result;
        }
        catch (MalformedURLException e) {

            e.printStackTrace();
            return "false";

        }

        catch (IOException e) {

            e.printStackTrace();
            return "false";

        }



    }

/****************************************************************************************************************************************************/
    int day (){
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Date d = new Date();
        String da = sdf.format(d);
        if(da.equals("Monday"))
            return 0;
        else if (da.equals("Tuesday"))
            return 1;
        else if (da.equals("Wednesday"))
            return 2;
        else if (da.equals("Thursday"))
            return 3;
        else if (da.equals("Friday"))
            return 4;
        else if (da.equals("Saturday"))
            return 5;
        else
            return 6;
    }
/****************************************************************************************************************************************************/
    boolean register(String data)
    {
        try
        {
            URL url = new URL("http://timespread.mybluemix.net/user/register");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");

            OutputStream os = conn.getOutputStream();
            os.write(data.getBytes());

            InputStream inStream = null;
            inStream = conn.getInputStream();

            if(conn.getResponseCode()==200)
            {
                return true;
            }

            else
            {
                return false;
            }



        }

        catch (MalformedURLException e) {

            e.printStackTrace();
            return false;

        }

        catch (IOException e) {

            e.printStackTrace();
            return false;

        }




    }

    }

/****************************************************************************************************************************************************/

