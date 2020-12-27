public class countCharacter {
  public static void main(String[] args) {
    String s="basic java programs by rittik kumar";
    System.out.println("String is: "+s);
    int x=s.length();

    int y=s.replace("a","").length();

    int z=x-y;

    System.out.println("Number of occurences of a in string is: "+z);

  }
}
