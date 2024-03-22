public class SetCharAt {        
        
  public static void main(String[] argv) {
    String a = "這是一個測試字串";
    StringBuffer b = new StringBuffer(a);

    b.setCharAt(2,'二');
    System.out.println(b); // 字串內容已經變了
  }
}
