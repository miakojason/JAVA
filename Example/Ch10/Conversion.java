class Student {
  String name;
  public Student(String s) { name = s; }
  public String toString() { return name; }
}

public class Conversion {       
  public static void main(String[] argv) {
    Student a = new Student("Joy");
    System.out.println("I am " + a); // ±N·|©I¥s a.toString()
  }
}
