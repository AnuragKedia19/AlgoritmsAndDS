
public class String_Rotations {

	public static void main(String[] args) {
		
		String s1 = "CDAB";
		String s2 = "ABCD";
		
		if((s1+s1).contains(s2)) {
			System.out.println("true");
			System.exit(0);
		}
		
		System.out.println("False");

	}

}
