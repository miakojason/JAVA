import java.io.*;

public class Factorial {
  public static void main(String args[]) throws IOException {

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    while(true) {
      System.out.println("請輸入 1-170 間的整數來計算階乘");
      System.out.print("(輸入 0 即結束程式)：");
      String str = br.readLine();
      int num = Integer.parseInt(str);
      if (num == 0)
        break;          // 若使用者輸入 0, 就跳出迴圈
      else if (num>170)
        continue;       // 若輸入大於 170, 則重新輸入

      System.out.print(num + "! 等於 ");

      double fact;            // 用來儲存、計算階乘值的變數
      for(fact=1;num>0;num--) // 計算階乘的迴圈
        fact *= num;          // 每輪皆將 fact 乘上目前的 num

      System.out.print(fact + "\n\n"); // 輸出計算所得的階乘值
    }
  }
}
