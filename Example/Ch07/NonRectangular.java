public class NonRectangular {
  public static void main(String[] argv) {
    int[][] a = new int[3][];

    a[0] = new int[2]; // 有2個元素
    a[1] = new int[4]; // 有4個元素
    a[2] = new int[3]; // 有3個元素

    System.out.println("a共有 " + a.length + "個元素。");

    for(int i = 0;i< a.length;i++) {
      System.out.println("a[" + i + "] 共有 " +
              a[i].length + "個元素。");
    }
  }
}
