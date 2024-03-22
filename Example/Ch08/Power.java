import java.util.*;

class Recursive {
  long power(int x,int y) {
    if(y == 0)  // 0 次方即傳回 1
      return 1;
    return x * power(x, y-1);  // 呼叫自己計算 x 的 y-1 次方
  }
}

public class Power {
  public static void main(String[] argv) {
    Recursive m = new Recursive();

    Scanner sc = new Scanner(System.in);
    System.out.print("請輸入整數 x y (用空白分隔)：");
    int x = sc.nextInt(); // 可連續讀入用空白分隔的數字
    int y = sc.nextInt();

    System.out.println(m.power(x,y));
  }
}