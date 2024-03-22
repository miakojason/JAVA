import java.io.*;

public class SystemInTest {

  public static void main(String args[]) throws IOException {

    System.out.print("計算 2 的 N 次方, 請輸入次方值：");

    char ch = (char) System.in.read();   // 用 read() 讀取並轉成字元
    String str = Character.toString(ch); // 將讀到的字元轉成字串
    double pow = Double.parseDouble(str);
    System.out.println("2 的 " + pow + " 次方等於 " +
                        Math.pow(2,pow));

    System.out.print("\n再算一次 2 的 N 次方, 請輸入次方值：");
    byte[] b = new byte[10];
    System.in.read(b);          // 改用 read(byte[]) 讀取
    pow = Double.parseDouble(new String(b));
                  // 將位元陣列轉成字串, 再轉成 double
    System.out.println("2 的 " + pow + " 次方等於 " +
                        Math.pow(2,pow));
  }
}
