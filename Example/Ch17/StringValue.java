public class StringValue {

  public static void main(String args[]) {

    System.out.println("示範 valueOf() 的效果");

    String str16 = "A035FC4";   // 16 進位表示
    String str08 = "1357246";   // 8 進位表示
    String str07 = "-162534";   // 7 進位表示
    String str02 = "1101101";   // 2 進位表示

    System.out.println(str16 + "：" + Long.valueOf(str16,16));
    System.out.println(str08 + "：" + Integer.valueOf(str08,8));
    System.out.println(str07 + "：" + Short.valueOf(str07,7));
    System.out.println(str02 + "：" + Byte.valueOf(str02,2));
  }
}
