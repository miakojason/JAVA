class Child extends Object {
   int addTwoInteger(Integer i1,Integer i2) { // 自動封箱
     return i1 + i2; // 自動拆箱
   }
}

public class Boxing {
        
  public static void main(String[] argv) {
    Child c = new Child(); // 產生Child物件

    System.out.println(c.addTwoInteger(10,20));
    System.out.println(c.addTwoInteger(
      new Integer(10),new Integer(20))); // 建立 2 個 Interger 物件
  }
}
