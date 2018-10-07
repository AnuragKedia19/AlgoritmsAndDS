
public class Anagrams_permutations {

	static boolean compare(char[] a1, char a2[]) {
		
		for(int i=0;i<256;i++) {
			if(a1[i]!= a2[i]) {
				
				return false;
				
			}
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		String s1 = "BACDGABCDA";
		String s2 = "ABCD";
	
		
		char count1[] = new char[256];
		char count2[] = new char[256];
		int i;
		for (i=0;i<s2.length();i++) {
			
			count1[s1.charAt(i)]++;
			count2[s2.charAt(i)]++;
					
		}
		
		for(int k= s2.length(); k<s1.length();k++) {
		if(compare(count1, count2)) {
			
			System.out.println("Found at Index " +
                    (k - s2.length()));
			
			}
		
		count2[s1.charAt(k)]++;
		count2[s1.charAt(k-s2.length())]--;
		
			
			
			}
		
			if(compare(count1, count2)) {
			
			System.out.println("Found at Index " +
                    (s1.length() - s2.length()));
		
		}	
		 
				
		

	}

}
