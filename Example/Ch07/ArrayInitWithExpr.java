public class ArrayInitWithExpr {
  public static void main(String[] argv) {
    int i = 4,j = 8;
    int[] a = {4, i, i + j};  // 使用運算式

    for(int k = 0;k < a.length;k++) {
      System.out.println("a[" + k + "] : " + a[k]);
    }
  }
}
