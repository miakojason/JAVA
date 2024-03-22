public class StringConstant {
        
  public static void main(String[] argv) {
    String a = "這是一個測試字串";
    String b = "這是一個測試字串";
    String c = new String("這是一個測試字串");

    System.out.println("a == b ?" + (a == b));
    System.out.println("b == c ?" + (b == c));
    System.out.println("a == c ?" + (a == c));
  }
}
