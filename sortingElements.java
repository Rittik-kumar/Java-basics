import java.util.Arrays;
import java.util.Collections;

public class sortingElements {
  public static void main(String[] args) {
    //sorting in ascending order
    //approach 1
    int a[]={30,50,20,10,60};
    System.out.println("Array before sorting: "+ Arrays.toString(a));

    Arrays.parallelSort(a);

    System.out.println("Array after sorting: "+ Arrays.toString(a));

    //approach 2
    int b[]={30,50,20,10,60};
    System.out.println("Array before sorting: "+ Arrays.toString(b));
 
    Arrays.sort(b);
    
    System.out.println("Array after sorting: "+ Arrays.toString(b));


    //sorting in descending order
    //approach 1
    
    Integer c[]={30,50,20,10,60};
    System.out.println("Array before sorting: "+ Arrays.toString(c));

    Arrays.sort(c,Collections.reverseOrder());

    System.out.println("Array after sorting: "+ Arrays.toString(c));


  }
}
