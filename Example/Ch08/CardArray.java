class IcCard {  // 代表 IC 卡的類別
  long id;      // 卡號
  int money;    // 卡片餘額

  void showInfo() {  // 顯示卡片資訊的方法
    System.out.print("卡片卡號 "+ id);
    System.out.println(", 餘額 " + money + " 元 ");
  }
}

public class CardArray {
  public static void main(String[] argv) {
    IcCard[] manyCards = new IcCard[3];     // 建立物件陣列

    for(int i=0;i<manyCards.length;i++) {
      manyCards[i] = new IcCard();       // 建立物件
      manyCards[i].id = 0x336789AB + i;
      manyCards[i].money = 100 + i * 123;
    }

    for(IcCard c : manyCards)  // 也可以用 For-each 迴圈
      c.showInfo();      // 呼叫方法
  }
}