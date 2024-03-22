public class TestFinally {

  public static void main(String[] argv) {

    int[] a = {10,20,30,40};

    try {
      // 故意加以下兩行敘述, 以產生 ArithmeticException 例外
      int i=0;
      i = 100/i;

      for(int j = 0;j <= a.length;j++)
        System.out.println("a[" + j + "]：" + a[j]);
    }
    catch (IndexOutOfBoundsException e) {

      System.out.println("發生例外：" + e );
      System.out.println("也就是超出陣列範圍了!");
    }
    finally {
      System.out.println("不論如何這行程式都會被執行！");
    }

    System.out.println("這行不一定會被執行！");
  }
}