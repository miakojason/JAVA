import java.io.*;

public class CountEven {

  public static void main(String args[]) throws IOException {

    // 宣告累加值 sum 及計算範圍 range
    int sum = 0, range;

    System.out.print("請輸入欲計算的偶數和範圍(結尾數值)：");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    range = Integer.parseInt(str);

    int i=0;           // 宣告迴圈變數 i
    while (i<=range) { // 當 i 值大於 range 即停止執行的 while 迴圈
      sum += i;        // 每次進入迴圈時, 將 sum 的值加上 i
      i+=2;            // 每次都將 i 值加 2
    }
    System.out.println("1 到 "+range+" 的所有偶數和為 "+sum);
  }
}
