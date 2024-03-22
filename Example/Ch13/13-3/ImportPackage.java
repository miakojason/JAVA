import flag.math.*;

public class ImportPackage {
  public static void main(String[] argv) {
    Rectangle r = new Rectangle(1,3,5,7);
    Cylinder c = new Cylinder(2,4,6,8);

    System.out.println(r.toString());
    System.out.println(c.toString());
  }
}
