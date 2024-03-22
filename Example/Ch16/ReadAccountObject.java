import java.io.*;

public class ReadAccountObject {

  public static void main(String[] argv)
                throws IOException, ClassNotFoundException {
    System.out.println("由檔案讀取帳戶資訊");

    ObjectInputStream ois =                 // 建立物件輸入串流
      new ObjectInputStream(new FileInputStream("AccountFile"));
    Account myAccount = (Account) ois.readObject();  // 讀入帳戶物件
    ois.close();                            // 關閉串流

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    try {
      while (true) { // 存、提款的迴圈
        System.out.print("\n您現在要(1)存款(2)提款→");
        int choice = Integer.parseInt(br.readLine());
        System.out.print("請輸入金額→");
        int money = Integer.parseInt(br.readLine());

        if(choice == 1) {       // 存款處理
          myAccount.deposite(money);
          System.out.print("存了" + money + " 元後, 帳戶還剩 ");
          System.out.println(myAccount.checkBalance() + " 元");
        }
        else if(choice == 2) {  // 提款處理
          myAccount.withdraw(money);
          System.out.print("領了" + money + " 元後, 帳戶還剩 ");
          System.out.println(myAccount.checkBalance() + " 元");
        }
      }  // 迴圈結束
    }
    catch (AccountError e) {
      System.out.println(e);
    }
  }
}
