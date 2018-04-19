/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/**
 *
 * @author iMac
 */
public class JavaApplication4 {

     
     
        /**
         *
         * @param args
         * @throws java.lang.Exception
         */
        public static void main(String[] args) throws Exception 
    {
         JSONObject myObject=
            new JSONObject (getHTML("https://swapi.co/api/people/1/?format=json"));
        
        System.out.println(myObject.get("gender"));
        System.out.println(myObject.get("name"));
        System.out.println(myObject.get("birth_year"));
    }
    public static String getHTML(String urlToRead) throws Exception
    {
     URL url=new URL(urlToRead);
     HttpURLConnection conn = (HttpURLConnection) url.openConnection();
     conn.setRequestMethod("GET");
     conn.addRequestProperty("User-Agent", "Mozila/4.76");
     
     StringBuilder result = new StringBuilder();
     BufferedReader rd=
             new BufferedReader(new InputStreamReader(conn.getInputStream()));
     String line;
     while ((line=rd.readLine()) !=null)
     {
         result.append(line);
     }
    rd.close();
    
    return result.toString();
    }
    
   }

