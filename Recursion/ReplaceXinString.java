package recursion.test;

public class ReplaceXinString {
	
	public static void main(String[] args) {
		
		System.out.println(removeX("Removexfromthisxstringx"));
		
	}

	
	public static String removeX(String input){
        // Write your code here

        if(input.length()==0){
            return input;
        }

        String st = removeX(input.substring(1));

        if(input.charAt(0) == 'x'){
            //System.out.println("index found x");
            return st;
        }
        else{
            //  System.out.println("index not found x");
            return input.charAt(0)+st;
        }
    }

}
