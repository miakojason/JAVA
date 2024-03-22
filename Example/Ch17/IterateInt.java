import java.util.*;

public class IterateInt {

  public static void main(String args[]) {

    // 用 Integer 物件建立 TreeSet 集合物件
    TreeSet<Integer> IntTS = new TreeSet<>();
    for (int i=1;i<=100;i++)  // 將 1 到 100 的數字加到集合中
      IntTS.add(i);
    System.out.println("初始集合大小為：" + IntTS.size());

    // 建立 Iterator 物件
    Iterator i=IntTS.iterator();

    while (i.hasNext())  // 只要還有下個元素, 就繼續迴圈
      if (((Integer)i.next()).intValue()%9 != 0)
        i.remove();    // 不能被 9 整除的元素, 就會被移除

    System.out.println("最後集合的內容為：" + IntTS);
  }
}
