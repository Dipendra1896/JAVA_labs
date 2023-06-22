import java.util.Scanner;
class Division{
    public static void main(String[]args){
        int x,y;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers:");
        x = input.nextInt();
        y = input.nextInt();
        result = x/y;
        System.out.println("Final Result:"+result);
        
    }
}