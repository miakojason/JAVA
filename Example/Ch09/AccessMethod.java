class Test {
  private int x,y; // 成員都是private

  public Test(int x,int y) {
    this.x = x;
    this.y = y;
  }

  // 成員x與y的存取方法
  public int getX() {return x;}
  public void setX(int x) {this.x = x;}
  public int getY() {return y;}
  public void setY(int y) {this.y = y;}
}

public class AccessMethod {

  public static void main(String[] argv){
    Test a = new Test(30,40);

    // 透過方法更改成員值
    a.setX(80);
    a.setY(80);

    // 透過方法取得成員值
    System.out.println("成員x：" + a.getX());
    System.out.println("成員y：" + a.getX());
  }
}