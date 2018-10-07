import java.util.HashSet;
import java.util.Iterator;



public class permutationPali {
	
		public static void main(String args[]) {
			  
			String str = "aaabbd dee";
			int count[] = new int[256];
			int res = 0;
			int even=0,odd=0;
			HashSet<Character> se = new HashSet<Character>();
			
			for(int i=0;i<str.length();i++) {
				
				count[str.charAt(i)]++;
				se.add(str.charAt(i));
				if(str.charAt(i)==' ') {
					res++;
				}
				
				
			}
			for(int i=0;i<str.length();i++) {
				
				
						
						System.out.println(str.charAt(i)+ " "+count[str.charAt(i)]);
					
				
			}
			
			//Iterator itr = se.iterator();
			for(char c : se) {
				
				if((se.contains(c)) && (c!=' ')) {
					if(count[c]%2==0) {
						even++;
						System.out.println(c);
					}
					else{
						odd++;
						System.out.println(c);
					}
				}
			}
			
			if(se.size()-1-res==(even)) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
				
			
			
			
		}
}
