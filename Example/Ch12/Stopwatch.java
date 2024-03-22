interface TimesUp { 
  void notifyMe(); // 通知時間已到
}

class Timer { // 虛擬的碼表
  static void startTimer(int seconds,TimesUp obj) {
    // 開始計時
    for(int i = 0;i < seconds;i++);
    obj.notifyMe(); // 通知碼表使用者
  }
}

class watchUser implements TimesUp {
  public void notifyMe() {
     System.out.println("時間到");
  }
}

public class Stopwatch {

  public static void main(String[] argv) {
    watchUser w = new watchUser();
    Timer.startTimer(1000,w);
  }
}
