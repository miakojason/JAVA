class Test {
  public int x;            // 個別物件擁有一份
  public static int y;     // 所有此類別物件共享

  public Test(int x,int y) {  // 具有參數的建構方法
    this.x = x;
    this.y = y;
  }

  public String toString() {  // 轉成字串
    return "(x,y):(" + x + "," + y + ")";
  }
}

public class AccessByClass {

  public static void main(String[] argv){
    Test a = new Test(100,40);
    Test b = new Test(200,50);
    Test c = new Test(300,60);
    Test.y = 100;        // 透過類別名稱存取 static 成員
    System.out.println("物件a" + a);
    System.out.println("物件b" + b);
    System.out.println("物件c" + c);
  }
}
