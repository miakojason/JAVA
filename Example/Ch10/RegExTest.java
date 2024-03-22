import java.util.*;

public class RegExTest {

  public static void main(String[] argv)  {
    Scanner sc = new Scanner(System.in);

    String pat; // 記錄使用者輸入樣式
    String str; // 記錄使用者輸入測試字串

    System.out.print("請輸入樣式：");
    pat = sc.next(); // 讀取樣式

    System.out.print("請輸入字串：");
    str = sc.next(); // 讀取字串

    if(str.matches(pat))    // 進行比對
      System.out.println("相符");
    else
      System.out.println("不相符");
  }
}
