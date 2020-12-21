import java.util.Scanner;

public class factorial {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter number:");
    int num=sc.nextInt();

    long factorial=1;

    for(int i=1;i<=num;i++){
      factorial=factorial*i;
    }
    System.out.print("Factorial of "+num+ " is: "+factorial);
  }
}
