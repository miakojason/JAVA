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

  double area() { // 多重定義的版本
    return 3.14 * r * r;
  }
}

class Square extends Land { // 正方形的土地
  int side; // 邊長（單位：公尺）

  Square(int  side) { // 建構方法
    this.side = side;
  }

  double area() { // 多重定義的版本
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

  double calculateAllPrices(Land[] Lands) {
    double total = 0; // 計算加總

    for(Land l : Lands) { // 一一取出各個物件
      total += calculatePrice(l); // 個別計算並累加
    }

    return total;
  }
}

public class Lands2 {
  public static void main(String[] argv) {
    Circle c = new Circle(5); // 一塊圓形的地
    Square s = new Square(5); // 一塊正方形的地

    Calculator ca = new Calculator(3000.0); // 每平方公尺3000元

    System.out.println("總價值：" + // 使用匿名陣列
      ca.calculateAllPrices(new Land[] {c,s}));
  }
}
