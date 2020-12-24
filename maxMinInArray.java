
public class maxMinInArray {
public static void main(String[] args) {
  int a[]={50,30,40,20,60};

  int max=a[0], min=a[0];

  for(int i=0;i<a.length;i++)
  {
    if(a[i]>max)
      max=a[i];
    if(a[i]<min)
     min=a[i];
  }

  System.out.println("Maximum element in array is : "+max);
  System.out.println("Minimum element in array is : "+min);
}
  
}