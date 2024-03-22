import java.io.*;

public class NRoot {

  public static void main(String args[]) throws IOException {

    System.out.println("要求幾次方根");
    System.out.print("限輸入整數→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    try {
      int n = Integer.parseInt(str);
      System.out.println("要求什麼數的 " + str +" 次方根");
      System.out.print("(需大於零)→");

      str = br.readLine();
      double y = Math.abs(       // 用絕對值方法取正值
                      Double.parseDouble(str));
      System.out.printf("%f的%d次方根為%f",y,n, Math.pow(y, 1.0/n));
    }
    catch (NumberFormatException e) {
      System.out.println("輸入格式錯誤");
    }
  }
}
