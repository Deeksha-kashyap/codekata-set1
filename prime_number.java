import java.util.*;
public class Prime
{
   public static void main(String[] args)
   {
      int a,b;
      System.out.println("Enter the nmber of a and b");
      Scanner scan=new Scanner(System.in);
      a=scan.nextInt();
      b=scan.nextInt();
      while(a<b)
      {
         if(checkPrimeNumber(a))
         {
             System.out.print(a + " ");
             ++a;
         }
      }
   }
   public static boolean checkPrimeNumber(int num)
   {
      boolean flag=true;
      for(int i=2;i<=num/2;i++)
      {
         if(num%i==0)
         {
            flag=false;
            break;
         }
      }
      return flag;
   }
}
