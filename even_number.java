import java.util.*;
class EvenDisplay
{
    public static void main(String[] args)
    {
        int num;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=1;i<num;i++)
        {
           if(i%2==0)
           {
              System.out.print(i + " ");
           }
        }
    }
}
