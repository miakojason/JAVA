class Land {      // 代表任何形狀土地的父類別
  double area() { // 計算面積
    return 0;
  }
}

class Circle extends Land { // 圓形的土地
  int r;           // 半徑（單位：公尺）

  Circle(int  r) { // 建構方法
    this.r = r;
  }

  double area() {  // 多重定義的版本
    return 3.14 * r * r;
  }
}

class Square extends Land { // 正方形的土地
  int side; // 邊長（單位：公尺）

  Square(int  side) { // 建構方法
    this.side = side;
  }

  double area() {     // 多重定義的版本
    return side * side;
  }
}

class Calculator {
  double price; // 每平方公尺的價格（元）

  Calculator(double price) { // 建構方法
    this.price = price;
  }

  double calculatePrice(Land l) {
    return l.area() * price; // 透過多形呼叫正確的 area() 方法
  }
}

public class Lands1 {
  public static void main(String[] argv) {
    Circle c = new Circle(5); // 一塊圓形的地
    Square s = new Square(5); // 一塊正方形的地

    Calculator ca = new Calculator(3000.0); // 每平方公尺3000元

    System.out.println("c 這塊地值" + ca.calculatePrice(c));
    System.out.println("s 這塊地值" + ca.calculatePrice(s));
  }
}
