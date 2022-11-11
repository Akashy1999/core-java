
import java.util.Scanner;

public class Factorial {	
	static int factorial(int n)
	{
		if(n!=0)
		{
			return n*factorial(n-1);
		}
		else
		{
			return 1 ;

		}
	}

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);

		int n=s.nextInt();

		int fac=factorial(n);
		System.out.println(fac);


	}

}
