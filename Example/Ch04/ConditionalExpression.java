public class ConditionalExpression  {
  public static void main(String[] argv) {
    int i,j = 17;
    i = (j % 2 == 1) ? 2 : j++ ;
    System.out.println("變數 i 現在的內容：" + i);
    System.out.println("變數 j 現在的內容：" + j);
  }
}
