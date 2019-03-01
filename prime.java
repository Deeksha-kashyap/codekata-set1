import java.util.*;
class Prime
{
    public static void main(String[] args)
    {
       int i,m=0,num,flag=0;
       System.out.println("Enter the number");
       Scanner scan=new Scanner(System.in);
       num=scan.nextInt();
       m=num/2;
       if(num==0||num==1)
       {
          System.out.println(num+"is not a prime number");
       }
       else
       {
          for(i=2;i<=m;i++)
          {
             if(num%i==0)
             {
                System.out.println(num+"is not a prime number");
                flag=1;
                break;
             }
          }
          if(flag==0)
          {
             System.out.println(num+"is a prime number");
          }
       }
    }
}
