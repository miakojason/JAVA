public class PartOf9x9 {

  public static void main(String args[]) {

    outloop:for (int x=1; x<=9; x++) {    // 加上標籤名稱
      for (int y=1; y<=9; y++) {  
        if (x*y > 25) {           // 若乘積大於 25
          System.out.println();   // 換行
          continue outloop;       // 中止這一輪的 outloop 迴圈
        }
        System.out.print( x + "*" + y + "=" + x*y + "\t");
      }
      System.out.println();
    }
  }
}

