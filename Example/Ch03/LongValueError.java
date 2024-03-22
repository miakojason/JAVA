public class LongValueError {
  public static void main(String[] argv) {
    long l = 2_147_483_649;   //未指定為 long 數值, 編譯會出現錯誤
    System.out.println("變數l=" + l);
  }
}