import java.io.*;

public class CheckID {
        
  public static void main(String[] argv) throws IOException {
    BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    String str;   // 記錄使用者輸入資料
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

    int[] letterNums = {10,11,12,13,14,15,16,
            17,34,18,19,20,21,22,
            35,23,24,25,26,27,28,
            29,32,30,31,33};

    str = str.toUpperCase();     // 先將第一個英文字母轉為大寫
    char letter = str.charAt(0); // 取出第一個字母
    // 將第一個字母查表後取代成數字
    str = letterNums[letter - 'A'] + str.substring(1);

    int total = str.charAt(0) - '0'; // 開始加總
    for(int i = 1;i < 10;i++) {
      total += (str.charAt(i) - '0') * (10 - i); // 依序加總
    }

    // 以10減去加總值之個位數後取個位數
    int checkNum = (10 - total % 10) % 10;

    //計算結果和最後一位數比較
    if(checkNum == (str.charAt(10) - '0')) {
      System.out.println("檢核通過");
    } else {
      System.out.println("檢核錯誤，請確實填寫");
    }
  }
}
