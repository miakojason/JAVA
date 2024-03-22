import java.util.*; // 為輸入資料加上的程式

public class CheckOilElseIf {

  public static void main(String[] argv) {

    System.out.print("請輸入目前所剩油量 (單位：公升)：");

    Scanner sc = new Scanner(System.in); // 為輸入資料加上的程式
    int liter = sc.nextInt();  // 將輸入資料轉成整數

    if (liter < 2) { // 條件 1
      // 敘述 1
      System.out.println("油量已經不足, 該去加油了！");
    }
    else if (liter < 10) { // 條件 2
      // 敘述 2
      System.out.println("油量尚足, 提醒您注意油表。");
    }
    else if (liter >= 10) { // 條件 3    
      // 敘述 3
      System.out.println("油量充足, 請安心上路");
    }

    System.out.println("祝您行車愉快。");
  }
}
