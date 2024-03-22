import java.io.IOException;
import java.util.Scanner;

public class iphoneInfoSwitch {
  public static void main(String[] args) throws IOException {

    System.out.print("請輸入序號中的第四碼 ->");
    Scanner sc = new Scanner(System.in);
    String year = sc.next();
    year = year.toUpperCase();  // 先將字串轉為大寫

    System.out.print("您的 iPhone 製造年份是在 ");

    switch (year){
      case "M": case "N":
        System.out.println("2014 年"); 
        break;
      case "P": case "Q":
        System.out.println("2015 年");
        break;
      case "R": case "S":
        System.out.println("2016 年");
        break;
      case "T": case "V":
        System.out.println("2017 年");
        break;
      case "W": case "X":
        System.out.println("2018 年");
        break;
      case "Y": case "Z":
        System.out.println("2019 年");
        break;
      case "C": case "D":
        System.out.println("2020 年");
        break;
      case "F": case "G":
        System.out.println("2021 年");
        break;
      default:
        System.out.println("您輸入的序號有誤");
    }
  }
}
