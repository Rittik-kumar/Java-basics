public class sumOfArray {
  public static void main(String[] args) {
    int a[]={5,2,7,9,6};
    int sum=0,sum1=0;

    //using for loop
    for(int i=0;i<a.length;i++)
    {
      sum=sum+a[i];
    }

    System.out.println("Sum of array is: "+sum);

    //using enhanced for loop
    for(int value:a)
    {
      sum1=sum1+value;
    }

    System.out.print("Sum of array is: "+sum1);

  }
}
