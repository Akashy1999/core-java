package interview.com;

public class Interview {
 public static void reverce(String a) {
	 //String a="akash";
	 char b[]=a.toCharArray();
	 
	 for(int i=b.length-1;i>=0;i--) {
		 
    	System.out.print(b[i]);
		 
	 
	 }
 }
 
 public static void reverce(int b[]) {

	 for(int i=b.length-1;i>=0;i--) {
		 
    	System.out.print(b[i]);
		 
	 
	 }
 }

 public static void main(String[] args) {
	 int b[]= {2,3,4,6,7};
	 reverce("akash");
		System.out.println("");
	 reverce(b);
	
}
}
