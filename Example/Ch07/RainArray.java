public class RainArray {
  public static void main(String[] argv) {
    String[] city= {"臺北", "基隆", "宜蘭"};
    double[][] rain= // 月平均雨量
          // 一月   二     三     四     五     六
           {{83.2 , 170.3, 180.4, 177.8, 234.5, 325.9},  // 臺北
            {331.6, 397.0, 321.0, 242.0, 285.1, 301.6},  // 基隆
            {147.0, 182.3, 127.5, 138.4, 211.7, 214.2}}; // 宜蘭
    int indexMin=0, indexMax=0;  // 最低、高的城市索引先設為 0

    // 找各月份雨量最低、最高者
    for(int month=0; month<6; month++){
      for(int i=0; i<rain.length; i++) { // 找月平均雨量最低、最高者
        if(rain[i][month] < rain[indexMin][month])
           indexMin = i; // 更新平均雨量最低的城市索引

        if(rain[i][month] > rain[indexMax][month])
            indexMax = i; // 更新平均雨量最高的城市索引
      }

      System.out.println((month+1)+"月平均雨量最低："
                + city[indexMin] + "\t最高：" + city[indexMax]);
    }
  }
}
