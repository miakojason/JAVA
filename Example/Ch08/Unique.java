class Test { // 測試類別
  int x = 3; // 設定初始值

  void show() {
    System.out.println("x = " + x);
  }
}

public class Unique {

  public static void main(String[] argv){
    Test a,b,c;

    a = new Test();  // 建立 2 個物件並做比較
    b = new Test();
    System.out.println("a == b ? " + (a == b));

    c = b;           // 讓 c 和 b 參照到同一物件
    c.x = 10;
    System.out.println("c == b ? " + (c == b));
    System.out.print("a.");
    a.show();
    System.out.print("b.");
    b.show();
    System.out.print("c.");
    c.show();
  }
}