class Utility {
  public static int min(int[] data) {
    int min = data[0];  // 盢じ 0 讽Θ程

    // 硋浪琩皚じ, Τ礚ゑ min 
    for(int i = 1;i < data.length;i++) {
      min = (min <= data[i]) ? min : data[i];
    }
    return min;
  }

  public static int max(int[] data) {
    int max = data[0];  // 盢じ 0 讽Θ程

    // 硋浪琩皚じ, Τ礚ゑ max 
    for(int i = 1;i < data.length;i++) {
      max = (max >= data[i]) ? max : data[i];
    }
    return max;
  }

}

public class MinMax {

  public static void main(String[] argv){
    int[] data = {9,10,37,3,29,44,9};

    System.out.println("程" + Utility.min(data));
    System.out.println("程" + Utility.max(data));
  }
}
