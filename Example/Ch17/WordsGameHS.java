import java.util.*;

public class WordsGameHS {

  public static void main(String args[]) {

    System.out.println("文字接龍遊戲, 不可用重複的詞");
    System.out.print("請輸入第一個詞：");
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    // 建立集合物件
    HashSet<String> words = new HashSet<>();

    while (true) {
      if (!words.add(str)) {
        System.out.println("失敗！這個詞已用過");
        break;
      }
      System.out.print("請輸入下一個詞：");
      str = sc.next();
    }

    System.out.println("\n輸入過的詞：" + words);
  }
}