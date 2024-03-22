import java.io.*;

public class CatchAndShowInfo {

  public static void main(String[] argv) throws IOException{

    int[] secret = {65535,3001,1999,1496,119};
    System.out.print("セ祘ΑΤ 5 计, 眤璶材碭");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    int target = Integer.parseInt(str); // 锣传 int

    try {

      System.out.println("材 " + target + " 计琌 "
                          + secret[target-1]);
    } catch (ArrayIndexOutOfBoundsException e) {

      System.out.println("眤﹚掸计禬絛瞅");
      System.out.println("眤璶琌材 " + target + " 计,");
      System.out.println("  иΤ 5 计");
    }

    System.out.println("舧Ωㄏノ");
  }
}
