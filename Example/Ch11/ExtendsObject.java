class Child extends Object { // 沒有定義toString方法的物件
}

public class ExtendsObject {

  public static void main(String[] argv) {
    Child c = new Child(); // 產生Child物件

    // 呼叫 Object.toString()
    System.out.println("c.toString：" + c);
  }
}
