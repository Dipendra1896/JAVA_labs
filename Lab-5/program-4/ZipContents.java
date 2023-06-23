import java.io.*;
import java.util.*;
import java.util.zip.*;
public class ZipContents {
    public static void main(String[] args) {
        try{

            // Open the ZIP file
            ZipFile zf = new ZipFile("outfile.zip");

            //Enumerate each entry
            for(Enumeration entries = zf.entries(); entries.hasMoreElements();){
                
                //Get the Entry name
                String zipEntryName =((zipEntry)entries.nextElement()).getName();
                System.out.println("name:" +zipEntryName);
            }
        }
        catch (IOException e){

        } 
    }
    
}
