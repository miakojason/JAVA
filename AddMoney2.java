class IcCard { 
  long id; 
  int money; 

  void showInfo() { 
    System.out.print("卡片卡號 " + id);
    System.out.println(", 餘額 " + money + " 元 ");
  }

  Boolean add(int value) { 
    if (value > 0 && value + money <= 10000) {
      money += value;
      return true; 
    }
    return false; 
  }

  boolean minus(int value) {
    if (money - value >= 0) {
      return true;
    } 
      return false;
  }
}

public class AddMoney2 {
  public static void main(String[] argv) {
    IcCard myCard = new IcCard();
    myCard.id = 0x336789AB; 
    myCard.money = 300;

    System.out.println("加值 900 元" +
        (myCard.add(900) ? "成功" : "失敗"));
    myCard.showInfo(); 

    System.out.println("加值 9000 元" +
        (myCard.add(9000) ? "成功" : "失敗"));
    myCard.showInfo();

    System.out.println("扣款 100 元" +
        (myCard.minus(100) ? "成功" : "失敗"));
    myCard.showInfo(); 
    System.out.println("扣款 10000 元" +
        (myCard.minus(10000) ? "成功" : "失敗"));
    myCard.showInfo(); 
  }
}