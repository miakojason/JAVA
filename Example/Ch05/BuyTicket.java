import java.util.*;

public class BuyTicket {

  public static void main(String[] argv) {

    System.out.print("璶禦ぐ或布 (1.布 2.纔布 3.琍布)");

    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();

    switch(choice) {
      case 1:  // 布
        System.out.println("布 399 じ");
        break;
      case 2:  // 纔布
        System.out.println("纔布 199 じ");
        break;
      case 3:  // 琍布
        System.out.println("琍布 249 じ");
        break;
      default: // ㄤウ猵
        System.out.println("块岿粇");
    }
  }
}