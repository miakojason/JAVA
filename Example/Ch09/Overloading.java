class Test {
  int x = 10,y = 20;

  // ㄢ把计篶よ猭
  Test(int initX,int initY) {
    x = initX;
    y = initY;
  }

  // 把计篶よ猭
  Test(int initX) {
    x = initX;
  }

  // ぃㄣ把计篶よ猭
  Test() {
  }

  void show() { // 陪ボΘ跑计よ猭
    System.out.println("Θ跑计x" + x);
    System.out.println("Θ跑计y" + y);
  }
}

public class Overloading {

  public static void main(String[] argv){
    Test a = new Test(30,50);
    Test b = new Test(60);
    Test c = new Test();

    a.show();
    b.show();
    c.show();
  }
}