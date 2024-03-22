import java.util.*;

public class IntTree {

  public static void main(String args[]) {

    // 用 Integer 物件建立 TreeSet 集合物件
    TreeSet<Integer> IntTS = new TreeSet<>();
    for (int i=1;i<=10;i++)
      IntTS.add(i*10);
    System.out.println("集合 IntTS 的大小為 " + IntTS.size());

    // 取得一個子集合並移除其內容
    TreeSet subInt =  (TreeSet) IntTS.headSet(50);
    System.out.println("子集合 subInt 的大小為 " + subInt.size());
    subInt.clear();    // 清空 subInt 集合的所有元素

    System.out.println("移除子集合後, 集合 IntTS 的大小為 "
                       + IntTS.size());
  }
}
