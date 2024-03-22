class ThreadA extends Thread {
  public void run() {
    Lock.obj.a();
  }
}

class ThreadB extends Thread {
  public void run() {
    Lock.obj.b();
  }
}

class Lock {
  public static Lock obj = new Lock();
  private boolean bExecuted = false;

  public synchronized void a() {
    System.out.println("方法a開始執行");
    while(!bExecuted) {} // 等方法b被叫用
    System.out.println("方法a執行完畢");
  }

  public synchronized void b() {
    System.out.println("方法b開始執行");
    bExecuted = true; // 表示方法b已經叫用了
    System.out.println("方法b執行完畢");
  }
}

public class DeadLock {
  public static void main(String[] argv) {
    ThreadA ta = new ThreadA();
    ThreadB tb = new ThreadB();
    try {
      ta.start(); // ta執行緒先執行
      tb.start(); // tb執行緒再接著執行
      ta.join(); // 等ta執行緒結束
      tb.join(); // 等tb執行緒結束
    } catch(InterruptedException e) {}
    System.out.println("程式結束");
  }
}