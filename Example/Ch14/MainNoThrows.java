import java.io.*;

public class MainNoThrows {

  public static void main(String[] argv) {
                              // 不加上 throws IOException 了
    int[] secret = {65535,3001,1999,1496,119};
    System.out.println("本程式有 5 個神秘數字, 您要看第幾個？");
    System.out.print("→");

    int target;
    // 用 try 來進行讀取資料的動作
    try {
      BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine();
      target = Integer.parseInt(str); // 轉換為 int
    }
    // 捕捉 IOException 例外, 但其實沒做什麼處理
    catch (IOException e) {
      System.out.println("發生 IO 例外");
      target = 5;
    }

    if (target > secret.length)
      target = secret.length;

    System.out.println("第 " + target + " 個神秘數字是 "
                          + secret[target-1]);
  }
}
