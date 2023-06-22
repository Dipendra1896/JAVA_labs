import java.util.Scanner;
class DivisionExp{
    public static void main(String[]args){
        int x,y;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers:");
        x = input.nextInt();
        y = input.nextInt();
        //try block
        try{
            result = x/y;
            System.out.println("Final Result:"+result);
        }

        //catch block
        catch(ArithmeticException e){
            System.out.println("Exception caught:Division by Zero.");            
        }
    }
}