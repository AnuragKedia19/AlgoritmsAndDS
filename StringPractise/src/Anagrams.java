import java.util.Arrays;

// O(n(1+logn)) is Time Complexity. 

public class Anagrams {

	public static void main(String[] args) {
		
		String s1 = "abaabbbb";
		String s2 = "baaabbbb";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		if(s1.length() == s2.length()) {
		Arrays.sort(c1);
		Arrays.sort(c2);
		int i;
		for( i=0;i<c1.length;i++) {
			
			if(c1[i]!=c2[i]) {
				break;
			}
			
		}
		
		if(i!=c1.length) {
			System.out.println("Not an Anagram");
		}
		
		else {
			System.out.println("an Anagram");
		}
		
		
	  }
		
		else {
			
			System.out.println("Not an Anagram");
			
			
		}
		

	}

}
