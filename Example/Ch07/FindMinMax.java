public class FindMinMax {

  public static void main(String[] argv) {
    int[] temp = {21,18,21,23,25,25,24,22,22,16}; // 放
    int min = temp[0]; // 盢程放砞ヴじ
    int max = temp[0]; // 盢程蔼放砞ヴじ

    for(int i : temp) { // ゑ耕–じ
      if(i < min){
        min = i; // 穝程放
      }
      if(i > max) {
        max = i; // 穝程蔼放
      }
    }

    System.out.println("ヘ玡程放琌" + min + "");
    System.out.println("ヘ玡程蔼放琌" + max + "");
  }
}
