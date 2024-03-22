public class ConditionPromotion  {
  public static void main(String[] argv) {
    byte b = 1;
    int i = 2;
    b = (i == 2) ? b : i;
    System.out.println("變數 i 現在的內容：" + i);
    System.out.println("變數 b 現在的內容：" + b);
  }
}
