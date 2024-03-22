class Test {
  void showMultipleString(String[] strs) {
    for(String s : strs) {
      System.out.println(s);
    }
  }
}

public class ShowMultiStr {

  public static void main(String[] argv){
    Test a = new Test();
      String[] strs = { "第一行訊息",
      "第二行訊息",
      "第三行訊息"}; // 宣告陣列以便作為參數

    a.showMultipleString(strs);
  }
}