import java.util.*;

public class ModInput {
  public static void main(String[] argv) {
    int apple, people=7, q, r;

    System.out.print(people+"人分蘋果, 要分幾個蘋果？");
    Scanner sc = new Scanner(System.in);   // 由 System.in 取得輸入
    apple = sc.nextInt();   // 由輸入端取得一個整數,
                            // 並指定給 apple
    q = apple / people;  // 取商數
    r = apple % people;  // 取餘數

    System.out.println(people+"人分"+apple+"個蘋果,");
    System.out.println("每人分" + q + "個, 還剩" + r + "個");
  }
}
