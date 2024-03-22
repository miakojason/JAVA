import java.util.Scanner; // 為輸入資料加上的程式

public class CheckOilScan {

  public static void main(String[] argv){

    System.out.println("請輸入目前所剩油量 (單位：公升)");
    System.out.print("→");

    // 為輸入資料加上的程式
    Scanner sc = new Scanner(System.in);
    
    int liter = sc.nextInt(); // 取得輸入資料,將輸入資料轉成整數

    if (liter < 2)
      System.out.println("油量已經不足, 該加油了！");

    System.out.println("祝您行車愉快。");
  }
}
