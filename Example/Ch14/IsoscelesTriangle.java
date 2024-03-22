import java.io.*;

public class IsoscelesTriangle {

  public static void main(String args[]) throws IOException {

    System.out.println("要畫多高的星號三角形 (行數)");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();
    int line = Integer.parseInt(str);

    for (int i=1;i<=line;i++) {   // 外迴圈, 控制換行
      for (int j=1;j<=line-i;j++) // 內迴圈 1, 控制輸出空白
        System.out.print(" ");
      for (int k=1;k<2*i;k++)     // 內迴圈 2, 控制輸出星號
        System.out.print("*");
      System.out.println();     // 每輸出一行就換行
    }
  }
}
