public class Count9x9 {

  public static void main(String args[]) {

    for (int x=1; x<=9; x++) {  // 外層迴圈從 x=1 開始
      for (int y=1; y<=9; y++) {  // 內層迴圈從 y=1 開始
        System.out.print( x + "*" + y + "=" + x*y + "\t");
      }
      System.out.println();
    }
  }
}
