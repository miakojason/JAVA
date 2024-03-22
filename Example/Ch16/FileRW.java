import java.io.*;

public class FileRW {    
  public static void main(String[] args) throws IOException {
    Console c = System.console();
    
    File f = new File("a.txt");  // 建構一個名為 a.txt 的 File 物件
    if(f.exists())               // 如果檔案已存在則顯示訊息
      c.printf("複寫 a.txt\n");   
    
    // 以 File 物件來建立輸出物件
    PrintWriter pw = new PrintWriter(new FileWriter(f));
    pw.printf("Hello!\nBye.\n");   // 寫檔
    pw.flush(); pw.close();        // 存檔及關檔

    File d = new File("my");            // 建構名為 my 的物件
    d.mkdir();                      // 建新資料夾
    File f2 = new File(d, "b.txt"); // 建構名為 my\b.txt 的物件
    f.renameTo(f2);                 // 更改檔名為 my\b.txt
    
    // 以 File 物件來建立輸入物件
    BufferedReader br = new BufferedReader(new FileReader(f2));
    String s;
    c.printf("%s 的內容：\n", f2.toString());
    while((s = br.readLine()) != null)  // 每次讀取一行
      c.printf("%s\n", s);
    br.close();                    // 關檔
    f2.delete();                   // 刪檔
  } 
}