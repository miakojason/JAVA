public class ParkFeeIf {
  public static void main(String[] argv) {
    int hours = 0;
    int fee = 0;

    // 轉換為 int
    hours = Integer.parseInt(argv[0]);

    if(hours > 6) { // 先計算超過6小時的部分
            fee += (hours - 6) * 100;
            hours = 6;
    }

    if(hours > 4) { // 計算4~6小時的時段
            fee += (hours - 4) * 80;
            hours = 4;
    }

    if(hours > 2) { // 計算2~4小時的時段
            fee += (hours - 2) * 50;
            hours = 2;
    }

    if(hours > 0) { // 計算2小時內的時段
            fee += (hours - 0) * 30;
            hours = 0;
    }

    System.out.println("停車時數：" + argv[0] + "小時");
    System.out.println("應繳費用：" + fee + "元整");
  }
}
