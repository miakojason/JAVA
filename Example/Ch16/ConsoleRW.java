import java.io.Console;

public class ConsoleRW {    
  public static void main(String[] args) {
    Console c = System.console();
      
    String acc = c.readLine("請輸入帳號：");
    char[] pwd = c.readPassword("請輸入密碼：");
    c.printf("→您的帳密為 %s, %c%c...\n", acc, pwd[0], pwd[1]);
      
    for(int i=0; i < pwd.length; i++) // 清除密碼陣列
      pwd[i] = 0;
      
    // 進行其他操作
  } 
}
