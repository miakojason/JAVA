public class Append {   
        
  public static void main(String[] argv) {
    String a = "這是一個測試字串";
    StringBuffer b = new StringBuffer(a);
    System.out.println(b.append(20)); // 會更改字串
    System.out.println(b.append("字串內容已經變了"));
    System.out.println(b.append(b));
  }
}
