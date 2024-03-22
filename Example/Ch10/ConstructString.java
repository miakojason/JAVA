public class ConstructString {

  public static void main(String[] argv) {

    char[] test = {'這','是','個','測','試','字','串'};
    String a = new String();         // ""
    String b = new String(test);     // "這是個測試字串"
    String c = new String(test,3,4); // "測試字串"
    String d = new String(b);        // "這是個測試字串"

    System.out.println("a：" + a);
    System.out.println("b：" + b);
    System.out.println("c：" + c);
    System.out.println("d：" + d);

    // d 是 b 的副本
    System.out.println("b == d ?" + (b == d));
  }
}
