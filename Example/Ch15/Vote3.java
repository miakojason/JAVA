class PollingStation extends Thread { // 秨布┮
  static int reportTimes = 5; // 厨Ω计
  int total = 0; // 秨布┮羆布计
  Assistant a; // 癘布瞶ン
  String name; // 秨布┮嘿

  public PollingStation(Assistant a,String name) { // 篶よ猭
    this.a = a; // 癘魁Assistantン
    this.name = name; // 癘魁秨布┮嘿
  }

  public void run() { // 磅︽狐璶秈︽
    for(int i = 0;i < reportTimes;i++) { // 厨5Ω眔布
      //睹计玻ネ穝糤眔布计
      int count = (int)(Math.random() * 500);
      a.reportCount(name,count); // 厨穝糤眔布计羆
      total += count; // 秨布┮羆
    }
  }
}

class Assistant {
  private int count; // 穝糤眔布计
  private String name; // 秨穝糤眔布计秨布┮

  public synchronized void reportCount(String name,int count) {
    System.out.println(name + "秨布┮穝糤" + count + "布");
    this.count = count;
    this.name = name;
  }

  public synchronized int getCount() {
    return count;
  }
}
                
public class Vote3 {
  static int total = 0; // 羆秨布计
  static int numOfStations = 2; // 秨布┮计
  static PollingStation[] stations;

  public static void main(String[] argv) {
    // ミ瞶ン
    Assistant a = new Assistant();

    // ミ皚
    stations = new PollingStation[numOfStations];

    // ミщ布┮ン磅︽
    for(int i = 1;i <= numOfStations;i++) {
      stations[i - 1] = new PollingStation(a,i + "腹");
    }

    // 币笆磅︽狐
    for(int i = 0;i < numOfStations;i++) {
      stations[i].start();
    }

    for(int i = 0;
      i < numOfStations * PollingStation.reportTimes;i++) {
      total += a.getCount(); // 弄布计
      System.out.println("ヘ玡羆布计" + total);
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
}