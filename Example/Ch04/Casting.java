public class Casting {
  public static void main(String[] argv) {
    byte i = -2;
    i  = (byte) (i >> 1);
    System.out.println("變數 i 現在的內容：" + i);
  }
}
