class Parent { // 父類別
  int i = 10;

  Parent(int i) { // 建構方法
    this.i = i;
  }

  void Show() {
    System.out.println("i：" + i);
  }
}

class Child extends Parent { // 子類別
  Child() {    // 建構方法
    super(10); // 使用 super 呼叫父類別的建構方法
  }
}

public class NotConstructor {
  public static void main(String[] argv) {
    Child c = new Child(10); // 產生子類別的物件
  }
}
