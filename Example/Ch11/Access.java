class Parent { // 父類別
  public void Show() { // 最寬鬆, 沒有限制
    System.out.println("我是父類別");
  }
}

class Child extends Parent { // 子類別
  private void Show() {      // 變嚴格了！
    System.out.println("我是子類別");
  }
}

public class Access {
  public static void main(String[] argv) {
    Child c = new Child(); // 產生子類別的物件
    Parent p = c;          // 透過父類別的參照指向Child物件
    p.Show();              // 可以叫用嗎？
  }
}
