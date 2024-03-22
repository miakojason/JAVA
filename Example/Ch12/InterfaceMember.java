interface Surfacing {
  double area();        // 計算面積的方法
  double PI = 3.14159;  // 定義常數
}

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

class Circle extends Shape implements Surfacing {
  private double r;     // 圓形半徑

  public Circle(double x,double y,double r) {
    super(x,y);         // 呼叫父類別建構方法
    this.r = r;
  }

  public double area() {// 計算圓面積
    return PI*r*r;
  }

  public String toString() {
    return "圓心：(" + x + ", " + y + ")、半徑：" + r +
           "、面積：" + area();
  }
}

public class InterfaceMember {
  public static void main(String[] argv) {
    Circle c = new Circle(3,6,2);
    System.out.println(c.toString());
    System.out.println("圓周率：" + Surfacing.PI);
    System.out.println("圓周率：" + c.PI);
  }
}
