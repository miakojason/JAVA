class Test {
  void showMultipleString(String[] strs) {
    for(String s : strs) {
      System.out.println(s);
    }
  }
}

public class AnonymousArray {

  public static void main(String[] argv){
    Test a = new Test();

    a.showMultipleString(new String[] { "第一行訊息",
       "第二行訊息",
       "第三行訊息"});
  }
}