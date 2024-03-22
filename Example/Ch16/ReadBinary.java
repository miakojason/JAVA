import java.io.*;

public class ReadBinary {

  public static void main(String args[]) throws IOException {

    System.out.println("請輸入存放機率資料的檔案名稱");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String filename = br.readLine();        // 取得檔名字串

    DataInputStream din =
      new DataInputStream (                 // 建構最上層的讀取串流
        new BufferedInputStream(            // 包住下層的緩衝式讀取串流
          new FileInputStream(filename)));  // 最下層的檔案輸出串流

    double hopeless;

    try {
      while (true) {
        System.out.print(din.readInt() + " 取 6 共有 " +
                         (hopeless = din.readDouble()) +
                         " 種排列組合,");
        System.out.println(" 猜中機率為 " + 1/hopeless);
        din.skipBytes (12);      // 每讀一筆記錄就跳過一筆記錄
      }                          // 整數佔 4 個, 浮點數佔 8 個位元組
    }
    catch (EOFException e) {        // 捕捉已到檔案結尾的例外
        din.close();                // 已到檔案結尾, 故關閉串流
    }
  }
}
