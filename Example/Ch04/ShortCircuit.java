public class ShortCircuit {
  public static void main(String[] argv) {
    int i=3, j=4;
    System.out.println("使用 | 的運算結果：" +
      (true | (i++ == j))); // i++會執行
    System.out.println("運算後i的內容：" + i);

    i = 3;
    j = 4;
    System.out.println("使用 || 的運算結果：" +
      (true || (i++ == j))); // i++不會執行
    System.out.println("運算後i的內容：" + i);
  }
}
