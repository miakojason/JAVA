import java.io.*;

public class ReplaceAll {
        
  public static void main(String[] argv) throws IOException {
    BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    String src; // 記錄使用者輸入資料
    String pat; // 記錄樣式
    String rep; // 記錄要取代的結果

    System.out.print("請輸入字串：");
    src = br.readLine(); // 讀取使用者輸入字串

    System.out.print("請輸入樣式：");
    pat = br.readLine(); // 讀取使用者輸入樣式

    System.out.print("請輸入要取代成：");
    rep = br.readLine(); // 讀取使用者輸入字串

    System.out.println(src.replaceAll(pat,rep));
  }
}
