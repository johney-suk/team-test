package org.comstudy21.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JOptionPane;

import org.json.JSONObject;
import org.json.JSONTokener;

public class App 
{
    public static void main( String[] args ) throws IOException
    {
       String host = "http://localhost:8888/URLServer/Json_data.jsp";
       host += String.format("?user=%s&message=%s","KANG", "Hi");
        URL server = new URL(host);
        
//        InputStream is = server.openStream();
//        InputStreamReader isr = new InputStreamReader(is);
//        BufferedReader in = new BufferedReader(isr);
//        
//        String line = null;
//        StringBuffer jsonTxt = new StringBuffer();
//        while((line=in.readLine())!=null) {
//           jsonTxt.append(line);
//        }
//        System.out.println(jsonTxt.toString().trim());
       
       
        
        InputStream is = server.openStream();
        JSONTokener token = new JSONTokener(is);
        JSONObject jsObj = new JSONObject(token);
        //System.out.println("USER : " + jsObj.getString("user"));
        //System.out.println("MESSAGE : " + jsObj.getString("message"));
        System.out.printf("%s님 %s", jsObj.getString("user"), jsObj.getString("message"));
        
        JOptionPane.showMessageDialog(null, String.format("%s님 %s", jsObj.getString("user"), jsObj.getString("message")));
        
        is.close();
    }
}