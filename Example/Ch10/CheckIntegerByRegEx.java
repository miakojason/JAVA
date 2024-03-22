import java.io.*;

public class CheckIntegerByRegEx {
        
  public static void main(String[] argv) throws IOException {
     BufferedReader br =
       new BufferedReader(new InputStreamReader(System.in));

     String str;        // 記錄使用者輸入資料
     boolean isInteger; // 使用者輸入是否為整數
     do {
       isInteger = true;
       System.out.print("請輸入整數：");
       str = br.readLine(); // 讀取使用者輸入資料

       if(!str.matches("[0-9]+")) { // 不是整數
         System.out.println("您輸入的不是整數！");
         isInteger = false;
       }
     } while (!isInteger);
  }
}
