import java.util.Scanner;
public class ThrowDemo {
     //function to check if a GPA value is valid or not
    public static void validate_gpa(double gpa){
        if ((gpa>4) || (gpa<0)){
            //throw Arithmetic exception it GPA is over 4.0
            throw new ArithmeticException("The GPA is NOT valid");
        }
        else {
            System.out.println("The GPA is Valid!!");}
        }
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your GPA:");
        double myGpa = input.nextDouble();
        validate_gpa (myGpa);
    }
}
