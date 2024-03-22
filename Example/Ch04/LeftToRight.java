public class LeftToRight  {
  public static void main(String[] argv) {
    int i = 3,j = 3,k ;
    k = i+++j; // -> k = (i++) + j
    System.out.println("變數 i 現在的內容：" + i);
    System.out.println("變數 j 現在的內容：" + j);
    System.out.println("變數 k 現在的內容：" + k);
  }
}
