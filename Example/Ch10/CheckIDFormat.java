import java.io.*;

public class CheckIDFormat {
        
 public static void main(String[] argv) throws IOException {
   BufferedReader br =
     new BufferedReader(new InputStreamReader(System.in));

   String str; // 記錄使用者輸入資料
   boolean isID; // 使用者輸入的格式是否正確
   do {
      isID = true;
      System.out.print("請輸入身份證字號：");
      str = br.readLine(); // 讀取使用者輸入資料

      if(!str.matches("[a-zA-Z]\\d{9}")) { // 不正確
         System.out.println(
                 "身份證字號應該是1個英文字母接著9個數字！");
         isID = false;
      }
   } while (!isID);
 }
}
