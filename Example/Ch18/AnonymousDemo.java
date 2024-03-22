public class AnonymousDemo  {

  public static void main(String[] args) {
    final int a= 10;

    (new Object() {  // 匿名類別
       int b =10000;  // 匿名類別的成員
       public void show() {  // 匿名類別的方法
         System.out.println ("匿名類別：");
         System.out.println ("this  ->b= " +b);
         System.out.println ("main()->a= " +a);
       }
     }).show();      // 產生匿名類別物件後即呼叫其 show() 方法
  }
}
