import java.io.*;

public class ConvertString {

  public static void main(String args[]) throws IOException {

    System.out.println("本程式會將各種進制的數字轉成十進位顯示");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      System.out.println("\n您要輸入的數字是什麼進位 (例如" +
                         " 8 進位就輸入 8, 輸入 0 結束程式) ");
      System.out.print("->");
      String str = br.readLine();

      try {     // 將所有將字串轉成數字的敘述都放在 try 區塊
        int radix = Integer.parseInt(str);  // 取得進位數字

        if (radix==0) break;    // 輸入 0 就跳出迴圈

        System.out.print("請輸入 " + radix + " 進位的數字：");
        str = br.readLine();

        long num = Long.parseLong(str,radix);  // 將字串轉成長整數
        System.out.println(radix + " 進位的 " + str +
                           " 轉成十進位表示：" + num);
      }
      catch (NumberFormatException e) { // 轉換時的字串格式不正確
                                        // 或轉出來的數字超出 long
                                        // 範圍就會引發此例外
        System.out.println("輸入格式錯誤或數值太大！");
      }
    }
  }
}
