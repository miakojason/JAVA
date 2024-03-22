class Test {
  public int x;        // 個別物件擁有一份
  public static int y; // 所有此類別物件共享

  public Test(int x) { // 建構方法只設定 x 的值
    this.x = x;
  }

  public String toString() {  // 轉成字串
    return "(x,y):(" + x + "," + y + ")";
  }
}

public class ClassVar {

  public static void main(String[] argv){
    Test.y = 100;      // 尚未建立物件即存取 static 成員變數
    Test a = new Test(100);
    Test b = new Test(200);
    Test c = new Test(300);
    System.out.println("物件a" + a);
    System.out.println("物件b" + b);
    System.out.println("物件c" + c);
  }
}
