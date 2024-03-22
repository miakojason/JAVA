import java.io.*;

public class IsPrime {
  public static void main(String args[]) throws IOException {

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

   while(true){                // 讓使用者可反復輸入新數值的迴圈
      System.out.print("請輸入要檢查的數 (輸入 0 結束)：");

      String str = br.readLine();
      int num = Integer.parseInt(str);
      if(num == 0) break;      // 若輸入 0 即跳出迴圈, 結束程式

      boolean isPrime = true;  // 表示數質是否為質數的布林值
      int range = num/2;  // 限定除數的範圍

      for (int i=2; i<=range; i++) {  // 做除法運算的迴圈
        if ((num%i) == 0) {      // 餘數為 0 表示可以整除
          if (isPrime == true) {
            isPrime = false;     // 非質數, 並輸出目前的除數
            System.out.print(num +" 不是質數, 可被 "+i);
          }
          else {                 // 輸出目前的除數
            System.out.print(" "+i);
          }
        }
      }
      // 檢查完畢, 依檢查結果輸出不同的訊息
      if (isPrime) {           // 若是質數, 即輸出該數值
         System.out.println(num +" 是質數");
      }
      else {
         System.out.println(" 整除");
      }
    }
  }
}
