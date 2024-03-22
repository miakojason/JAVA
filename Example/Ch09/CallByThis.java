class Test {
  int x = 10,y = 20;

  // 具有參數的建構方法
  Test(int x,int y) {
    this(x); // 呼叫另一個建構方法
    this.y = y;
  }

  Test(int x) {
          this.x = x;
  }
}

public class CallByThis {

  public static void main(String[] argv){
    Test a = new Test(30,50);
    System.out.println("成員x：" + a.x);
    System.out.println("成員y：" + a.y);
  }
}