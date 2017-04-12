package com.example.ramky.timespread;

import android.os.StrictMode;
import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
//***************************************************************************************************************************************************
public class Login {

    public static String ro;

    private String response;
    private static Bustimetable b;
    private static Messmenu m;
    private static Placements p;
    public static Userdata u;
    public static Courses c;
    public static ArrayList<Course> mon = new ArrayList<Course>();
    public static ArrayList<Course> tue =new ArrayList<Course>();
    public static ArrayList<Course> wed = new ArrayList<Course>();
    public static ArrayList<Course> thu = new ArrayList<Course>();
    public static ArrayList<Course> fri = new ArrayList<Course>();



    Login()
    {
        response = "true";
    }

    static JSONObject jObj = null;
    String json = " ";
    InputStream ps = null;

    public Bustimetable getB() {
        return b;
    }

    public void setB(Bustimetable b1) {
        b = b1;
    }

    public Messmenu getM(){
        return m;
    }

    public void setM(Messmenu m1){
        m=m1;
    }

    public Placements getP()
    {
        return p;
    }

    public void setP(Placements p1){p=p1;}

    public Courses getC() {return c;}

    public void setC(Courses c1){c=c1;}


    String checklogin(String rollno,String password) {


        try {

            URL url = new URL("http://timespread.mybluemix.net/user/login");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");

            String input = "{\"rollNo\":\""+rollno+"\",\"password\":\""+password+"\"}";


            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());

            InputStream inStream = null;
            inStream = conn.getInputStream();
            BufferedReader bReader = new BufferedReader(new InputStreamReader(inStream));
            String temp,line, response = "";
            while ((temp = bReader.readLine()) != null)
                response += temp;
            while((line=bReader.readLine())!= null)

            bReader.close();

            inStream.close();
            os.flush();
            if (conn.getResponseCode() ==200)
                return "true";

            else {

                return "false";
            }


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



/****************************************************************************************************************************************************/

void getbusdata()
{
    try
    {

        URL url = new URL("http://timespread.mybluemix.net/bus/all");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }

        Scanner s = new Scanner(conn.getInputStream()).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";



        ObjectMapper mapper = new ObjectMapper();
        Bustimetable b = mapper.readValue(result,Bustimetable.class);
        this.setB(b);


    }

    catch(Exception e)
    {
        e.printStackTrace();
    }
}
/*****************************************************************************************************************************************************/

void getmessdata(){
    try
    {

        URL url = new URL("http://timespread.mybluemix.net/mess/all");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }

        Scanner s = new Scanner(conn.getInputStream()).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";



        ObjectMapper mapper = new ObjectMapper();
        Messmenu m = mapper.readValue(result,Messmenu.class);

         this.setM(m);

    }

    catch(Exception e)
    {
        e.printStackTrace();
    }




}




/***************************************************************************************************************************************************//**************************************************************************************************************************************************/
    void getplacementdata(){
        try
        {

            URL url = new URL("http://timespread.mybluemix.net/placement/all");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            Scanner s = new Scanner(conn.getInputStream()).useDelimiter("\\A");
            String result = s.hasNext() ? s.next() : "";



            ObjectMapper mapper = new ObjectMapper();
            Placements p = mapper.readValue(result,Placements.class);

            this.setP(p);


        }

        catch(Exception e)
        {
            e.printStackTrace();
        }




    }

