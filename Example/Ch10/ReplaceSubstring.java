public class ReplaceSubstring { 
        
  public static void main(String[] argv) {
    String a = "這是一個測試字串";
    StringBuffer b = new StringBuffer(a);

    // 刪除1個字元
    System.out.println(b.deleteCharAt(2));
    // 取代2個字元
    System.out.println(b.replace(1,3,"好像不是"));
  }
}
