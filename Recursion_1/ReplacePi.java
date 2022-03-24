package recursion.test;

public class ReplacePi {

	public static void main(String[] args) {
		
		System.out.println(replacePi("abpiappiapiiipia"));
		
	}

	private static String replacePi(String string) {
		
		if(string.length()<=1) {
			return string;
		}
		
		if(string.charAt(0)=='p' && string.charAt(1) == 'i') {
			String small = replacePi(string.substring(2));
			return "3.14" + small;
		}
		else{
			String small = replacePi(string.substring(1));
			return string.charAt(0) + small;
		}
	}
}
