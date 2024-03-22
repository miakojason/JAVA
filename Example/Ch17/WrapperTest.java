public class WrapperTest {

  public static void main(String args[]) {

    System.out.println("數值型基本資料類別示範");

    Integer myint = Integer.valueOf(123456789);  // 建立 Integer 物件
    Double mydbl = Double.valueOf(5.376543e200); // 建立 Double 物件

    System.out.println("\n以下是取 Integer 物件數值的結果：");
    showall(myint);

    System.out.println("\n以下是取 Double 物件數值的結果：");
    showall(mydbl);
  }

  public static void showall(Number o) {  // 此方法專用來顯示
                                          // 呼叫各取值方法的結果
    System.out.println("呼叫 byteValue()  ：" + o.byteValue()  );
    System.out.println("呼叫 doubleValue()：" + o.doubleValue());
    System.out.println("呼叫 floatValue() ：" + o.floatValue() );
    System.out.println("呼叫 intValue()   ：" + o.intValue()   );
    System.out.println("呼叫 longValue()  ：" + o.longValue()  );
    System.out.println("呼叫 shortValue() ：" + o.shortValue() );
  }
}
