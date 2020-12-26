public class removeJunk {
  public static void main(String[] args) {
    String s="rkrittik17@gmail.com";

    System.out.println("String before removing special characters: "+s);

    s=s.replaceAll("[^a-zA-Z0-9]", "");

    System.out.println("String after removing special characters: "+s);
  }
}
