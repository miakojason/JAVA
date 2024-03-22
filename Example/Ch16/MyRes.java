public class MyRes implements AutoCloseable {
  String name; // 儲存名稱

  MyRes(String str) {name = str;} // 建構方法

  public void close() { // AutoCloseable 介面的方法
    System.out.println("正在關閉資源-"+name);
  }

  public static void main(String args[]) {

    try(MyRes one=new MyRes("1");  // 建立 2 個資源物件
        MyRes two=new MyRes("2") ){
       System.out.println("...try...");
    }
    finally{
      System.out.println("...finally...");
    }

  }
}
