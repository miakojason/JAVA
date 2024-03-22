public class TwoDimArray {
  public static void main(String[] argv) {
    int[][] a = new int[3][4]; // 宣告2維陣列並配置空間

    System.out.println("a共有 " + a.length + "個元素。");

    for(int i = 0;i< a.length;i++) {
      System.out.println("a[" + i + "] 共有 " +
              a[i].length + "個元素。");
    }
  }
}
