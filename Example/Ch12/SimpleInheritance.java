interface P { // 父介面
  int i = 20;

  void show();
}

interface C extends P { // 子介面
  int getI();
}

public class SimpleInheritance implements C { // 實作介面
  public void show() { // 實作由 C 繼承 P 而來的方法
    System.out.println("變數 i 的內容：" + i);
  }

  public int getI() { // 實作 C 所定義的方法
    return i;
  }

  public static void main(String[] argv) {
    SimpleInheritance s = new SimpleInheritance();
    s.show();
  }
}
