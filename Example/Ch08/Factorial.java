import java.util.*;

class Compute {
  long factorial(int x) { // 以遞迴計算階乘
    if(x == 0) return 1;

    // 呼叫自己計算 (x-1)!
    return x * factorial(x - 1);
  }
}

public class Factorial {

  public static void main(String[] argv)  {
    Compute c = new Compute();

    System.out.print("計算 x!, 請輸入 x->");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    System.out.println(x + "! = " + c.factorial(x));
  }
}
