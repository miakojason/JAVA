public class Argument {
  public static void main(String[] argv){
    Argument a = new Argument(); // ミ代刚ン
    int i = 20;

    System.out.println("㊣よ猭玡  i = " + i);
    a.changePara(i);   // 肚 i
    System.out.println("㊣よ猭  i = " + i);
  }

  void changePara(int x) {       // 穦э把计よ猭
    System.out.println("...よ猭把计 x = "+ x);
    System.out.println("...эい");
    x ++;   // э钡Μ把计
    System.out.println("...瞷把计 x = "+ x);
  }
}