import java.io.*;
import java.util.*;
import java.util.zip.*;
public class TestZip {
    public static void main(String[] args) {

        // These are the files to include in the zip files.
        String[] filenames = new String[]{"Students.ser","inputFile.txt"};


        // creating a Buffer for reading the Files
        byte[] buf = new byte[1024];

        try{
        String outFilename = "outfile.zip";
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(outFilename));
        
        // Compress the Files
        for(int i=0;i<filenames.length;i++){
            FileInputStream in = new FileInputStream(filenames[i]);

            //Add ZIP entry to output straem.
            out.putNextEntry(new ZipEntry(filenames[i]));
            
            //Transfer bytes from the file to the ZIP file
            int leg;
            while((leg = in.read(buf))>0){
                out.write(buf,0,leg);
            }

            //Complete the Entry
            out.closeEntry();
            in.close();
        }

        //Complete the ZIP file
        out.close();
    }
    catch(IOException e){
    }
 }
    
}
