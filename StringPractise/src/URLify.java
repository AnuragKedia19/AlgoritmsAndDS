
public class URLify {

	public static void main(String[] args) {

			String str = "a b c d e    ";
			String st = " ";
			char[] ch = str.toCharArray();
			int count =0, len=0;
			for(int i=0;i<ch.length;i++) {
				
				if(ch[i]==' ') {
					
					if(count == 0) {
						len++;
					}
					
					count++;
					
					
					 if(count>1) {
						break;
					}
				}
				else {
					count = 0;
					len++;
				}
			}
			
			System.out.println(len);
			 
			for(int i=0; i<len-1; i++) {
				if(ch[i]==' ') {
					st = st+"%20";
							
				}
				else {
				st = st+ch[i];
				}

			}
			
			System.out.println(st);

	}

}
