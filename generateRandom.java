import java.util.Random;

public class generateRandom {
  public static void main(String[] args) {
    //approach 1
    Random ran=new Random();
    //to print random int value range 0 to 9 
    int random_int=ran.nextInt(10);
    System.out.println(random_int);

    //to print random double value range 0.0 to 1.0
    double random_dbl=ran.nextDouble();
    System.out.println(random_dbl);

    //approach 2
    System.out.println(Math.random());
  }
}
