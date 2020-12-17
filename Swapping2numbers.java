public class Swapping2numbers {

  public static void main(String[] args) {
    
    int a=10,b=20;

    System.out.println("Before swapping values are: a="+a+" b="+b);
    // Using third variable
    int t;
    t=a;
    a=b;
    b=t;
    System.out.println("After swapping values are: a="+a+" b="+b);

    System.out.println("Before swapping values are: a="+a+" b="+b);
    // Using + and - operator
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping values are: a="+a+" b="+b);

    System.out.println("Before swapping values are: a="+a+" b="+b);
    // Using * and / operator (a nd b should not be zero)
    a=a*b;
    b=a/b;
    a=a/b;
    System.out.println("After swapping values are: a="+a+" b="+b);

    System.out.println("Before swapping values are: a="+a+" b="+b);
    // Using bitwise XOR(^)
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.println("After swapping values are: a="+a+" b="+b);

    System.out.println("Before swapping values are: a="+a+" b="+b);
    // Using single statement
    b=a+b-(a=b);
    System.out.println("After swapping values are: a="+a+" b="+b);
    
  }
}