interface P1 { // 父介面
  int i = 20;

  void showI();
}

interface P2 { // 父介面
  int j = 30;

  void showJ();
}

interface C extends P1,P2 { // 子介面
  void show();
}

public class MultipleInheritance implements C { // 實作介面
  public void showI() { // 實作由C繼承P1而來的方法
    System.out.println("變數 i 的內容：" + i);
  }

  public void showJ() { // 實作由C繼承P2而來的方法
    System.out.println("變數 j 的內容：" + j);
  }

  public void show() { // 實作C所定義的方法
    showI();
    showJ();
  }

  public static void main(String[] argv) {
    MultipleInheritance s = new MultipleInheritance();
    s.show();
  }
}
