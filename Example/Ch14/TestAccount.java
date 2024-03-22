import java.io.*;

class AccountError extends Exception { // 自訂的例外類別
  public AccountError(String message) { super(message); }
}

class Account  {         // 簡單的帳戶類別
  private long  balance; // 記錄帳戶餘額

  public Account(long money)  { balance = money; }

  // 存款的方法
  public void deposite(long money) throws AccountError {
    if (money <0)
      throw new AccountError("存款金額不可為負值");  // 拋出例外
    else
      balance += money;
  }

  // 提款的方法
  public void withdraw(long money) throws AccountError {
    if (money > balance)
      throw new AccountError("存款不足");  // 拋出例外
    else
      balance -= money;
  }

  public long checkBalance() { return balance; }  // 傳回餘額
}

public class TestAccount {

  public static void main(String[] argv) throws IOException {

    System.out.println("簡單帳戶模擬計算");
    System.out.println("開戶要先存100元");
    Account myAccount = new Account(100);

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str;

    try {
      while (true) { // 存、提款的迴圈
        System.out.print("\n您現在要(1)存款(2)提款→");
        str = br.readLine();
        int choice = Integer.parseInt(str);
        System.out.print("請輸入金額→");
        str = br.readLine();
        int money = Integer.parseInt(str);

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
