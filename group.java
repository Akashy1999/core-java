package interview.com;

public class group {
	public static void add(int n) 
	{
		int a=n;
		while(n!=0) 
		{
			n=n/10;
			a=a*5;	
		}
		System.out.println("hi "+a);
	}
	public static void main(String[] args) {
//		write a program:-
//
//		"Jack really likes his number five: the trick here is that you have to "
//		+ "multiply each number by 5 raised to the number of digits of each numbers, so, for example:
//		multiply(3)==15 // 3 * 5�
//		multiply(10)==250 // 10 * 5�
//		multiply(200)==25000 // 200 * 5�
//		multiply(0)==0 // 0 * 5�"add
		
		add(10);
		
		
	}

}

