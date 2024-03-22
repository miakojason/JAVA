public class CompFloat {
  public static void main(String[] argv) {
    double a = 1.1 * 3;  // 1.1 * 3 = 3.3
    double b = 3.3 * 1;  // 3.3 * 1 = 3.3
    System.out.println("a == b ：" + (a == b)); // 『相等』比較
    System.out.println("a != b ：" + (a != b)); // 『不等』比較
    System.out.println("a =" + a);  // 輸出 a 的值
    System.out.println("b =" + b);  // 輸出 b 的值
  }
}
