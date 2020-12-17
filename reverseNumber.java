import java.util.Scanner;

public class reverseNumber {

  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    
    System.out.println("Enter a number:");
    int num=sc.nextInt();

    // using algorithm
    int rev=0;

    while(num!=0)
    {
      rev=rev*10 + num%10;
      num=num/10;
    }

    System.out.println("Reverse number is: "+rev);

    // using stringbuffer class
    System.out.println("Enter a number:");
    int num1=sc.nextInt();
    

    StringBuffer sb=new StringBuffer(String.valueOf(num1));

    StringBuffer rev1=sb.reverse();

    System.out.println("Reverse number is: "+rev1);

    // using StringBuilder class
    System.out.println("Enter a number:");
    int num2=sc.nextInt();

    StringBuilder sbl=new StringBuilder();

    sbl.append(num2);
    StringBuilder rev2=sbl.reverse();

    System.out.println("Reverse number is: "+rev2);

  }
}