class Test {
  int x,y;

  // ぃㄣ把计篶よ猭
  Test() {
    x = 10;
    y = 20;
  }
}

public class NoArgument {

  public static void main(String[] argv){
    Test a = new Test();
    System.out.println("Θ跑计x" + a.x);
    System.out.println("Θ跑计y" + a.y);
  }
}