public class Insert {   
        
  public static void main(String[] argv) {
    String a = "這是一個測試字串";
    StringBuffer b = new StringBuffer(a);

    System.out.println(b.insert(0,20)); // 插入到最開頭
    System.out.println(b.insert(3,"字串內容已經變了"));

    // 插入到尾端，等於append()
    System.out.println(b.insert(b.length(),b));
  }
}
