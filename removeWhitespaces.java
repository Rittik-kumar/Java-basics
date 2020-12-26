public class removeWhitespaces {
  public static void main(String[] args) {
    String s="Hello Myself Rittik Kumar ";
     
    System.out.println("String before removing Whitespaces: "+s);
    s=s.replaceAll("[\\s]", "");
    System.out.println("String before removing Whitespaces: "+s);
    
  }
}
