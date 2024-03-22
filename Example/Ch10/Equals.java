public class Equals {
        
  public static void main(String[] argv) {
    String a = "這是一個測試字串";
    String b = "這是一個測試字串";
    String c = new String("這是一個測試字串");

    System.out.println(a.equals(b));
    System.out.println(b.equals(c));
    System.out.println(a.equals(c));
  }
}
