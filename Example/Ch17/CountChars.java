import java.io.*;

public class CountChars {

  public static void main(String args[]) throws IOException {

    System.out.print("請輸入一個句子");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    System.out.print("→");
    String str = br.readLine();
    int lt=0,di=0,sp=0;      // 宣告用來計算各類字元數量的變數

    for(int i=0;i<str.length();i++) {
      char ch = str.charAt(i);
      if (Character.isLetter(ch))          // 判斷是否為文字
        lt++;
      else if (Character.isDigit(ch))      // 判斷是否為數字
        di++;
      else if (Character.isWhitespace(ch)) // 判斷是否為空白
        sp++;
    }
    System.out.println("這個句子中, 共有 " + lt + " 個文字、 " +
                       di + " 個數字、 " + sp + " 個空白字元");
  }
}
