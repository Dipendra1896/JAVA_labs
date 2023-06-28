import java.io.*;
public class DeserializeDemo{
    public static void main(String[] args) {
        Student e = null;
        try{
            FileInputStream fileIn = new FileInputStream("Students.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Student) in.readObject();
            in.close();
            fileIn.close();
        }
        catch( IOException i){
            i.printStackTrace();
            return;
        }
        catch(ClassNotFoundException c)
        {
            System.out.println("Student class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Students...");
        System.out.println("Name: " + e.name);
        System.out.println("Address: " + e.address);
        System.out.println("Reg Num: " + e.regNum) ;
        System.out.println("Nunber: " + e.number);
    }
}