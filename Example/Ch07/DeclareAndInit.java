public class DeclareAndInit {
  public static void main(String[] argv) {
    // 宣告並指派陣列內容
    double[] students = {70, 65, 90, 85, 95};
    double sum = 0;

    for(int i = 0;i < students.length;i++) {
      sum += students[i]; // 加總
    }

    double average =  sum / students.length; // 計算平均

    System.out.println("平均成績：" + average);
  }
}
