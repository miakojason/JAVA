import java.io.*;

class AccountError extends Exception { // 自訂的例外類別
  public AccountError(String message) { super(message); }
}

class Account implements Serializable {
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
