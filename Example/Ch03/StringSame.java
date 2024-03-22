public class StringSame {
  public static void main(String[] argv) {
    String s1;
    String s2;
    s1 = "這是我們新增的字串";
    s2 = s1;
    System.out.println("變數 s1 的內容是：" + s1);
    System.out.println("變數 s2 的內容是：" + s2);
    s2 = "現在改成這樣";
    System.out.println("變數 s1 的內容是：" + s1);
    System.out.println("變數 s2 的內容是：" + s2);
  }
}