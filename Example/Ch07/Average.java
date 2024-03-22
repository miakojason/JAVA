public class Average {
  public static void main(String[] argv) {
    // 學生成績
    double student1 = 70 ,student2 = 65 ,student3 = 90 ,
            student4 = 85, student5 = 95;

    // 加總
    double sum = student1 + student2 + student3 +
                 student4 + student5;

    double average =  sum / 5; // 平均

    System.out.println("平均成績：" + average);
  }
}
