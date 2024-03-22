class Test {
  private int i = 1; // 私有成員變數

  void modifyMember(int i) {
    this.i = i; // 類別中可以存取 i
  }

  void show() { // 類別中可以存取 i
    System.out.println("成員變數i：" + i);
  }
}

public class PrivateMember {

  public static void main(String argv[]) {
    Test a = new Test();

    a.show();
    a.modifyMember(20);
    a.show();
    a.i = 40; // 喔喔, i 是私有成員變數
  }
}