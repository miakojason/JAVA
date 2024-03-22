public class Associativity {
  public static void main(String[] argv) {
    int i = 8 / 2 / 2; // -> (8 / 2) / 2
    System.out.println("變數 i 現在的內容：" + i);
    
    i = 99 % 13 % 5;   // -> (99 % 13) % 5
    System.out.println("變數 i 現在的內容：" + i);
  }
}
