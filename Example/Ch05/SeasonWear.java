import java.util.*;

public class SeasonWear {

  public static void main(String[] argv) {

    System.out.print("請輸入季節 (1.春 2.夏 3.秋 4.冬)：");

    Scanner sc = new Scanner(System.in); // 為輸入資料加上的程式
    int season = sc.nextInt();   // 取得整數

    switch (season) {
      case 1:  // 當 season 的數值為 1
        System.out.println("請穿著長袖出門");
               // 少了 break
      case 2:  // 當 season 的數值為 2
        System.out.println("請穿著短袖出門");
        break; // 結束此 case
      case 3:  // 當 season 的數值為 3
        System.out.println("請加件長袖輕薄外套出門");
        break; // 結束此 case
      case 4:  // 當 season 的數值為 4
        System.out.println("請穿著毛衣或大衣出門");
        break; // 結束此 case
    }
  }
}