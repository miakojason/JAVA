import java.io.*;

public class WrapSystemIn {

  public static void main(String args[]) throws IOException {

    // 用 InputStreamReader 讀取
    System.out.print("請輸入一串字：");
    InputStreamReader ir = new InputStreamReader(System.in);

    char[] ch = new char[80];       // 用來存放讀到的字元
    int i=0;
                                              // 用迴圈持續讀取
    while ( (ch[i] = (char) ir.read())!= 10)  // 直到遇到換行字元
      i++;

    System.out.print("用 InputStreamReader 讀到的是：");
    for (int j=0;j<i;j++)
      System.out.print(ch[j]);      // 依序印出每個字元
    System.out.println();

    // 改用 BufferedReader 讀取
    System.out.print("請再輸入一串字：");
    BufferedReader br = new BufferedReader(ir);

    String str = br.readLine();
    System.out.println("用 BufferedReader 讀到的是：" + str );
  }
}
