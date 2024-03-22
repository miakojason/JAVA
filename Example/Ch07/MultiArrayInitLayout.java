public class MultiArrayInitLayout {
  public static void main(String[] argv) {
    int[][] a = {{1,2,3,4},
                 {5,6,7,8}}; // 排列成2X4陣列的樣子
    int[][][] b = {{{1,2},
                    {3,4},
                    {5,6}}, // 3X2陣列
                   {{7,8},
                    {9,10},
                    {11,12}} // 3X2陣列
                  }; // 排列成2X3X2陣列的樣子
  }
}
