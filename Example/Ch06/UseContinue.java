import java.util.*;

public class UseContinue {
  public static void main(String args[]) {

    // 宣告累加值 sum, 計算範圍 range, 迴圈變數 i
    int sum = 0, range, i;

    System.out.print("請輸入欲計算的奇數和範圍 (結尾數值)：");
    Scanner sc = new Scanner(System.in);
    range = sc.nextInt();

    // 由 1 開始, 每次加 1
    for (i=1; i<=range; i++) {
      if(i%2==0) continue;  // 若是偶數就跳到下一輪迴圈
      sum += i;             // 奇數才會被累加
    }
    System.out.println("1 到 "+range+" 的所有奇數和為 "+sum);
  }
}
