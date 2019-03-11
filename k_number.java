import java.util.*;
class Sum{
  public static void main(String[] args){
  int sum=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number :");
    int n=scan.nextInt();
    System.out.println("Enter the another number k:");
    int k=scan.nextInt();
    int[] arr=new int[n];
    for(int i=1;i<=n;i++)
    {
       arr[i]=scan.nextInt();
    }
    for(int i=1;i<=k;i++)
    {
        sum=sum+arr[i];
    }
    System.out.println(sum);
  }
}
