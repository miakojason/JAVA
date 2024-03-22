public class CastingError  {
  public static void main(String[] argv) {
    int i = 32768;
    System.out.println("i=" + i);
    short s = (short) i;  // int 強制轉型為 short
    System.out.println("s=" + s);
    byte b = (byte) s;   // short 強制轉型為 byte
    System.out.println("b=" + b);
  }
}
