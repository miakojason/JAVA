import java.util.*; // 為輸入資料加上的程式

public class Parcel {

  public static void main(String[] argv) {
    System.out.print("估算宅配費用, 包裏大小幾公分(長+寬+高)？");

    Scanner sc = new Scanner(System.in); // 為輸入資料加上的程式
    int size = sc.nextInt();  // 將輸入資料轉成整數

    if (size <= 100) { // 條件 1
      System.out.println("150元");
    }
    else if (size <= 150) { // 條件 2
      System.out.println("200元");
    }
    else if (size <= 200) { // 條件 3
      System.out.println("250元");
    }
    else { // 前 3 個條件都不成立的話
      System.out.println("請聯絡客服人員!");
    }
  }
}
