public class Priority {
  public static void main(String[] argv) {
    int i;
    i = 1 + 3 * 5 >> 1; // 計算順序 *, +, >>
    System.out.println("1 + 3 * 5 >> 1 結果為：" + i);
    i = 8 - 8 >> 1;     // 計算順序 -, >>
    System.out.println("8 - 8 >> 1 結果為：" + i);
  }
}
