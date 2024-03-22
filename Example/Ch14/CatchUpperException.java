import java.io.*;

public class CatchUpperException {

  public static void main(String[] argv) throws IOException {

    System.out.println("本程式有三個神祕數字,");
    System.out.print("您要看第幾個→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int choice1 = Integer.parseInt(str); // 轉換為 int

    System.out.println("本程式有六個神秘英文字母,");
    System.out.print("您要看第幾個→");

    str = br.readLine();
    int choice2 = Integer.parseInt(str); // 轉換為 int

    int[] a = {123,456,789};     // 含神秘數字的陣列
    String s = "MONDAY";         // 含神秘英文字母的字串

    try {
      System.out.println("a[" +  choice1 + "]：" + a[choice1-1]);
      System.out.println(s.charAt(choice2));
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println("發生例外：" + e );
      System.out.println("索引超出範圍了!");
    }
  }
}
