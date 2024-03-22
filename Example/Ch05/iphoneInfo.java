import java.io.*;
import java.util.Scanner;

public class iphoneInfo {
  public static void main(String[] args) throws IOException {

    System.out.print("請輸入序號中的第四碼 ->");
    Scanner sc = new Scanner(System.in);
    String year = sc.next();    
    year = year.toUpperCase();  // 先將字串轉為大寫
    
    System.out.print("您的 iPhone 製造年份是在 ");

    if (year.equals("M") || year.equals("N"))
      System.out.println("2014 年");
    else if (year.equals("P") || year.equals("Q"))
      System.out.println("2015 年");
    else if (year.equals("R") || year.equals("S"))
      System.out.println("2016 年");
    else if (year.equals("T") || year.equals("V"))
      System.out.println("2017 年");
    else if (year.equals("W") || year.equals("X"))
      System.out.println("2018 年");
    else if (year.equals("Y") || year.equals("Z"))
      System.out.println("2019 年");
    else if (year.equals("C") || year.equals("D"))
      System.out.println("2020 年");
    else if (year.equals("F") || year.equals("G"))
      System.out.println("2021 年");
    else
      System.out.println("您輸入的序號有誤");
  }
}
