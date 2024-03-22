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

  public String toString() {
    return "圓心：(" + x + ", " + y + "), 半徑：" + r;
  }
}

class Cylinder extends Circle { // 繼承 Circle 類別
  // 沒有自己的成員變數和方法
}

public class EmptyCylinder {
  public static void main(String[] argv) {
    Cylinder cr = new Cylinder();

    cr.setCenter(3,4);  // 呼叫繼承而來的方法
    cr.setRadius(5);
    System.out.println(cr.toString());
  }
}
