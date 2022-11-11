import java.util.Scanner;

public class Prime {
	


	static int check(int num)
	{
		for(int i=1;i<=num/2;i++) {

			if(num%i==0)
			{
				return 1;
			}
			else
			{
				return 0;
			}
			
		}return 0;
	}

		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			int num=s.nextInt();
			
			int pri=check(num);
			System.out.println(pri);
		}
}

