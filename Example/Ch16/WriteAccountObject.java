import java.io.*;

public class WriteAccountObject {

  public static void main(String[] argv) throws IOException {

    System.out.print("簡單帳戶模擬計算, ");
    System.out.println("開戶要存多少錢？");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    Account myAccount =                 // 以輸入金額為建構方法參數
         new Account(Integer.parseInt(br.readLine()));

    ObjectOutputStream oos =            // 建立物件輸出串流物件
      new ObjectOutputStream(new FileOutputStream("AccountFile"));

    oos.writeObject(myAccount);         // 寫入物件
    oos.flush();
    oos.close();

    System.out.println("已將帳戶資訊存至檔案 AccountFile！");
  }
}
