import java.io.*;

public class ReadTxtFile {

  public static void main(String args[]) throws IOException {

    System.out.println("要讀取的檔案名稱 (路徑)");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();           // 取得檔名字串
    FileReader fr = new FileReader(str);  // 建立 FileReader 物件

    System.out.println("\n以下是文字檔 " + str + " 的內容：");
    int ch;
    while ((ch=fr.read()) != -1)    // 在讀到 -1 之前, 持續讀取
      System.out.print((char)ch);   // 直接將讀到的文字輸出

    fr.close();
  }
}
