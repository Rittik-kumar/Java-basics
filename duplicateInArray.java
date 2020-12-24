public class duplicateInArray {
  public static void main(String[] args) {
    String a[]={"java","C","C++","Python","java"};

    boolean x=false;
    for(int i=0;i<a.length;i++)
    {
       for(int j=i+1;j<a.length;j++)
       {
         if(a[i]==a[j])
         { System.out.println("Found duplicate element: "+a[i]);
           x=true;
          } 
        }
    }
    if(x==false)
      System.out.println("Duplicate element not found");
  }
}
