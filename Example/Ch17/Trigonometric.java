public class Trigonometric {

  public static void main(String args[]) {

    System.out.println("角度\tsin()(取5位)\tsin()(取17位)");

    for(int i=1;i<=3;i++)    // 計算 30、60、90 度的 SIN 函數值
      System.out.printf("%3d\t%+.5f\t%2$+.17f\n",
                        30*i, Math.sin(i*Math.PI/6));

    for(int i=4;i<=6;i++)    // 計算 120、150、180 度的 SIN 函數值
      System.out.printf("%3d\t%+.5f\t%2$+.17f\n",
                        30*i, Math.sin(Math.toRadians(30*i)));
  }
}
