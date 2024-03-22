public class PostInc {
  public static void main(String[] argv) {
    int i = 0,j;
    j = (i++) * 10; // 後置遞增
    System.out.println("變數 i 的內容是：" + i);
    System.out.println("變數 j 的內容是：" + j);

    i = 0;
    j = (++i) * 10; // 前置遞增
    System.out.println("變數 i 的內容是：" + i);
    System.out.println("變數 j 的內容是：" + j);
  }
}
