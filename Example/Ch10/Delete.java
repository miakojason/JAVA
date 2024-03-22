public class Delete {   
        
  public static void main(String[] argv) {
    String a = "這是一個測試字串";
    StringBuffer b = new StringBuffer(a);

    System.out.println(b.delete(1,2)); // 刪除1個字元
    System.out.println(b.delete(0,3)); // 刪除3個字元
  }
}
