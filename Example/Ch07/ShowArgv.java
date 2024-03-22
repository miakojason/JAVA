public class ShowArgv {
  public static void main(String[] argv) {
    for(int i = 0;i < argv.length;i++) {
      System.out.println("第 " + i +" 個參數：" + argv[i]);
    }
  }
}
