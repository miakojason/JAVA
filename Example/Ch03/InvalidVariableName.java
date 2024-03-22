public class InvalidVariableName {
  public static void main(String[] argv) {
    int 3age;   // 不能以數字開頭
    int #AGE;   // 不能使用 "#" 字元
    int A#GE;   // 不能使用 "#" 字元
    int while;  // 不能使用關鍵字
    int true;   // 不能使用內建保留的字面常數
    3age = 19;
    System.out.println("你的年齡是：" + 3age);
  }
}
