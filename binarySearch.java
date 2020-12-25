import java.util.Arrays;

public class binarySearch {
  public static void main(String[] args) {

    int a[]={1,2,3,4,5,6,7,8,9,10};   //array should be in sorted order

    //approach 1
    int key=7;
    int l=0;
    int h=a.length-1;
    boolean flag=false;

    while(l<=h)
    {
      int mid=(l+h)/2;

      if(a[mid]==key)
      { 
        System.out.println("Element found at position: "+(mid+1));
        flag=true;
        break;
      }

      if(a[mid]<key)
       l=mid+1;
      else
       h=mid-1;
    }

    if(flag==false)
    System.out.println("Element not found");

    //approach 2
    int pos=Arrays.binarySearch(a,key);
    if(pos==-1)
     System.out.println("Element not found");
    else
    System.out.println("Element found at position: "+(pos+1));

  }
}
