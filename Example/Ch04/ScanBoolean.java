import java.util.*;

public class ScanBoolean {
  public static void main(String[] argv) {
    System.out.print("有開燈嗎？");
    Scanner sc = new Scanner(System.in);   // 由 System.in 取得輸入
    boolean lightIsOn = sc.nextBoolean(); // 由輸入端取得布林值


    System.out.println(lightIsOn ? "燈亮了" : "燈熄了");
  }
}

