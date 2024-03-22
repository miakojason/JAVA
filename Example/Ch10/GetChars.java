public class GetChars { 
        
  public static void main(String[] argv) {
    String a = "這是一個測試字串";
    char[] chars = new char[4];
    a.getChars(1,5,chars,0);
    System.out.println(new String(chars));
  }
}