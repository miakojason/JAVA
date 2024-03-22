import java.util.*;

public class AnimalSigns {

  public static void main(String args[]) {

    char[] animal={'鼠','虎','免','龍','蛇','猴','雞','狗','豬'};
    ArrayList<Character> Twelve = new ArrayList<>();
    for (int i=0;i<animal.length;i++)   // 將字元陣列的內容加到集合
      Twelve.add(animal[i]);

    System.out.println("集合的大小為 " + Twelve.size());
    System.out.println("集合內容為：" + Twelve); // 列出所有元素

    Twelve.add(1,'牛');  // 插入 3 個元素
    Twelve.add(6,'馬');
    Twelve.add(7,'羊');

    System.out.println("\n集合的大小為 " + Twelve.size());
    System.out.print("集合內容為：");       // 列出所有元素
    for (int i=0;i<Twelve.size();i++)       // 依序列出所有元素
      System.out.print(Twelve.get(i) + " ");
  }
}
