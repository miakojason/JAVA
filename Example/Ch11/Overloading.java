class Parent { // 父類別
  void Show() {
    System.out.println("我是父類別");
  }
}

class Child extends Parent { // 子類別
  void Show(String str) {    // 與父類別的 show() 參數不同
    System.out.println(str);
  }
}

public class Overloading {
  public static void main(String[] argv) {
    Child c = new Child(); // 產生子類別的物件
    c.Show();              // 呼叫父類別中定義的方法
    c.Show("這是子類別");
  }
}
