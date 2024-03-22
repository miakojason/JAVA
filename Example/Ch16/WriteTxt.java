import java.io.*;

public class WriteTxt {

  public static void main(String args[]) throws IOException {

    System.out.println("要建立的新檔案名稱 (路徑)");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String filename = br.readLine();           // 取得檔名字串
    FileWriter fw = new FileWriter(filename);  // 建立 FileWriter 物件

    System.out.print("請輸入字串：");
    String str = br.readLine();
    fw.write(str,0,str.length());      // 寫入文字字串
    fw.write('\n');                    // 寫入換行字元

    System.out.print("請輸入整數：");
    str = br.readLine();
    fw.write(str,0,str.length());      // 寫入整數字串
    fw.write('\n');                    // 寫入換行字元

    System.out.print("請輸入浮點數:");
    str = br.readLine();
    fw.write(str,0,str.length());       // 寫入浮點數字串

    fw.flush();         // 若有尚未寫入的內容, 立即全部寫入串流中
    fw.close();         // 關閉 FileWriter 串流物件

    FileReader fr = new FileReader(filename);  // 建立 FileReader 物件
    int ch;
    while ((ch=fr.read()) != -1)    // 在讀到 -1 之前, 持續讀取
      System.out.print((char)ch);   // 直接將讀到的文字輸出
    fr.close();
  }
}
