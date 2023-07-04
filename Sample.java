import java.util.Scanner;
public class Sample{
public static void main(String[]args){
    int a ,b ,sum;
    Scanner input=new Scanner(System.in);
    System.out.println("Enetr value of a and b:");
    a=input.nextInt();
    b=input.nextInt();
    sum=a+b;
    System.out.println("sum is:"+sum);   
}
}