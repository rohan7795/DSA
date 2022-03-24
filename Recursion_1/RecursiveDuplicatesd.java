package recursion.test;

public class RecursiveDuplicatesd {
	
	public static void main(String[] args) {
		System.out.println(removeConsecutiveDuplicates("cooddiiinggg ninnnnjaanaasss"));
		
	}
	
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here

        
        if(s.length()<=1){
            return s;
        }
        
    	if(s.charAt(0) == s.charAt(1)){
          //System.out.println(s);
            String st = removeConsecutiveDuplicates(s.substring(1));
           //ystem.out.println("return "+s.charAt(0)+st);
            return st;
        }
        else{
        	String st = removeConsecutiveDuplicates(s.substring(1));
            return s.charAt(0)+st;
        }
	}

}
