public class ParkFeeArray {
  public static void main(String[] argv) {
    int[] hourTable = {0,2,4,6}; // 時段
    int[] feeTable = {30,50,80,100}; // 時段費率
    int hours = Integer.parseInt(argv[0]);; //停車時數
    int fee = 0; //停車費用

    int i = hourTable.length - 1;
    while(i > 0) {// 先找出最高費率區段
      if(hourTable[i] < hours)
        break;
      i--;
    }

    while(i >= 0) { // 由最高費率區段往下累加
      fee += (hours - hourTable[i]) * feeTable[i];
      hours = hourTable[i];
      i--;
    }

    System.out.println("停車時數：" + argv[0] + "小時");
    System.out.println("應繳費用：" + fee + "元整");
  }
}
