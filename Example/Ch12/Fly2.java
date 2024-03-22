interface Flyable { // 定義 Flyable 介面
	void fly(); // 定義方法
}

class Bird implements Flyable { // 定義實作 Flyable 介面的類別
	public void fly() { // 實作介面中的方法
		System.out.println("我鼓鼓翅膀就可以飛行！");
	}
}

public class Fly2 {
	public static void goHome(Flyable f) {
		f.fly();
	}
	public static void main(String[] argv) {
		Bird b = new Bird();
		goHome(b);
	}
}