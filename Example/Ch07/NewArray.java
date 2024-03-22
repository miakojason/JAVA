public class NewArray  {
  public static void main(String[] argv) {
    int[] a = {20,30,40};  // 原本是 3 個元素的陣列

    System.out.print("陣列a：");
    for(int i : a)   // 顯示陣列a的所有元素
      System.out.print("\t" + i);

    a = new int[5]; // 重新配置陣列
    a[0] = 100;
    a[1] = 200;

    System.out.print("\n重新配置陣列a：");
    for(int i : a)   // 顯示陣列a的所有元素
      System.out.print("\t" + i);
  }
}
