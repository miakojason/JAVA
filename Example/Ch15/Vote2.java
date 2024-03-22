class PollingStation extends Thread { // 秨布┮
  static int reportTimes = 5; // 厨Ω计
  int total = 0; // 秨布┮羆布计
  Vote2 v; // Vote2ン
  String name; // 秨布┮嘿

  public PollingStation(Vote2 v,String name) { // 篶よ猭
    this.v = v; // 癘魁Vote2ン
    this.name = name; // 癘魁秨布┮嘿
  }

  public void run() { // 磅︽狐璶秈︽
    for(int i = 0;i < reportTimes;i++) {
      //睹计玻ネ穝糤眔布计
      int count = (int)(Math.random() * 500);
      v.reportCount(name,count); // 厨穝糤眔布计羆
      total += count; // 秨布┮羆
    }
  }
}

public class Vote2 {
  private int total = 0; // 羆秨布计
  private int numOfStations = 2; // 秨布┮计
  private PollingStation[] stations;

  public void reportCount(String name, int count) {

    synchronized(this) {
      int temp = total;

      System.out.println(name + "秨布┮眔" + count + "布");
      temp = temp + count;
      System.out.println("ヘ玡羆布计" + temp);
      total = temp;
    }
  }

  public void startReport() {
    // ミ皚
    stations = new PollingStation[numOfStations];

    // ミщ布┮ン磅︽
    for(int i = 1;i <= numOfStations;i++) {
       stations[i - 1] = new PollingStation(this,i + "腹");
    }

    // 币笆磅︽狐
    for(int i = 0;i < numOfStations;i++) {
       stations[i].start();
    }

    // 单щ布┮秨布挡
    for(int i = 0;i < numOfStations;i++) {
      try {
         stations[i].join();
      } catch(InterruptedException e) {}
    }

    System.out.println("程щ布挡狦");

    // 陪ボщ布┮布计
    for(int i = 0;i < numOfStations;i++) {
      System.out.println(stations[i].name + ":" +
              stations[i].total);
    }

    // 陪ボ程羆布计
    System.out.println("羆布计" + total);
  }

  public static void main(String[] argv) {
    Vote2 v = new Vote2();
    v.startReport();
  }
}