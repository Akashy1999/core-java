import java.util.Scanner;

public class Arrayelements3and6 {
	public static void main(String[] args)
	{
		//
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("enetr the any one "+ "number ");
			int arr[]= {1,2,3,4,5,6,8,9,10};
			int a;
			a=s.nextInt();
			for(int i =1;i<arr.length;i++) {
				int n=a*arr[i];
				System.out.println(a+"*"+arr[i]+"="+n);

			}
		}


	}
}
