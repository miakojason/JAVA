import java.util.*; // 為輸入資料加上的程式

public class CheckOilNestedIf {

  public static void main(String[] argv) {

    System.out.print("請輸入目前所剩油量 (單位：公升)：");

    Scanner sc = new Scanner(System.in); // 為輸入資料加上的程式
    int liter = sc.nextInt();  // 將輸入資料轉成整數

    if (liter >= 2) {  // 第 1 層 if 敘述
      if (liter < 5) { // 第 2 層 if 敘述
        System.out.println("油量尚足, 提醒您注意油表。");
      }
    }

    System.out.println("祝您行車愉快。");
  }
}