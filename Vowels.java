
public class Vowels {
 
	    public static void main(String[] args) {  
	        int vowel  = 0, consonant = 0;  
	        String str = "This is a really simple sentence";  
	        str = str.toLowerCase();  
	          
	        for(int i = 0; i < str.length(); i++) {  
	            //Checks whether a character is a vowel  
	            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
	                //Increments the vowel counter  
	            	vowel ++;  
	            }  
	            //Checks whether a character is a consonant  
	            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
	                //Increments the consonant counter  
	            	consonant++;  
	            }  
	        }  
	        System.out.println("Number of vowels: " + vowel );  
	        System.out.println("Number of consonants: " + consonant);  
	    }  
	}  


