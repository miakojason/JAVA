class Point {   // 點
  private double x,y;

  public void setX(double x) { this.x = x; }
  public void setY(double y) { this.y = y; }

  public String toString() {   // 將物件資訊轉成字串的方法
    return "(" + x + "," + y + ")";
  }

  public Point(double x, double y) {   // 建構方法
    this.x = x; this.y = y; 
  }
}

class Circle {       // 圓
  private Point p;   // 圓心
  private double r;  // 半徑

  public Point getP() { return p; } // 直接傳回成員物件

  public String toString() {   // 將物件資訊轉成字串的方法
    return "圓心：" + p.toString() + " 半徑：" + r;
  }

  Circle(double x,double y,double r) {   // 建構方法
    p = new Point(x,y);
    this.r = r;
  }
}

public class SettingPrivateMember {
  public static void main(String[] argv) {
    Circle c = new Circle(3,4,5);  // 圓心 (3,4), 半徑 5

    Point p = c.getP();            // 取得圓心
    p.setX(6);                     // 變更圓心座標
    System.out.println(c.toString());
  }
}
