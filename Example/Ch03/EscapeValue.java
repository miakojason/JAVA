public class EscapeValue {
  public static void main(String[] argv) {
    char  ch = '\u5b57'; // 16 進位 5b57 是 '字' 的 Unicode 編碼
    System.out.println("變數 ch 的內容為：" + ch);
    
    ch = '\\';     // 反斜線 \
    System.out.println("變數 ch 的內容為：" + ch);
    
    ch = '\'';     // 引號 '
    System.out.println("變數 ch 的內容為：" + ch);
  }
}
