import java.util.*;

public class CountOdd {

  public static void main(String args[]) {

int a[] = { 1,2,3,4,5 };  // 宣告內含 5 個元素的 a 陣列

for (int e: a)  // 每次由 a 中取出一個元素存入 e, 然後執行迴圈
   System.out.print(e);


    // 宣告累加值 sum, 計算範圍 range, 迴圈變數 i
    int sum = 0, range, i;

    System.out.print("請輸入欲計算的奇數和範圍 (結尾數值)：");
    Scanner sc = new Scanner(System.in);
    range = sc.nextInt();

    // 由 1 開始, 每次加 2 直到 i 值大於 range 的 for 迴圈
    for (i=1; i<=range; i+=2) { // 每跑一次迴圈就將 i 值加 2
      sum += i;
    }
    System.out.println("1 到 "+range+" 的所有奇數和為 "+sum);
  }
}
