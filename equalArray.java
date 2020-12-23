import java.util.Arrays;

public class equalArray {
  public static void main(String[] args) {
    int a[]={1,2,3,4,5};
    int b[]={1,2,3,4,5};
    int c[]={1,8,3,4,6};

   //Approach 1
   boolean x=Arrays.equals(a,b);
   
   if(x==true)
    System.out.println("Arrays are equal");
   else
    System.out.println("Arrays are not equal");

    boolean y=Arrays.equals(a,c);
   
   if(y==true)
    System.out.println("Arrays are equal");
   else
    System.out.println("Arrays are not equal");


   //Approach 2
   boolean z=true;
   
   if(a.length==b.length)
   {
     for(int i=0;i<a.length;i++)
     {
       if(a[i]!=b[i])
        z=false;
     }
   }
   else
   z=false;

   if(z==true)
   System.out.println("Arrays are equal");
   else
    System.out.println("Arrays are not equal");
  }
}
