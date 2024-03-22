interface Face {   // 定義 Face 介面
   void smile(); 
}

public class LambdaFace {
  public static void main(String[] argv) {

    Face c = () -> System.out.print("^_^");  // 用 Lambda 運算式建立匿名類別並產生物件
    c.smile();  // 輸出：^_^
  }
}
