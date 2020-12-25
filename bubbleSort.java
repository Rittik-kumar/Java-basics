import java.util.Arrays;

public class bubbleSort {
  public static void main(String[] args) {
    int a[]={4,2,1,5,3};;
    System.out.println("Array before sorting: "+ Arrays.toString(a));

    int n=a.length;

    for(int i=0;i<n-1;i++)      //number of passes
    {  
      for(int j=0;j<n-1;j++)    //iterations in each pass
      {
        if(a[j]>a[j+1])
        {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }

    System.out.println("Array after sorting: "+ Arrays.toString(a));
  }
}
