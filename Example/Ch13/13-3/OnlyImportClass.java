import flag.math.Rectangle;

public class OnlyImportClass {
  public static void main(String[] argv) {
    Rectangle r = new Rectangle(1,3,5,7);
    flag.math.Circle c = new flag.math.Circle(3,6,9);

    System.out.println(r.toString());
    System.out.println(c.toString());
  }
}
