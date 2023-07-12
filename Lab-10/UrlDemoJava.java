import java.net.*;
import java.io.*;
public class UrlDemoJava{
    public static void main(String[]args){
        try{
            URL url = new URL("http://github.com/bidur/java-lab2023/blob/main/lab10_networkProgramming.pdf");
           // URL url = new URL("https://www.gces.edu.np");
            System.out.println("URL is " +url.toString());
            System.out.println("protocol is " +url.getProtocol());
            System.out.println("authority is " +url.getAuthority());
            System.out.println("file name is " +url.getFile());
            System.out.println("host is " +url.getHost());
            System.out.println("path is " +url.getPath());
            System.out.println("port is " +url.getPort());
            System.out.println("Default port is " +url.getDefaultPort());
            System.out.println("Query port is " +url.getQuery());
            System.out.println("ref is " +url.getRef());
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

}



