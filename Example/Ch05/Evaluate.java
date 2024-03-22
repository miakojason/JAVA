import java.util.*; // 為輸入資料加上的程式

public class Evaluate {

  public static void main(String[] argv) {

    System.out.print("請輸入年度考績 (優、甲、乙、丙)：");

    Scanner sc = new Scanner(System.in); // 為輸入資料加上的程式
    String grade = sc.next();  // 取得字串

    switch (grade) {
      case "優":  // 當年度考績為優
        System.out.println("出國去玩");
        break; // 結束此 case
      case "甲":  // 當年度考績為甲
        System.out.println("買台手機犒賞自己");
        break; // 結束此 case
      case "乙":  // 當年度考績為乙
        System.out.println("去逛街放鬆心情");
        break; // 結束此 case
      case "丙":  // 當年度考績為丙
        System.out.println("準備上求職網站找工作");
        break; // 結束此 case
    }
  }
}