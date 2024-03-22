public class CompareTo {        
        
  public static void main(String[] argv) {
    String a = "abcd";
    System.out.println(a.compareTo("abcb"));
    System.out.println(a.compareTo("abcd"));
    System.out.println(a.compareTo("abce"));
    System.out.println(a.compareTo("abcde"));
    System.out.println(a.compareTo("Abcd"));
  }
}