/***************************************************************************************************************************************************/
void getcoursedata(){
    try
    {

        URL url = new URL("http://timespread.mybluemix.net/course/all");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Accept", "application/json");

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }

        Scanner s = new Scanner(conn.getInputStream()).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";



        ObjectMapper mapper = new ObjectMapper();
        Courses c = mapper.readValue(result,Courses.class);

        this.setC(c);


    }

    catch(Exception e)
    {
        e.printStackTrace();
    }




}
/****************************************************************************************************************************************************/

 boolean addcourses(String rollno,int i,int [] j1)
 {
    try
    {
        URL url = new URL("http://timespread.mybluemix.net/user/add_course");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Accept", "application/json");




        JSONObject j = new JSONObject();
        JSONArray ja = new JSONArray();
        ObjectMapper mapper = new ObjectMapper();

        j.put("rollNo",rollno);
        while(i==0) {
            ja.put(mapper.writeValueAsString(c.getCourseData().get(0).getCourses().get(j1[i])));
            /*ja.put(mapper.writeValueAsString(c.getCourseData().get(0).getCourses().get(1)));
            ja.put(mapper.writeValueAsString(c.getCourseData().get(0).getCourses().get(2)));
            ja.put(mapper.writeValueAsString(c.getCourseData().get(0).getCourses().get(3)));*/
            i--;
        }
        j.put("courseData",ja);



        OutputStream os = conn.getOutputStream();
        os.write(j.toString().getBytes());

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }

        InputStream inStream = conn.getInputStream();

        Scanner s = new Scanner(inStream).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";

        inStream.close();
        os.flush();

        return true;



    }


    catch (ProtocolException e) {
        e.printStackTrace();
        return false;
    } catch (MalformedURLException e) {
        e.printStackTrace();
        return false;
    } catch (IOException e) {
        e.printStackTrace();
        return false;
    } catch (JSONException e) {
        e.printStackTrace();
        return false;
    }


 }
/**************************************************************************************************************************************************/
void printclassschedule(ArrayList<Course> c3)
{
    int i,j;


    ArrayList<ArrayList<Integer>> b = new ArrayList<ArrayList<Integer>>();

    for(i=0;i<c3.size();i++)
    {
        b.add(i,(ArrayList<Integer>) c3.get(i).getWeekdays());
    }

    for(i=0;i<b.size();i++)
    {

        if(b.get(i).get(0)>-1)
        {
            mon.add(c3.get(i));
        }

        else{

        }

    }

    for(i=0;i<b.size();i++)
    {

        if(b.get(i).get(1)>-1)
        {
            tue.add(c3.get(i));
        }

        else{

        }

    }

    for(i=0;i<b.size();i++)
    {

        if(b.get(i).get(2)>-1)
        {
            wed.add(c3.get(i));
        }

        else{

        }

    }

    for(i=0;i<b.size();i++)
    {

        if(b.get(i).get(3)>-1)
        {
            thu.add(c3.get(i));
        }

        else{

        }

    }

    for(i=0;i<b.size();i++)
    {

        if(b.get(i).get(4)>-1)
        {
            fri.add(c3.get(i));
        }

        else{

        }

    }

    Collections.sort(mon,new MycomparatorMon());
    Collections.sort(tue,new MycomparatorTue());
    Collections.sort(wed,new MycomparatorWed());
    Collections.sort(thu,new MycomparatorThu());
    Collections.sort(fri,new MycomparatorFri());




}

/**************************************************************************************************************************************************/

String convertTime(int a)
{
    if(a==1)
    {
        return "1.00PM - 2.00PM";
    }

    else if(a==2)
    {
        return "2.00PM - 3.00PM";
    }

    else if(a==3)
    {
        return "3.00PM - 4.00PM";
    }

    else if(a==4)
    {
        return "4.00PM - 5.00PM";
    }

    else
    {
        return "5.00PM - 6.00PM ";
    }



}
/***************************************************************************************************************************************************/

void getuserdata(String rollno)
{
    try {
        URL url = new URL("http://timespread.mybluemix.net/user/userdata");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setDoOutput(true);
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setRequestProperty("Accept", "application/json");


        String input = "{\"rollNo\":\""+rollno+"\"}";



        OutputStream os = conn.getOutputStream();
        os.write(input.getBytes());

        if (conn.getResponseCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + conn.getResponseCode());
        }

        InputStream inStream = conn.getInputStream();

        Scanner s = new Scanner(inStream).useDelimiter("\\A");
        String result = s.hasNext() ? s.next() : "";

        ObjectMapper mapper = new ObjectMapper();
        u = mapper.readValue(result,Userdata.class);

        inStream.close();
        os.flush();


    }
    catch (MalformedURLException e) {

        e.printStackTrace();


    }

    catch (IOException e) {

        e.printStackTrace();


    }



}
//********************************************************************************************************************************************************
String badge (String x){

        int i;
        String pan="";
        System.out.print(x);
        for(i=0;i<x.length();i++){
            if(x.charAt(i) == ' ')
                break;

        }
        System.out.println(i);

        pan += x.substring(0, 1);
        pan += x.substring(i+1,i+2);
        System.out.print(pan);

    return (pan);
}


}