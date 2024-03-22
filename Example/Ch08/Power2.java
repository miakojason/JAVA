import java.util.*;

class Recursive {
   long power(int x, int y) {
    if(y <= 0)   return 1;
    //if(y == 1)   return x;
    if(y%2==0)  // Ωよ琌案计
      return power(x, y/2)*power(x, y/2);     // ㊣
    // Ωよ琌计
    return x * power(x, y/2) * power(x, y/2); // ㊣
  }
}

public class Power2 {
  public static void main(String[] argv) {
    Recursive r = new Recursive();

    Scanner sc = new Scanner(System.in);
    System.out.print("叫块俱计 x y (ノフだ筳)");
    int x = sc.nextInt(); // 硈尿弄ノフだ筳计
    int y = sc.nextInt();

    System.out.println(r.power(x,y));
  }
}