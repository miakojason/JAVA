interface ICanCompare { 
  int compare(ICanCompare i); // 進行比較
}

class Sort { // 提供排序功能的類別
  static void bubbleSort(ICanCompare[] objs) { // 氣泡排序法
    for(int i = objs.length - 1;i > 0;i--) {
      for(int j = 0;j < i;j++) {
        if(objs[j].compare(objs[j + 1]) < 0) {
          ICanCompare temp = objs[j];
          objs[j] = objs[j + 1];
          objs[j + 1] = temp;
        }
      }
    }
  }
}

abstract class Land implements ICanCompare { // 父類別
  abstract double area(); // 計算面積
  public int compare(ICanCompare i) { // 實作compare
    Land l = (Land) i;
    return (int)(this.area() - l.area()); // 依據面積比較大小
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

  public String toString() {
    return "半徑：" + r + ",面積：" + area() + "的圓";
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

  public String toString() {
    return "邊長：" + side + ",面積：" + area() + "的正方形";
  }
}

public class Sorting {

  public static void main(String[] argv) {
    Land[] lands = {
      new Circle(5),
      new Square(3),
      new Square(2),
      new Circle(4)
    };

    for(Land l : lands) {
      System.out.println(l);
    }

    Sort.bubbleSort(lands);
    System.out.println("排序後...");

    for(Land l : lands) {
      System.out.println(l);
    }
  }
}
