
public class PolindromeString {

	public static void main(String[] args) {
		  String str = "Akasshr", reverseStr ="";
		    
		    int a = str.length();

		    for (int i = a-1; i >=0; i--) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		   /* if (str.equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }	*/	 
		    System.out.println(reverseStr);

	}

}