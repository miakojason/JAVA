class P {
	static int s = 20;
}

class C1 extends P {
	static {
		s = 30;
	}
}

class C2 extends P {
	static {
		s = 40;
	}
}

class Test {
	public static void main(String args[])
	{
		P p = new P();
    System.out.println(p.s);
    C1 c1 = new C1();
    System.out.println(c1.s);
		C2 c2 = new C2();
    System.out.println(c2.s);
	}
}
