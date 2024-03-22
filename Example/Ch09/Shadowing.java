class Test {
  int x = 10,y = 20;

  // 篶よ猭把计籔Θ跑计
  Test(int x,int y) {
    this.x = x;
    this.y = y;
  }
}

public class Shadowing {

  public static void main(String[] argv){
    Test a = new Test(30,50);
    System.out.println("Θ跑计x" + a.x);
    System.out.println("Θ跑计y" + a.y);
  }
}