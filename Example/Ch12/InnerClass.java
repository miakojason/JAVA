class Outter {   // 场摸
  private int i = 1, j = 2; // 龟砰跑计
  static int k = 3;         // 繰篈跑计

  class Inner {    // ず场摸
  	int j = 4, k = 5;  // 綛籠场跑计 jk
  	void print() { 
  	  System.out.print(i);             //场龟砰跑计
  	  System.out.print(Outter.this.j); //砆綛籠场龟砰跑计
  	  System.out.print(Outter.k);      //砆綛籠场繰篈跑计
  	  System.out.println(j);           //ず场龟砰跑计
    }
  }
  void callInner() {   // 场摸よ猭
    Inner in = new Inner();  // 场摸よ猭い, ゲ斗ミず场ン
    in.print();              // 礛ノウㄓ㊣ず场摸よ猭
  }
}

public class InnerClass {
  public static void main(String[] argv) {
  	Outter or = new Outter();         // ミ场ン
  	or.callInner();                   // ㊣场ンよ猭
  	Outter.Inner ir = or.new Inner(); // ノ场ンミず场ン
  	ir.print();
  }
}
