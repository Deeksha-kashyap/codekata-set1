import java.util.*;
class Palindrome
{
   public static void main(String[] args)
   {
      int r,sum=0,num,temp;
      System.out.println("Enter the number");
      Scanner scan=new Scanner(System.in);
      num=scan.nextInt();
      temp=num;
      while(num>0)
      {  
         r=num%10;
         sum=(sum*10)+r;
         num=num/10;
      }
      if(temp==sum)
       {
           System.out.println("Yes it is palindrome");
       }
       else
       {
          System.out.println("No it is not a palindrome");
       }
    }
}
