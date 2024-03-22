public class Expression {
  public static void main(String[] argv) {
    int i,j;
    j  = 10;
    i = ++j + 20 * 8 >> 1 % 6;
    System.out.println("變數 i 現在的內容：" + i);
  }
}