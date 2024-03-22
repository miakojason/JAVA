import java.io.*;

public class Deltaic {

  public static void main(String[] argv)
        throws IOException {

    BufferedReader br = new 
        BufferedReader(new InputStreamReader(System.in));

    int i,j,k;

    // 輸入第 1 邊邊長
    System.out.println("請輸入三角形的三邊長：");
    System.out.print("邊長 1 →");
    String str = br.readLine();
    i = Integer.parseInt(str);

    // 輸入第 2 邊邊長
    System.out.print("邊長 2 →");
    str = br.readLine();
    j = Integer.parseInt(str);

    // 輸入第 3 邊邊長
    System.out.print("邊長 3 →");
    str = br.readLine();
    k = Integer.parseInt(str);

    if ((i+j) > k)     // 判斷第 1, 2 邊的和是否大於第 3 邊
      if ((i+k) > j)   // 判斷第 1, 3 邊的和是否大於第 2 邊
        if ((j+k) > i) // 判斷第 2, 3 邊的和是否大於第 1 邊
          System.out.println("可以為三角形的三邊長。");
        else
          System.out.println("第 2、3邊的和應大於第 1 邊"); 
      else
        System.out.println("第 1、3邊的和應大於第 2 邊");    
    else
      System.out.println("第 1、2邊的和應大於第 3 邊"); 
  }
}