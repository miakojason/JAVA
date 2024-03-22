public class BitwiseLogical {
  public static void main(String[] argv) {
    byte i = 2;  // 0000_0010
    byte j = -2; // 1111_1110

    System.out.println("i | j¡G" + (i | j));
    System.out.println("i & j¡G" + (i & j));
    System.out.println("i ^ j¡G" + (i ^ j));
  }
}
