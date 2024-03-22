public class Rate {
  public static void main(String args[]) {

    int money = 100_000; //借款金額
    double rate = 1.8; //年利率 %
    int lendingMonths = 12; // 借款期數
    int lendingYears = 3;

//  if ($j("#rdyear").val() == 0) {
//    lendingMonths = (CheckInt($j("#loanyear").val(), 0)) * 12;
//  } else {
//    lendingMonths = CheckInt($j("#loanmonth").val(), 0);
//  }

    rate = rate / 12; // 月利率

    double rate_100 = rate / 100;  // 利率換成成小數
    double buf_temp = 1;  // 本金
    for (int i = 0; i < lendingMonths; i++) {  // 計算複利計算本利和倍數
      buf_temp *= (1 + rate_100);
    }

    System.out.println("buf_temp=" + buf_temp);
    System.out.println("rate_100=" + rate_100);
    //System.out.println("寬限期後每月應還本息 " +  + "元");
    double buf_rate = (rate_100 * buf_temp) / (buf_temp - 1);
    double rtn_mon = money * buf_rate;
    rtn_mon = (rtn_mon + 0.49); //=>寬限期後每月應還本息
    System.out.println("寬限期後每月應還本息 " + rtn_mon  + "元");
  }
}
