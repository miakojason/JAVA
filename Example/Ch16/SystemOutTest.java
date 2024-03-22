public class SystemOutTest {

  public static void main(String[] argv) {

    int[] a = {10,20,40,80,160};

    // 依序輸出所有元素的整數值、ASCII 碼對應的字元
    for(int i = 0;i < a.length;i++) {
      System.out.print("a[" + i + "]：" + a[i] + " ");
      System.out.write(a[i]);
      System.out.println();     // 換行
    }

    byte[] b = {7,32,7,32,7};
    System.err.println("\n接著輸出一串嗶聲");
    System.err.write(b, 0, b.length);
  }           // 從第 0 個元素開始輸出, 共輸出 b.length 個元素
}
