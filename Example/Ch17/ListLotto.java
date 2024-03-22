import java.util.*;

public class ListLotto {

  public static void main(String args[]) {

    System.out.println("樂透電腦選號──Java/ArrayList 版");
    System.out.println("以下是五組隨機號碼：");

    ArrayList<Integer> num = new ArrayList<>();
    for (int i=1;i<50;i++)     // 初始化集合元素值
      num.add(i);

    for(int i=1;i<=5;i++) {
      Collections.shuffle(num);       // 將集合『洗牌』
      System.out.println(num.subList(0, 6));
    }                        // 取集合中前 6 個元素的子集合
    System.out.println("未滿十八歲不得購買及兌換彩券！");
  }
}
