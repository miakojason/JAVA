import java.io.*;

public class FloorCeil {

  public static void main(String args[]) throws IOException {

    System.out.print("示範 Math 類別近似值方法的程式, ");
    System.out.print("請輸入一個數值：");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    double test = Double.parseDouble(str);  // 取得數值

    // 依序呼叫各近似值方法並輸出結果
    System.out.println("floor(" + test + ") = " + Math.floor(test));
    System.out.println(" ceil(" + test + ") = " + Math.ceil(test));
    System.out.println(" rint(" + test + ") = " + Math.rint(test));

    System.out.println("long round(" + test + ") = " +
                       Math.round(test));
    System.out.println(" int roung(" + (float)test + ") = " +
                       Math.round((float)test));
  }
}
