public class Parens {
  public static void main(String[] argv) {
    int i = 1 + 3 * 5 + 7; // ¥ýºâ 3*5
    System.out.println("1 + 3 * 5 + 7   = " + i);
		
    i = (1 + 3) * 5 + 7; // ¥ýºâ 1+3
    System.out.println("(1 + 3) * 5 + 7 = " + i);
		
    i = 1 + 3 * (5 + 7); // ¥ýºâ 5+7
    System.out.println("1 + 3 * (5 + 7) = " + i);
  }
}
