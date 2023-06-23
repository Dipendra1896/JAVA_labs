import java.io.*;
public class InputStreamDemo{
    public static void main(String[] args) {
        String rawData = null;
        int intVal = 0;
        System.out.println("Enter an integer:");
    try{
        // ctreating an object of bufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Reading user data
        rawData = br.readLine();
        intVal = Integer.parseInt(rawData);
    }
    catch(NumberFormatException ex){
        System.err.println("Not a valid number!!");
    }
    catch(IOException e){
        System.err.println("Unexpected IO Error: " +e);
    }
    System.out.println("Evaluated Integer value: " +intVal);
}
}

