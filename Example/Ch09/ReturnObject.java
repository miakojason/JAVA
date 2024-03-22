class Point {
	public int x; // x座標
	public int y; // y座標
	
	public Point(int x,int y) { // 建構方法
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p) { // 建構方法
		this.x = p.x;
		this.y = p.y;
	}
	
	public String toString() { // 轉成字串
		return x + "," + y;
	}
}

class Test {
	private Point pos; // private 成員
	
	public Test(Point p) { // 產生Point物件
		pos = new Point(p);
	}
	
	// 成員x與y的存取方法
	public Point getPos() {return new Point(pos);}
	public void setPos(Point p) {
		this.pos.x = p.x;
		this.pos.y = p.y;
	}
}

public class ReturnObject {

	public static void main(String[] argv){
		Test a = new Test(new Point(30,40));
		
		// 透過方法更改成員值
		a.setPos(new Point(80,80));
		
		// 透過方法取得成員值
		System.out.println("位置：" + a.getPos());
	}
}
