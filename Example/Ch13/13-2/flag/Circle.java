package flag; // 將類別包裝在 flag 套件中

public class Circle extends Shape {
  private double r;     // 圓形半徑

  public Circle(double x,double y,double r) {
    super(x,y);         // 呼叫父類別建構方法
    this.r = r;
  }
}
