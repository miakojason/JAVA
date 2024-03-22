public class SquareSumLoop {
  public static void main(String args[]) {

    int sum = 0; //儲存 1-10 平方和累計值

    for (int i=1;i<=10;i++) {  // 會重複執行區塊的內容 10 次
      sum  += i*i;
      System.out.println("1-" + i +" 的平方和為："+ sum);
    }
  }
}
