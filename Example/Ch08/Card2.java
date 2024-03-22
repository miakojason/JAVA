class IcCard {  // 代表 IC 卡的類別
  long id;      // 卡號
  int money;    // 卡片餘額
}

public class Card2 {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard();   // 建立物件

    myCard.id = 0x336789AB;  // 設定成員變數值
    myCard.money = 300;

    System.out.print("卡片卡號 "+ myCard.id);
    System.out.println(", 餘額 " + myCard.money + " 元 ");
  }
}