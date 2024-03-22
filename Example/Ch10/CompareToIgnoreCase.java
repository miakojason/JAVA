public class CompareToIgnoreCase {	
	
	public static void main(String[] argv) {
		String a = "abcd";
		System.out.println(a.compareToIgnoreCase("ABCB"));
		System.out.println(a.compareToIgnoreCase("ABCD"));
		System.out.println(a.compareToIgnoreCase("ABCE"));
	}
}