public class Trim {

  public static void main(String[] argv) {
    String a = " 這是一個測試字串\t";
    System.out.print(a.trim());
    System.out.println("...定位字元不見了");
    System.out.print(a);
    System.out.println("...定位字元還在");
  }
}
