public class AutoConversion {
  public static void main(String[] argv) {
    byte b = -2 * 3 + 1; // 右邊是 int
    int  i = b;          // 右邊是 byte
    System.out.println("變數 b 現在的內容：" + b);
    System.out.println("變數 i 現在的內容：" + i);
  }
}
