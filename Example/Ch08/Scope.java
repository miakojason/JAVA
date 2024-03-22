public class Scope {
  public static void main(String[] argv){
    int x = 1;
    {
      int y = 20;
      {
        int z = 300;

        System.out.print("x = " + x); // 最外層的x
        System.out.print("\ty = " + y); // 上一層的y
        System.out.println("\tz = " + z);
        System.out.println("");
      }
      int z = 40;

      System.out.print("x = " + x); // 最外層的x
      System.out.print("\ty = " + y);
      System.out.println("\tz = " + z);
      System.out.println("");
    }

    int y = 2;
    int z = 3;
    System.out.print("x = " + x);
    System.out.print("\ty = " + y);
    System.out.println("\tz = " + z);
  }
}