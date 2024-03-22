import java.io.*;
import java.util.*;

public class EasyDict {

  TreeMap<String, String> dict;  // 儲存字典內容

  public EasyDict() throws IOException {
    dict = new TreeMap<>();                // 建立 TreeMap 物件
    String enword,chword;                  // 字典檔為 "dict.txt"
    Reader r = new BufferedReader(new FileReader("dict.txt"));
    StreamTokenizer fr = new StreamTokenizer(r);
                          // 用 StreamTokenizer 讀取串流中的『字符』
                                               // 讀到檔案結尾前
    while (fr.nextToken()!=StreamTokenizer.TT_EOF) { // 持續讀取
      enword = fr.sval;    // 取得英文單字
      if (fr.nextToken()!=StreamTokenizer.TT_EOF) {
        chword = fr.sval;  // 取得中文解釋
        dict.put(enword,chword);
      }
      else
        break;             // 若沒有讀到對應的中文解釋也跳出迴圈
    }
  }

  public void ask(String str)  {
    if (dict.get(str)!=null)  // 用 get() 方法找出集合中對應的值
      System.out.println(str + " ==> " + dict.get(str) + "\n");
    else
      System.out.println("對不起, 找不到這個字\n");
  }

  public static void main(String args[]) throws IOException {

    EasyDict mydict = new EasyDict();  // 呼叫建構方法

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = new String();

    while(true) {       // 用迴圈讓使用者可重複查詢
      System.out.println("要查什麼英文單字");
      System.out.print("(直接按 Enter 可結束程式)->");
      str = br.readLine();
      if (str.equals(""))   // 若沒有內容就跳出迴圈
        break;
      mydict.ask(str);      // 呼叫 ask() 方法來找中文解釋
    }
  }
}
