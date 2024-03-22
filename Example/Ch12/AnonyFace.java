interface Face {   // 定義 Face 介面
   void smile(); 
}

public class AnonyFace {
  public static void main(String[] argv) {

    // 實作 Face 介面的匿名類別, 並建立物件傳回給變數 c
    Face c = new Face() { 
      public void smile() {  // 實作介面中的方法
        System.out.print("^_^"); 
      }
    };
    c.smile(); // 以 c 物件執行匿名類別中實作的 smile() 方法
  }
}
