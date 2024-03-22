class Parent {       // 父類別
  static int i = 10; // Parent 及其子類別物件共享

  void Show() {
    System.out.println("i：" + i);
  }
}

class Child extends Parent { // 子類別
  static int i = 20;         // Child 及其子類別物件共享

  void Show() {
     System.out.println("i：" + i);
     System.out.println("super.i：" + super.i);
  }
}

public class SuperStatic {
  public static void main(String[] argv) {
    Child c1 = new Child(); // 產生子類別的物件
    Child c2 = new Child(); // 產生子類別的物件

    c1.Show();
    c2.i = 80; // 更改的是 Child 類別內的 i
    c1.Show();

    Parent p = c1;
    System.out.println("p.i：" + p.i); // 取得父類別的成員
  }
}
