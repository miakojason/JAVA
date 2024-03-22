import java.util.*;

public class Food2Money {

  public static void main(String[] argv) {

    System.out.print(
        "點幾號餐 (1.炸雞餐 2.漢堡餐 3.起司堡餐 4.兒童餐)？");

    Scanner sc = new Scanner(System.in);
    int food = sc.nextInt();

    switch(food){
      case 1: // 炸雞餐價錢 109 元
        System.out.println("您點的餐點價錢為 109 元");
        break;
      case 2: // 漢堡餐和起司堡餐
      case 3: // 都是 99 元
        System.out.println("您點的餐點價錢為 99 元");
        break;
      case 4: // 兒童餐價錢為 69 元
        System.out.println("您點的餐點價錢為 69 元");
        break;
    }
  }
}