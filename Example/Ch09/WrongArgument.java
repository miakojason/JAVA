class Test {
	int x,y;
	
	// ㄣΤ把计篶よ猭
	Test(int initX,int initY) { // 惠璶2把计
		x = initX;
		y = initY;
	}
}

public class WrongArgument {

	public static void main(String[] argv){
		Test a = new Test(30); // ぶ1把计
		System.out.println("Θx" + a.x);
		System.out.println("Θy" + a.y);
	}
}