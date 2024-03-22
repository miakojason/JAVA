class TestA { // 測試類別
  int x = 3;  // 設定初始值

  void show() {
    System.out.println("x = " + x);
  }
}

class TestB {
  void changeTestA(TestA t,int newX) {
    t.x = newX; // 透過參照修改物件內容
  }
}

public class PassReference {
  public static void main(String[] argv){
    TestA a = new TestA();
    TestB b = new TestB();

    a.show();
    b.changeTestA(a,20); // 傳入物件參照
    a.show();
  }
}
