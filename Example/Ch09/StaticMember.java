class Test {
	public int x; // 個別物件擁有一份
	public static int y; // 所有此類別物件共享
	
	// 具有參數的建構方法
	public Test(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	// 轉成字串
	public String toString() {
		return "(x,y):(" + x + "," + y + ")";
	}
}

public class StaticMember {

	public static void main(String[] argv){
		Test a = new Test(100,40);
		Test b = new Test(200,50);
		Test c = new Test(300,60);
		System.out.println("物件a" + a);
		System.out.println("物件b" + b);
		System.out.println("物件c" + c);
	}
}