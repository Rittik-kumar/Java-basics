public class linearSearch {
  public static void main(String[] args) {
    int a[]={10,20,40,50,30};
    int key=0;
    boolean flag=false;

    for(int i=0;i<a.length;i++)
    {
      if(a[i]==key)
      { System.out.println("Element found at position: "+(i+1));
        flag=true;
        break;
      }
    }

    if(flag==false)
    System.out.println("Element not found");

  }
}
