
public class Anagrams1 {

	public static void main(String[] args) {
		
		String s1 = "abaabbbbbnb";
		String s2 = "baaabbbbbnb";
		
		int count[] = new int[256];
		int i,flag=0;
		for (i=0;i<s1.length()&& i<s2.length();i++) {
			
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
			
		}
		
		if(s1.length()!=s2.length()) {
			flag=1;
		}
		
		for (i = 0; i < 256; i++) {
            if (count[i]!=0) {
            	flag=1;
            	break;
            }
		} 
				
		
		if(flag!=0) {
			System.out.println("Not a Anagram");
		}
		
		else {
			System.out.println("Anagram");
		}
		
  
		

	}

}
