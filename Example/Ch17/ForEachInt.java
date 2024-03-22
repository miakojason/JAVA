import java.util.*;

public class ForEachInt {
  public static void main(String args[]) {

    // 要用 <Integer> 語法標示 TreeSet 集合是用來存放整數物件
    TreeSet<Integer> IntTS = new TreeSet<Integer>();

    for (int i=1;i<=100;i++) // 將 1 到 100 的數字加到集合中
      IntTS.add(i);

    System.out.print("1～100 中 9 的倍數有：");

    for (Integer i:IntTS)    // 對 IntTS 中的每個元素 i 做迴圈處理
      if (i%9 == 0)          // 元素 i 若能被 9 整除
        System.out.print(i + " ");
  }
}
