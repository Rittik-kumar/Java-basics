import java.util.Scanner;

public class largestOf3 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    //using logical operator
    System.out.println("Enter first number:");
    int a=sc.nextInt();

    System.out.println("Enter second number:");
    int b=sc.nextInt();

    System.out.println("Enter third number:");
    int c=sc.nextInt();

    if(a>b && a>c)
    {
      System.out.println(a+ " is largest number");
    }
    else if(b>a && b>c)
    {
      System.out.println(b+ " is largest number");
    }
    else
    {
      System.out.println(c+ " is largest number");
    }

    //using ternary operator
    System.out.println("Enter first number:");
    int a1=sc.nextInt();

    System.out.println("Enter second number:");
    int b1=sc.nextInt();

    System.out.println("Enter third number:");
    int c1=sc.nextInt();
  
    int largest = c1>(a1>b1?a1:b1)?c1:(a1>b1?a1:b1);

    System.out.println(largest+ " is largest number");
  }
}
