class Parent { // 父類別
  int i = 10;
}

class Child extends Parent { // 子類別
  int i = 20;

  public void Show() {
    System.out.println("super.i：" + super.i);
    System.out.println("c.i：" + i);
  }
}

public class Super {
  public static void main(String[] argv) {
    Child c = new Child(); // 產生子類別的物件
    c.Show(); // 透過super保留字存取父類別同名成員
    Parent p = c;
    System.out.println("p.i：" + p.i);
  }
}
