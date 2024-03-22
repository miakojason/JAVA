interface P1 { // 父介面
  int i = 20;

  void show();
}

interface P2 { // 父介面
  int i = 30;

  void show();
}

interface C extends P1,P2 { // 子介面
  void show(String s); // 多重定義的版本
}

public class SameMemberName implements C { // 實作介面
  public void show() { // 實作由P1與P2C繼承來的方法
    show("");
  }

  public void show(String s) { // 實作C中多重定義的方法
    System.out.println(s + "P1.i=" + P1.i + ", P2.i=" + P2.i);
  }

  public static void main(String[] argv) {
    SameMemberName s = new SameMemberName();
    s.show();
  }
}
