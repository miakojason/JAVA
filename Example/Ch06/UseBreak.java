public class UseBreak {

  public static void main(String args[]) {

    int i=1;

    while (i>0) { // 無窮迴圈
      System.out.println("無窮迴圈執行中..");
      if (i == 5) // 當 i 為 5 時, 條件算式成立
        break; // 執行跳脫迴圈
      i++;
    }
    System.out.println("成功的跳出迴圈了！！");
  }
}
