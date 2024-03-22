import java.io.*;

public class Catch2Except {

  public static void main(String[] argv) throws IOException{

    int[] secret = {65535,3001,1999,1496,119};
    System.out.print("本程式有 5 個神秘數字, 您要看第幾個？ ");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int target = 0;

    try {
      target = Integer.parseInt(str); // 轉換為 int
      System.out.println("第 " + target + " 個神秘數字是 "
                          + secret[target-1]);
    } catch (ArrayIndexOutOfBoundsException |
             NumberFormatException e) {
      System.out.println("對不起, 輸入錯誤。");
      System.out.println("請確認您輸入 1-5 之間的數字。");
    }
    System.out.println("歡迎再次使用！");
  }
}
