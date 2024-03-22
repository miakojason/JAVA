abstract class Land {     // 父類別
  abstract double area(); // 計算面積
}

class Circle extends Land { // 圓形的土地
  int r; // 半徑（單位：公尺）

  Circle(int  r) { // 建構方法
    this.r = r;
  }

  double area() {  // 實作抽象方法 (也就是重新定義父類別中的方法)
    return 2 * 3.14 * r * r;
  }
}

class Square extends Land { // 正方形的土地
  int side; // 邊長（單位：公尺）

  Square(int side) { // 建構方法
    this.side = side;
  }

  double area() {     // 實作抽象方法 (也就是重新定義父類別中的方法)
    return side * side;
  }
}

class Calculator {
  static double calPrice(double price, Object... objs) {
    double total = 0;  // 用來儲存總價
    double tmp = 0;    // 暫存單一的地價

    for(Object o : objs) {   // 一一取出各個物件
    
      if(o instanceof Land) {            // 如果是土地物件
      	tmp = ((Land)o).area() * price;  // 計算地價, 儲存於 tmp 中
        total += tmp;                    // 累加起來
      }
      
      else if(o instanceof Integer) {    // 否則如果是數值
      	total += tmp * ((Integer)o - 1); // 因之前 tmp 已加過一次, 所以減 1
      }
    }
    return total;
  }
}

public class AbstractLand {
  public static void main(String[] argv) {
    Circle c = new Circle(5); // 一塊圓形的地
    Square s = new Square(5); // 一塊正方形的地

    System.out.println("價值：" + Calculator.calPrice(4000, c));
    System.out.println("總價值：" + Calculator.calPrice(4000, c, s));
    System.out.println("總價值：" + Calculator.calPrice(3000, s, 2, c));
  }
}
