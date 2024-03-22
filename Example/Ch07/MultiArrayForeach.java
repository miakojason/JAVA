public class MultiArrayForeach {
  public static void main(String[] argv) {
    int[][] a = {{1,2,3,4},{5,6,7,8}};

    for(int[] i : a) { // 使用foreach
      for(int j : i) { // 使用foreach
              System.out.print(j + "\t");
      }
      System.out.println("");
    }
  }
}
