import java.util.*;

public class StringChange {

  public static void main(String[] argv) {

    System.out.println("本程式會將字串中的英文字母大小寫互換");
    System.out.print("請輸入要轉換的字串(輸入 bye 結束)→");

    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()) {
      String str = sc.nextLine();
      if(str.equalsIgnoreCase("bye"))
        break;         // 輸入 "bye" 即結束迴圈

      char[] temp = str.toCharArray();  // 將字串轉成字元陣列

      try {
        for (int i=0;i<temp.length;i++)
          if (Character.isLetter(temp[i]) |
              Character.isWhitespace(temp[i]))
             if (Character.isLowerCase(temp[i]) )
               temp[i] = Character.toUpperCase(temp[i]);
             else
               temp[i] = Character.toLowerCase(temp[i]);
          else       // 遇到非英文字母, 即拋出例外
            throw new RuntimeException();
        System.out.println(temp);
      }
      catch (RuntimeException e) {
        System.out.println("字串中只能含英文字母");
      }
      finally {
        System.out.print("\n請輸入要轉換的字串");
        System.out.print("(輸入 bye 結束)→");
      }
    }
  }
}
