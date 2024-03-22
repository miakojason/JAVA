public class Conditional  {
  public static void main(String[] argv) {
    boolean lightIsOn = false; // 用 lightIsOn 代表是否有開燈？
    System.out.println(lightIsOn ? "燈亮了" : "燈熄了");

    lightIsOn = !lightIsOn; // 做反向運算
    System.out.println(lightIsOn ? "燈亮了" : "燈熄了");
  }
}
