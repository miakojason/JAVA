import java.io.*;

public class WriteObject {

  public static void main(String args[]) throws IOException {

    System.out.println("請輸入要建立的學生成績檔檔名");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String filename = br.readLine();         // 取得檔名字串

    ObjectOutputStream os =                  // 建立物件輸出串流物件
      new ObjectOutputStream(new FileOutputStream(filename));

    String str = new String();
    int counter=0;

    do {
      counter++;

      System.out.print("請輸入學生姓名：");
      String name = br.readLine();

      System.out.print("請輸入英文分數：");
      str = br.readLine();
      short e = Short.parseShort(str);

      System.out.print("請輸入數學分數：");
      str = br.readLine();
      short m = Short.parseShort(str);

      System.out.print("請輸入 Java 分數：");
      str = br.readLine();
      short j = Short.parseShort(str);

      Student ss = new Student(name, e, m, j);

      os.writeObject(ss);    // 寫入物件資料

      System.out.print("還要輸入另一筆資料嗎 (y/n)：");
      str = br.readLine();
    } while (str.equalsIgnoreCase("Y")); // 回答 Y 即再執行一次迴圈

    os.flush();         // 若有尚未寫入的內容, 立即全部寫入串流中
    os.close();         // 關閉串流物件

    System.out.println("\n已寫入 " + counter +
                       " 筆學生資料至檔案 " + filename);
  }
}
