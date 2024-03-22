class Test {

  // 1號版本：使用寬與高
  int rectangleArea(int width,int height) {
    return width * height;
  }

  // 2號版本：使用座標
  int rectangleArea(int bottom,int left,int top,int right) {
    return (right - left) * (top - bottom);
  }
}

public class Overloading {

  public static void main(String[] argv){
    Test a = new Test();
    int area;

    area = a.rectangleArea(10,20);
    System.out.println("矩形面積：" + area);

    area = a.rectangleArea(5,5,15,25);
    System.out.println("矩形面積：" + area);
  }
}