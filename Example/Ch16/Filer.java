import java.io.*;

public class Filer {
  // 以下方法可依執行結果, 顯示成功或失敗的訊息
  static boolean go(String act, boolean isSucceed) {
    System.out.println(act + (isSucceed? " 成功" : " 失敗"));
    return isSucceed;
  }
  
  public static void main(String[] args) throws IOException {
    Console c = System.console();
    String s, name;
    File f, dir = new File("").getAbsoluteFile(); //取得目前所在
                                                      //  的絕對路徑
    c.printf("請輸入 [操作]+[檔名], 例如 na.txt 表示建立 a.txt。\n");
    c.printf("<n>建檔<m>建夾<r>改名<d>刪除<c>進夾<u>上層夾" + 
             "<l>目錄<x>結束：\n");
    while (true) {
      s = c.readLine("> ");
      if(s.length() == 0) s = "x";  // 輸入空白, 等同要結束程式
      name = s.substring(1).trim();
      f = new File(dir, name);  // 以路徑及名稱建構 File 物件
      switch(s.toLowerCase().charAt(0)) {
        case 'n':
          go("建檔 " + name, f.createNewFile());
          break;
        case 'm': 
          go("建資料夾 " + name, f.mkdir());
          break;
        case 'r': 
          s = c.readLine("請輸入新名稱：");
          go("改名 " + name, f.renameTo(new File(dir,s)));
          break;
        case 'd': 
          go("刪除 " + name, f.delete());
          break;
        case 'c': 
          if( go("進資料夾 " + f, f.isDirectory()) )
            dir = f;
          break;
        case 'u': 
          f = f.getParentFile(); // 取得上層資料夾, null 表失敗
          if( go("上層資料夾 " + f, f != null) )
            dir = f;
          break;
        case 'l':    
          c.printf("%s 的目錄列表\n", dir);
          for(String t : dir.list()) 
            c.printf("%s\n", t);
          break;
        case 'x':
          c.printf("結束\n");
          return; 
        default:
          c.printf("請輸入 [操作]+[檔名]。\n");
}}}}