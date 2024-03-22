import java.io.*;

public class RandomLotto {
  public static void main(String args[]) {

    System.out.println("樂透電腦選號──自動產生5組號碼");
    System.out.println("未滿十八歲不得購買及兌換彩券！");

    int[] lotto= new int[49];      // 建立樂透號碼陣列
    for(int i=1;i<=5;i++) {        // 產生 5 組號碼的迴圈
      System.out.printf("%d) ",i); // 顯示開頭編號
      for (int j=0;j<49;j++)       // 將陣列元素值設為 1～49
        lotto[j]=j+1;

      int count=0;          // 用來記錄已產生幾個號碼
      do {
        int guess = (int)(Math.random()*49);

        if(lotto[guess]==0) // 若號碼所指的元素值為 0, 表示此數字已
          continue;         // 出現過, 就重新執行迴圈, 產生另一亂數
        else {
          System.out.print(lotto[guess]+"\t");
          lotto[guess]=0;   // 將號碼所指的元素值設為 0, 以免重複用到
          count++;
        }
      } while (count<6);    // 輸出 6 個號碼才停止

      System.out.print('\n');   // 每產生一組號碼就換行
    }
  }
}