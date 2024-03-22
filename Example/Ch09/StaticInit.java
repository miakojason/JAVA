class Test {
  public int x; // 個別物件擁有一份
  public static int y; // 所有此類別物件共享

  static { // static初始區塊
    y = 100;
  }

  // 具有參數的建構方法
  public Test(int x) {
    this.x = x;
  }

  // 轉成字串
  public String toString() {
    return "(x,y):(" + x + "," + y + ")";
  }
}

public class StaticInit {

  public static void main(String[] argv){
    System.out.println(Test.y);
    Test a = new Test(100);
    Test b = new Test(200);
    Test c = new Test(300);
    System.out.println("物件a" + a);
    System.out.println("物件b" + b);
    System.out.println("物件c" + c);
  }
}
