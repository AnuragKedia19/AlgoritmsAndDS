package programmingInterview;

public class uniqueString {

	static boolean isUnique(String str) {
		if(str.length()>128)
			return false;
		
		boolean car_set[] = new boolean[128];
		for(int i=0;i<str.length();i++) {
			char val = str.charAt(i);
			if(car_set[val]) {
				return false;
			}
			car_set[val] = true;
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		String str = "qwertyuioplkjhgfdsazxcvbnmqWERTYUIOPLKJHGFDSAZXCVBNM";
		if(isUnique(str)) {
			System.out.println("It is a unique string");
		}
		else {
			System.out.println("It is not a unique String");
		}

	}

}
