class Parent { // 父類別
  int i = 10;
}

class Child extends Parent { // 子類別
  int i = 20;
}

public class Member {
  public static void main(String[] argv) {
    Parent p = new Parent(); // 產生父類別的物件
    Child c = new Child();   // 產生子類別的物件
    System.out.println("p.i：" + p.i);
    System.out.println("c.i：" + c.i);
  }
}
