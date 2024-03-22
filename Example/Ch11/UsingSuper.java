class Circle {        // 圓
  private double x,y; // 圓心
  private double r;   // 半徑

  public void setCenter(double x,double y) {
    this.x = x;
    this.y = y;
  }

  public void setRadius(double r) {
    this.r = r;
  }

  Circle(double x,double y,double r) {  // Circle 的建構方法
    this.x = x;
    this.y = y;
    this.r = r;
  }

  public String toString() {     // 顯示資訊
    return "圓心：(" + x + "," + y + "), 半徑：" + r;
  }
}

class Cylinder extends Circle {
  private double h;

  Cylinder(double x,double y,double r,double h) {
    super(x,y,r);                // 呼叫父類別建構方法
    this.h = h;
  }
}

public class UsingSuper {
  public static void main(String[] argv) {
    Cylinder cr = new Cylinder(1,2,3,4);
    System.out.println(cr.toString());
  }
}
