import java.util.Scanner;

public class fibonacci {
  public static void main(String[] args) {
    int n1=0,n2=1,sum=0;
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter how many number you want: ");
    int a=sc.nextInt();
    System.out.print("Required fibonacci series is: ");
    if(a==1)
    {
      System.out.print(n1);
    }
    else if(a==2)
    {
      System.out.print(n1+" "+n2);
    }
    else{
    System.out.print(n1+" "+n2);
    for(int i=2;i<a;i++)
    {
      sum=n1+n2;
      System.out.print(" "+sum);
      n1=n2;
      n2=sum;
    }
    }
  }
}
