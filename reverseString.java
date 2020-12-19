public class reverseString {
  public static void main(String[] args) {

    //using string concatination operator
    String str="ABCD";
    System.out.println("String is: "+str);

    String rev="";
    int len=str.length();

    for(int i=len-1;i>=0;i--)
    {
      rev=rev+str.charAt(i);
    }
     
    System.out.println("Reverse string is: "+rev);

    //using characyrt array
    String str1="WXYZ";
    System.out.println("String is: "+str1);
    String rev1="";

    char a[]=str1.toCharArray();

    int len1=a.length;

    for(int i=len1-1;i>=0;i--)
    {
      rev1=rev1+a[i];
    }

    System.out.println("Reverse string is: "+rev1);

    //using string buffer class
    String str2="QWERTY";
    System.out.println("String is: "+str2);

    StringBuffer sb=new StringBuffer(str2);
   
    System.out.println("Reverse string is: "+ sb.reverse()); 

  }
}
