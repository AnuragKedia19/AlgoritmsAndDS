
public class StringCompress {

	public static void main(String[] args) {
		String str = "Anurag";
		int finalLen = compress(str);
		if(finalLen>=str.length()) {
			System.out.println(str);
			System.exit(0);
		}
		StringBuilder sb = new StringBuilder();
		int i=0, count=0;
		while(i<str.length()) {
			
			if((i+1>=str.length()) || (str.charAt(i)!=str.charAt(i+1))){
				 sb.append(str.charAt(i));
				 sb.append(Integer.toString(count));
				 count=0;
								
			}
			else {
				count++;
			}
			i++;
		}
		
		String st = new String(sb);
		System.out.println(st);
	}

	private static int compress(String str) {
		int i=0, count=0,compres=0;
		while(i<str.length()) {
			
			if((i+1>=str.length()) || (str.charAt(i)!=str.charAt(i+1))){
				 compres =compres + 1 + String.valueOf(count).length();
							count=0;	
			}
			else {
				count++;
			}
			i++;
		}
		return compres;
	}

}
