import java.util.*; // 為輸入資料加上的程式

public class CheckOilWrong {

  public static void main(String[] argv) {

    System.out.print("請輸入目前所剩油量 (單位：公升)：");

    Scanner sc = new Scanner(System.in); // 為輸入資料加上的程式
    int liter = sc.nextInt();  // 將輸入資料轉成整數

    if (liter < 2)      // 加大括號
      System.out.println("油量已經不足");
      System.out.println("該加油囉！");
                        // 結尾的大括號

    System.out.println("祝您行車愉快。");
  }
}
