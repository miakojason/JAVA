class Land { // 父類別
  double area() { // 計算面積
    return 0;
  }
}

class Circle extends Land { // 圓形的土地
  int r; // 半徑（單位：公尺）

  Circle(int  r) { // 建構方法
    this.r = r;
  }

  double area() { // 重新定義的版本
    return 3.14 * r * r;
  }
}

class Square extends Land { // 正方形的土地
  int side; // 邊長（單位：公尺）

  Square(int  side) { // 建構方法
    this.side = side;
  }

  double area() { // 重新定義的版本
     return side * side;
  }
}

class Calculator {
  static double calPrice(double price, Land... Lands) {
    double total = 0;  // 加總變數

    for(Land l : Lands) {  // 一一取出各個物件
      total += l.area() * price;    // 個別計算並累加
    }
    return total;
  }
}

public class Lands4 {
  public static void main(String[] argv) {
    Circle c = new Circle(5); // 一塊圓形的地
    Square s = new Square(5); // 一塊正方形的地

    System.out.println("價值：" + Calculator.calPrice(4000, c));
    System.out.println("總價值：" + Calculator.calPrice(4000, c, s));
  }
}
