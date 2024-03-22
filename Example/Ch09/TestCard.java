class IcCard {  // 代表 IC 卡的類別
  private long id;      // 卡號
  private int money;    // 卡片餘額

  public void showInfo() {  // 顯示卡片資訊的方法
    System.out.print("卡片卡號 "+ id);
    System.out.println(", 餘額 " + money + " 元 ");
  }

  public Boolean add(int value) {  // 加值方法：參數為要加值的金額
    if (value>0 && value+money <= 10000) { // 儲值上限一萬
      money += value;
      return true;   // 加值成功
    }
    return false;    // 加值失敗
  }

  public IcCard(long id, int money) {
    this.id = id;
    this.money = money;
  }

  public IcCard(long id) {
    this(id, 0);  // 呼叫 2 個參數的版本
  }
}


public class TestCard {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard(0x336789AB, 500); // 建立物件
    IcCard hisCard = new IcCard(0x13572468);     // 建立物件

    System.out.println("我的卡片加值 500 元" +
               (myCard.add(500) ? "成功":"失敗") );
    myCard.showInfo();       // 呼叫方法

    System.out.println("他的卡片加值 9000 元" +
               (hisCard.add(9000) ? "成功":"失敗") );
    hisCard.showInfo();      // 呼叫方法
  }
}