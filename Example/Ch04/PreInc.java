public class PreInc {
  public static void main(String[] argv) {
    int i = 2,j;
    j = (i++) + i + 5; // 後置遞增
    System.out.println("變數 i 的內容是：" + i);
    System.out.println("變數 j 的內容是：" + j);

    i = 2;
    j = (++i) + i + 5; // 前置遞增
    System.out.println("變數 i 的內容是：" + i);
    System.out.println("變數 j 的內容是：" + j);
  }
}
