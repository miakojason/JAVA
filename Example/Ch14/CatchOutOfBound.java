public class CatchOutOfBound {

  public static void main(String[] argv) {

    int[] a = {10,20,30,40};

    try {
      // 將可能引發錯誤的程式放在 try 的大括弧中
      for(int i = 0;i <= a.length;i++)
        System.out.println("a[" + i + "]：" + a[i]);
    } catch (ArrayIndexOutOfBoundsException e) {
    // 發生 ArrayIndexOutOfBoundsException 例外時,
    // 才會執行此大括弧中的程式碼

      System.out.println("發生例外：" + e);
      System.out.println("也就是超出陣列範圍了!");
    }

    System.out.println("這行程式還是會被執行！");
  }
}
