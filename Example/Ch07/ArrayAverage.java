public class ArrayAverage {
  public static void main(String[] argv) {
    double[] students; // 宣告陣列
    students = new double[5]; // 配置陣列

    students[0] = 70; // 指派第1個保管箱的內容
    students[1] = 65; // 指派第2個保管箱的內容
    students[2] = 90; // 指派第3個保管箱的內容
    students[3] = 85; // 指派第4個保管箱的內容
    students[4] = 95; // 指派第5個保管箱的內容

    double sum = 0;
    for(int i = 0;i < students.length;i++) {
      sum += students[i]; // 加總
    }

    double average =  sum / students.length; // 計算平均

    System.out.println("平均成績：" + average);
  }
}
