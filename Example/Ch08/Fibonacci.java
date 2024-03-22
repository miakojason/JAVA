import java.io.*;

class Mathematics {
  long fibonacci(int n) {
    if(n <= 2) {
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}

public class Fibonacci {

  public static void main(String[] argv) throws IOException{
    Mathematics m = new Mathematics();

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("請輸入 n：");
    int n = Integer.parseInt(br.readLine());

    System.out.println("Fibonacci 數列第 " + n + " 項：" +
      m.fibonacci(n));
  }
}