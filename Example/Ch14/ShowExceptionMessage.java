import java.io.*;

public class ShowExceptionMessage {

  public static void main(String[] argv) throws IOException{

    int[] secret = {65535,3001,1999,1496,119};
    System.out.print("本程式有 5 個神秘數字, 您要看第幾個？");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int target = Integer.parseInt(str); // 轉換為 int

    try {

      System.out.println("第 " + target + " 個神秘數字是 "
                          + secret[target-1]);
    }
    catch (ArrayIndexOutOfBoundsException e) {

      System.out.println("發生例外！");
      System.out.println("例外訊息是：" + e.toString());
      System.out.println("使用的陣列索引值是：" + e.getMessage());
    }
  }
}
