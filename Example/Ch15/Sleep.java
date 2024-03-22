import java.util.Date;

class TimerThread extends Thread { // 新的執行緒
  public void run() { // 新執行緒要執行的內容
    try {
      while(true) { // 不斷執行
        sleep(1000); // 睡眠一秒鐘
        Date now = new Date(); // 取得目前時間
        System.out.println("新執行緒:" + now); // 顯示時間
      }
    }
    catch(InterruptedException e) {}
  }
}

public class Sleep {
        
  public static void main(String[] argv) {
    TimerThread newThread = new TimerThread(); // 建立執行緒
    newThread.start(); // 啟動新執行緒
    try {
      while(true) { // 不斷執行
        Thread.sleep(1000); // 睡眠1秒鐘
        Date now = new Date(); // 取得目前時間
        System.out.println("舊執行緒：" + now); // 顯示時間
      }
    }
    catch(InterruptedException e) {}
  }
}