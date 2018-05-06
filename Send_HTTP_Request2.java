import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL; 
import java.io.InputStream;
import java.util.Scanner;

public class Send_HTTP_Request2 {
	public static void main(String[] args) {
     try {
         Send_HTTP_Request2.call_me2();
        } catch (Exception e) {
         e.printStackTrace();
       }


     }
	   
// this will send an HTTP GET request. 
public static void call_me1() throws Exception {
     String url = "http://www.google.com/search?q=mkyong";
     URL obj = new URL(url);
     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
     // optional default is GET
     con.setRequestMethod("GET");
     //add request header
     con.setRequestProperty("User-Agent", "Mozilla/5.0");
     int responseCode = con.getResponseCode();

      InputStream vResponse = con.getInputStream( );
      try (Scanner scanner = new Scanner( vResponse )) {
            String vResponseBody = scanner.useDelimiter("\\A").next();
            System.out.println(vResponseBody);
        }

 
   }


// This function will send an HTTP POST Request. 
   public static void call_me2() throws Exception {
    String url = "http://httpbin.org/ip";
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        // optional default is GET
        con.setRequestMethod("GET");
        //add request header
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        //print in String
        System.out.println(response.toString());
    
        }
}
