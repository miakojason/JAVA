public class PlayDice {
  public static void main(String[] argv) {
    int[] data = new int[19]; // 纗耏浑翴计瞷Ω计
    int base=0;
    for(int i=1;i<=6;i++)     // 2 癹伴だ 2 浑
      for(int j=1;j<=6;j++) { // i+j 碞琌耏翴计
        data[i+j]++;          // 盢Ω计じ 1
        base++;               //
      }

    for(int point=0;point<data.length;point++)
      if(data[point]>0)
        System.out.println("耏"+ point + "翴诀瞯" +
                           base+ "だぇ" + data[point]);
  }
}

