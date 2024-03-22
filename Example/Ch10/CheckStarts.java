public class CheckStarts {

  public static void main(String[] argv) {
    String a = "abcd";
    System.out.println(a + " 的開頭是 cd：" +
                       a.startsWith("cd"));
    System.out.println(a + " 從第 3 個字開始算的開頭是 cd：" +
                       a.startsWith("cd",2));
    }
}