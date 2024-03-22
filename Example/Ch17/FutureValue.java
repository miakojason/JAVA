import java.io.*;

public class FutureValue {

  public static void main(String args[]) throws IOException {

    System.out.println("計算長期儲蓄的本利和");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("請輸入定存利息 (%)：");
    String str = br.readLine();
    float rate = Float.parseFloat(str);  // 取得利息

    System.out.print("要存幾年？：");
    str = br.readLine();
    int year = Integer.parseInt(str);  // 取得年數

    final int pv = 1_000_000;  // 本金定為一百萬
    System.out.println("\n"+ pv + " 元以利率 " + rate  +
                       " % 存 " +year + " 年");
    System.out.printf("以複利計算, 到期時的本利和為 %.1f 元",
                       pv * Math.pow(1+rate/100, year));
  }
}
