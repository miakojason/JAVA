public class Timer extends Thread {
  private int interval; // 計時區間
  private TimeUp listener; // 時間到時反向叫用的介面

  public static void setTimer(int interval,TimeUp listener) {
    Timer t = new Timer(interval,listener); // 建立計時物件
    t.start(); // 啟動計時用的執行緒
  }

  private Timer(int interval,TimeUp listener) {
    this.interval = interval;
    this.listener = listener;
  }

  public void run() {
    try {
      sleep(interval); // 進入睡眠時間等待時間到
    } catch(InterruptedException e) {}
    listener.notifyTimeUp(); // 通知時間已到
  }
}
