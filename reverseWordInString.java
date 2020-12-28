public class reverseWordInString {
  public static void main(String[] args) {

    //approach 1
    String s="welcome to java";
    System.out.println("String is: "+s);

    String[] words=s.split(" ");

    String reverseString="";

    for(String w:words)
    {
      String reverseword="";
      for(int i=w.length()-1;i>=0;i--)
      {
        reverseword=reverseword+w.charAt(i);
      }

      reverseString=reverseString+reverseword+" ";
    }

    System.out.println("Reverse of each word of string is: "+reverseString);

    //approach 2
    String s1="welcome to java";
    System.out.println("String is: "+s1);

    String[] words1=s1.split("\\s");

    String reverseword1="";

    for(String w1:words1)
    {
      StringBuilder sb=new StringBuilder(w1);
      sb.reverse();

      reverseword1=reverseword1+sb.toString()+" ";
    }

    System.out.println("Reverse of each word of string is: "+ reverseword1);
  }
}
