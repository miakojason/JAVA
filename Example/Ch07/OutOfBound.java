public class OutOfBound {
  public static void main(String[] argv) {
    int[] a; // 宣告陣列變數
    a = new int[4]; // 配置陣列

    a[1] = 10; // 放入內容
    a[2] = 10;
    a[3] = 10;
    a[4] = 10;

    // 取出內容並顯示
    for(int i = 1;i <= a.length;i++) {
      System.out.println("a[" + i + "]：" + a[i]);
    }
  }
}
