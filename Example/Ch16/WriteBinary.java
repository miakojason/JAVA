import java.io.*;

public class WriteBinary {

  public static void main(String args[]) throws IOException {

    System.out.println("要建立的二元檔檔名");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String filename = br.readLine();         // 取得檔名字串
    DataOutputStream dout =
      new DataOutputStream (                 // 建構最上層的讀取串流
        new BufferedOutputStream(            // 包住下層的緩衝式串流
          new FileOutputStream(filename)));  // 最下層的檔案輸出串流

    for(int i=49;i>=38;i--) {        // 從 49 算到 38
      double hopeless = i;           // 計算 i 取 6 共有幾種組合

      for (int j=1 ; j<6; j++)       // 此部份在計算 i!/((i-6)! * 6!)
        hopeless = hopeless * (i-j); // 此處已將運算式簡化,
      hopeless = hopeless / 720;     // 並未真的算 i! 及 (i-6)!

      dout.writeInt(i);              // 寫入整數
      dout.writeDouble(hopeless);    // 寫入浮點數
    }

    System.out.println("共寫入 " + dout.size() + " 個位元組！");
    dout.flush();      // 寫入串流
    dout.close();      // 關閉串流
  }
}