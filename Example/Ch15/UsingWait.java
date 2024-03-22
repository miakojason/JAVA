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

  public synchronized void a() {
    System.out.println("方法a開始執行");
      try{
        wait(); // 改用wait
      } catch(InterruptedException e) {}
    System.out.println("方法a執行完畢");
  }

  public synchronized void b() {
    System.out.println("方法b開始執行");
    notify();
    System.out.println("方法b執行完畢");
  }
}

public class UsingWait {
  public static void main(String[] argv) {
    ThreadA a = new ThreadA();
    ThreadB b = new ThreadB();
    try {
      a.start(); // a執行緒先執行
      b.start(); // b執行緒再接著執行
      a.join(); // 等a執行緒結束
      b.join(); // 等b執行緒結束
    } catch(InterruptedException e) {}
    System.out.println("程式結束");
  }
}
