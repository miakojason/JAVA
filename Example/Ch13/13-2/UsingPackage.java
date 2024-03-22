public class UsingPackage {
  public static void main(String[] argv) {
    flag.Rectangle re = new flag.Rectangle(1,3,5,7);
    flag.Circle    ci = new flag.Circle(3,6,9);
    flag.Cylinder  cr = new flag.Cylinder(2,4,6,8);

    System.out.println(re.toString());
    System.out.println(ci.toString());
    System.out.println(cr.toString());
  }
}
