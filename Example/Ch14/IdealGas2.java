import java.io.*;

public class IdealGas2 {
  public static void main(String[] argv) throws IOException{

    int[] temp = {0,15,20,25};
    System.out.println("計算攝氏 0,15,20,25 度下, 理想氣體體積");
    System.out.print("請輸入大氣壓力 (atm)→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    // 轉換為 double
    double pressure = Double.parseDouble(str);
    try {
      if (pressure==0)
        throw new ValueException("您輸入的值將使除數為零！");
      else if (pressure<0)
        throw new ValueException("無法計算負值！");

      System.out.println("在 " + pressure + "大氣壓下：");
 
      for (int i=0;i<temp.length;i++) {
        System.out.print("攝氏 " + temp[i] + " 度時, ");
        System.out.print("一莫耳理想氣體體積為 ");
        System.out.print(0.082*(273.14+temp[i])/pressure + " 公升\n");
      }                  // 理想氣體方程式 V=nRT/P
    }                
    catch (ValueException e) {
      System.out.println("發生例外：" + e);	
    }	
  }
}

// 自訂例外類別
class ValueException extends RuntimeException {
  public ValueException (String s) {
    super(s);
  }
}