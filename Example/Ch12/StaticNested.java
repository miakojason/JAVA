
class Outter {
	static class Inner { // 靜態內部類別
		int i = 1;
		static int j = 2;     // 靜態變數
		void print() { System.out.print(i + "," + j); }
		static void add(int x) { j += x; } // 靜態方法
	}
}
public class StaticNested {
  public static void main(String[] argv) {
  	Outter.Inner a = new Outter.Inner(); // 直接建立靜態內部物件
  	a.i = 3;
  	Outter.Inner.j = 4;   // 以類別名稱存取靜態變數
  	Outter.Inner.add(5);  // 以類別名稱呼叫靜態方法
  	a.print();
  }
}
