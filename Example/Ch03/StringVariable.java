public class StringVariable  {
  public static void main(String[] argv) {
     String s1= "第一個字串";
     String s2= "第二個\t字串"; // 字串中可使用跳脫序列
     
     System.out.println(s1);
     System.out.println(s2);
     System.out.println(s1 + '\n' + s2); // 字串也可與字元相加
  }
}