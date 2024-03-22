import java.io.*;

class HanoiTowerGame {

  void go(int discs) {
    hanoiTower('A','C','B',discs);
  }

  // 實際搬動碟子
  void moveDisc(char source,char target,int disc){
    System.out.println("將" + disc + "號碟子從柱子 " +
      source + " 搬到 " + target);
  }

  // a：來源柱子
  // c：目的地
  // b：中間的柱子
  // discs：碟子數量
  void hanoiTower(char a,char c,char b,int discs) {
    if (discs == 1) { // 直接搬動，遞迴結束
      moveDisc(a,c,discs);
      return;
    }

    // 先將最大碟子以外的碟子搬到B
    hanoiTower(a,b,c,discs - 1);

    // 把最大的碟子搬到C
    moveDisc(a,c,discs);

    // 把搬到B的碟子搬到C
    hanoiTower(b,c,a,discs - 1);
  }
}

public class HanoiTower {

  public static void main(String[] argv) throws IOException{
    HanoiTowerGame game = new HanoiTowerGame();

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("請輸入碟子數量：");
    int discs = java.lang.Integer.parseInt(br.readLine());

    game.go(discs);
  }
}