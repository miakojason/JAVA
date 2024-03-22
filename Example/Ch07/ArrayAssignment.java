public class ArrayAssignment  {
  public static void main(String[] argv) {
    int[] a = {20,30,40};
    int[] b = a; // 將a的內容指定給b中

    b[2] = 100; // 更改陣列b的內容

    System.out.print("陣列a的元素：");
    for(int i : a)   // 顯示陣列a的所有元素
      System.out.print("\t"+i);

    System.out.print("\n陣列b的元素：");
    for(int i : b)   // 顯示陣列b的所有元素
      System.out.print("\t"+i);
  }
}
