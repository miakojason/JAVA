import java.util.*;

public class FiveCities {

  public static void main(String args[]) {

    String[] cities= {"台北","100",
                      "台南","700",
                      "台西","636",
                      "台東","950"};
    // 建立可放六對元素的物件
    HashMap<String,String> thecities = new HashMap<>(6);

    for (int i=0;i<cities.length;i+=2)
      thecities.put(cities[i],cities[i+1]);

    System.out.println("HashMap 的內容為：" + thecities);

    System.out.println("將台中加入 HashMap！");
    thecities.put("台中","400");
    System.out.println("HashMap 的內容變成：" + thecities);

    System.out.println("再加一個台中！");
    thecities.put("台中","401");     // 加入重複的鍵
    System.out.println("HashMap 的內容變成：" + thecities);
  }
}
