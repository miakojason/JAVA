class Test {
  int x,y;

  // ㄣΤ把计篶よ猭
  Test(int initX,int initY) {
    x = initX;
    y = initY;
  }
}

public class WithArgument {

  public static void main(String[] argv){
    Test a = new Test(30,40);
    System.out.println("Θ跑计x" + a.x);
    System.out.println("Θ跑计y" + a.y);
  }
}