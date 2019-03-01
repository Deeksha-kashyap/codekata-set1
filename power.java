import java.util.*;
import java.lang.Math;
class Power
{
   public static void main(String[] args)
   {
      int a,b;
      System.out.println("Enter the number");
      Scanner scan=new Scanner(System.in);
      a=scan.nextInt();
      b=scan.nextInt();
      System.out.println(Math.pow(a,b));
   }
}
