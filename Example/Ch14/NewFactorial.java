import java.io.*;

public class NewFactorial {

  public static void main(String args[]) throws IOException {

    long fact;  // 用來儲存階乘值的長整數

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    try {
      while (true) {
        System.out.println("請輸入一整數來計算階乘 (0 代表結束)");
        System.out.print("→");
        String str = br.readLine();
        int num = Integer.parseInt(str);

        if (num > 20)
          throw new ArithmeticException("指定數值超出範圍");
        else if (num == 0)
          throw new RuntimeException("程式結束！");

        System.out.print(num + "! 等於 ");

        for (fact=1;num>0;num--)   // 計算階乘值的迴圈
          fact = fact * num;       // 每輪皆將 fact 乘上 num

        System.out.println(fact + "\n");
      }
    } catch (RuntimeException e) {
      System.out.println(e);
    }

    System.out.println("謝謝您使用階乘計算程式。");
  }
}
