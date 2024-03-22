class Shape {           // 代表圖形原點的類別
  protected double x,y; // 座標

  public Shape(double x,double y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "圖形原點：(" + x + ", " + y + ")";
  }
}

class Rectangle extends Shape {
  private double w,h;   // 矩形的寬與高

  public Rectangle(double x,double y,double w, double h) {
    super(x,y);         // 呼叫父類別建構方法
    this.w = w;
    this.h = h;
  }
}

class Circle extends Shape {
  private double r;     // 圓形半徑

  public Circle(double x,double y,double r) {
    super(x,y);         // 呼叫父類別建構方法
    this.r = r;
  }
}

class Cylinder extends Circle {
  private double h;     // 圓柱高度

  public Cylinder(double x,double y,double r,double h) {
    super(x,y,r);       // 呼叫父類別建構方法
    this.h = h;
  }
}

public class HieraInheri {
  public static void main(String[] argv) {
    Rectangle re = new Rectangle(3,6,7,9);
    Circle    ci = new Circle(5,8,7);
    Cylinder  cr = new Cylinder(4,2,6,3);

    System.out.println(re.toString());
    System.out.println(ci.toString());
    System.out.println(cr.toString());
  }
}
