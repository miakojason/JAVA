import java.io.*;

// 宣告自訂的例外類別
class NoGasException extends Exception {
}

// 宣告汽車類別
class MyCar implements Serializable {
  double GasTank;     // 記錄油量
  double Efficient;   // 耗油效率 (公里/公升)

  public MyCar(double g,double e) {
    GasTank =g;
    Efficient=e;
  }

  // 行走指定里程的方法
  public void go(double distance) throws NoGasException {
    double GasNeed= distance/Efficient;
    GasTank -= GasNeed;
    if (GasTank<0)
      throw new NoGasException();  // 油量不足時拋出例外
  }

  public double checkGas() {
    return GasTank;  // 傳回目前油量
  }
}

