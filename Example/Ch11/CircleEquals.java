class Circle {
  private double x,y; // ¶ê¤ß
  private double r;   // ¥b®|
  
  public Circle(double x, double y, double r) {
    this.x = x; this.y = y; this.r = r;
  }

  public boolean equals(Object o) {
    if (o instanceof Circle)
      return x == ((Circle)o).x && y == ((Circle)o).y 
                                && r == ((Circle)o).r;
    else
      return false;
  }
}

public class CircleEquals {
  public static void main(String[] argv) {
    Circle c1 = new Circle(2,2,5); 
    Circle c2 = new Circle(2,2,5); 
    Circle c3 = new Circle(8,8,5); 
    System.out.println("c1 == c2    ¡G" + (c1 == c2));
    System.out.println("c1 equals c2¡G" + c1.equals(c2));
    System.out.println("c1 equals c3¡G" + c1.equals(c3));
  }
}