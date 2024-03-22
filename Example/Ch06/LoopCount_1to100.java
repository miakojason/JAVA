public class LoopCount_1to100 {

  public static void main(String args[]) {

    int sum = 0, i; // 宣告累加值 sum 與迴圈變數 i

    for (i=1;i<=100;i++) { // 跑 100 次的 for 迴圈
      // 每跑一次迴圈就累加一次 i 值
      sum += i;

      // 每跑一次迴圈就輸出一次 sum 值
      System.out.println("目前累加值為" + sum);
    }
  }
}
