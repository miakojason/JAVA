import java.io.*;

public class Student implements Serializable {

  public Student (String s, short e, short m, short j) {
    name = s;
    EScore = e;
    MScore = m;
    JScore = j;
  }

  public Student () { }

  // 傳回姓名和各項成績資料的方法
  public String getN () { return name; }
  public short getE ()  { return EScore; }
  public short getM ()  { return MScore; }
  public short getJ ()  { return JScore; }

  // 計算並傳回三科平均分別的方法
  public double getAvg () {
    return (EScore + MScore + JScore) / 3.0;
  }

  private String name;    // 姓名
  private short EScore;   // 英文成績
  private short MScore;   // 數學成績
  private short JScore;   // Java 成績
}
