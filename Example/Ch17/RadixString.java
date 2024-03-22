public class RadixString {

  public static void main(String args[]) {

    System.out.println("示範 toXXXString() 方法");

    int i = 496;
    long l = 4388073616521L;

    System.out.println(l + " 轉16進位：" + Long.toHexString(l));
    System.out.println(l + " 轉 8進位：" + Long.toOctalString(l));
    System.out.println(i + " 轉 4進位：" + Integer.toString(i,4));
    System.out.println(i + " 轉 2進位：" + Integer.toBinaryString(i));
  }
}
