class Test {
  public static void print() { // static 方法
    System.out.println("呼叫 static 方法");
  }
}

public class StaticMethod {

  public static void main(String[] argv){
    Test.print(); // 透過類別名稱呼叫 static 方法
    Test a = new Test();
    a.print();    // 透過物件呼叫 static 方法
  }
}
