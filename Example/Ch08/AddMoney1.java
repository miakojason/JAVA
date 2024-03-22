class IcCard {  // 代表 IC 卡的類別
  long id;      // 卡號
  int money;    // 卡片餘額

  void showInfo() {  // 顯示卡片資訊的方法
    System.out.print("卡片卡號 "+ id);
    System.out.println(", 餘額 " + money + " 元 ");
  }

  void add(int value) {  // 加值方法：參數為要加值的金額
    money += value;
    System.out.println("加值成功, 本次加值 " + value + " 元 ");
  }
}

public class AddMoney1 {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard();   // 建立物件

    myCard.id = 0x336789AB;  // 設定成員變數值
    myCard.money = 300;

    myCard.add(1000);        // 加值 1000
    myCard.showInfo();       // 呼叫方法
  }
}