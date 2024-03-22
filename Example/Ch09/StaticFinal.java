class Test {
  static final int x = 10;
}

public class StaticFinal {

  public static void main(String[] argv){
    Test a = new Test();
    a.x = 20;   // x 是final，不能更改
  }
}
