public class Student implements java.io.Serializable
{
   public String name;
   public String address;
   public transient int regNum;
   public int number;
   public void mailResult(){
       System.out.println( "Result of " + name + "");
}
}
