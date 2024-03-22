public class Complement {
  public static void main(String[] argv) {
    boolean lightIsOn = false; // 用 lightIsOn 代表是否有開燈？
    System.out.println("現在有開燈？ "+lightIsOn);
    
    lightIsOn = !lightIsOn; // 做反向運算
    System.out.println("現在有開燈？ "+lightIsOn);
  }
}