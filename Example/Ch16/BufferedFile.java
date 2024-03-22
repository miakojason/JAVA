import java.io.*;

public class BufferedFile {

  public static void main(String args[]) throws IOException {

    System.out.println("要建立的通訊錄檔名");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String filename = br.readLine();           // 取得檔名字串
    BufferedWriter bw  =                       // 建立緩衝式讀取物件
      new BufferedWriter(new FileWriter(filename));
    String str = new String();

    do {
      System.out.print("請輸入姓名：");

      str = br.readLine();
      bw.write(str,0,str.length());    // 寫入姓名
      bw.write('\t');                  // 寫入定位 (tab) 字元

      System.out.print("請輸入電話號碼：");

      str = br.readLine();
      bw.write(str,0,str.length());    // 寫入電話號碼
      bw.newLine();                    // 換行, 在 Windows 平台上
                                       // 相當於寫入換行及歸位字元
      System.out.print("還要輸入另一筆資料嗎 (y/n)：");
      str = br.readLine();
    } while (str.equalsIgnoreCase("Y")); // 回答 Y/y 即再執行一次迴圈

    bw.flush();         // 若有尚未寫入的內容, 立即全部寫入串流中
    bw.close();         // 關閉 FileWriter 串流物件

    System.out.println("\n已將資料寫入檔案 " + filename);
    System.out.print("您想立即檢視檔案內容嗎 (y/n)：");
    str = br.readLine();

    if (str.equalsIgnoreCase("Y")) {  // 回答 Y/y 即顯示檔案內容
      BufferedReader bfr =            // 建立 BufferedReader 物件
        new BufferedReader(new FileReader(filename));
      while ((str = bfr.readLine()) != null) // 讀到空字串前持續讀取
        System.out.println(str);             // 輸出讀到的一整行
      bfr.close();
      }
  }
}
