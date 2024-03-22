class Point {
  public int x,y;
  public Point(int x,int y) {
    this.x = x;
    this.y = y;
  }
}

class Rectangle {
  Point upperleft;
  Point lowerright;

  // 完整版建構方法
  public Rectangle(Point upperleft,Point lowerright) {
    this.upperleft = upperleft;
    this.lowerright = lowerright;
  }

  // 不需參數的建構方法
  public Rectangle() {
     this(new Point(0,0),new Point(5,-5));
  }

  // 直接指定座標
  public Rectangle(int x1,int y1,int x2,int y2) {
    this(new Point(x1,y1),new Point(x2,y2));
  }

  // 正方形
  public Rectangle(Point upperleft,int length) {
     this(upperleft,new Point(upperleft.x + length,
             upperleft.y - length));
  }

  // 計算面積
  public int area() {
    return (lowerright.x - upperleft.x) *
            (upperleft.y - lowerright.y);
  }
}

public class OverloadConstructor {

  public static void main(String[] argv){
    Rectangle a = new Rectangle(0,0,5,-5);
    Rectangle b = new Rectangle(new Point(3,3),4);

    System.out.println("a的面積：" + a.area());
    System.out.println("b的面積：" + b.area());
  }
}
