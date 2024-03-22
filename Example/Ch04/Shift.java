public class Shift {
  public static void main(String[] argv) {
    int i = 2; // 00000000000000000000000000000010
    System.out.println("2 >> 1 ¡G" + (i >> 1));
    System.out.println("2 << 1 ¡G" + (i << 1));
    System.out.println("2 >>> 1¡G" + (i >>> 1));

    i = -2;    // 11111111111111111111111111111110
    System.out.println("-2 >> 1 ¡G" + (i >> 1));
    System.out.println("-2 << 1 ¡G" + (i << 1));
    System.out.println("-2 >>> 1¡G" + (i >>> 1));
  }
}
