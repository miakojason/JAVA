class Child { // 沒有定義toString方法的物件
}

public class NoToString {
  public static void main(String[] argv) {
    Child c = new Child(); // 產生Child物件
    System.out.println("c.toString：" + c);
  }
}
