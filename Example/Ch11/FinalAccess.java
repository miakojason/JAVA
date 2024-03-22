class Parent { // 父類別
  static int i = 10;

  final void Show() {
    System.out.println("i：" + i);
  }
}

class Child extends Parent { // 子類別
  static int i = 20;

  void Show() { // 不能重新定義
    System.out.println("i：" + i);
  }
}

public class FinalAccess {
  public static void main(String[] argv) {
    Child c = new Child(); // 產生子類別的物件
  }
}
