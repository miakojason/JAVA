class Parent { // 父類別
  int i = 10;

  void Show() {
     System.out.println("i：" + i);
  }
}

class Child extends Parent { // 子類別
  int i = 20; // 同名成員

  void Show() { // 重新定義Show
    System.out.println("i：" + i);
    super.Show(); // 叫用父類別的方法
  }
}

public class CallParentMethod {
  public static void main(String[] argv) {
    Child c = new Child(); // 產生子類別的物件
    c.Show();
  }
}
