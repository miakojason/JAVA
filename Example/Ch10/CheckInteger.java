import java.io.*;

public class CheckInteger {
        
 public static void main(String[] argv) throws IOException {
   BufferedReader br =
           new BufferedReader(new InputStreamReader(System.in));

   String str;        // 記錄使用者輸入資料
   boolean isInteger; // 使用者輸入是否為整數
   do {
      isInteger = true;
      System.out.print("請輸入整數：");
      str = br.readLine(); // 讀取使用者輸入資料

      for(int i = 0;i < str.length();i++) {
        char ch = str.charAt(i);   // 取出個別字元
        if(ch < '0' || ch > '9') { // 不是數字
          System.out.println("您輸入的不是整數！");
          isInteger = false;
          break;           // 已檢查出非數字，不需繼續
        }
      }
   } while (!isInteger);
 }
}
