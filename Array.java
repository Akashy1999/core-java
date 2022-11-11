package interview.com;

public class Array {
	public static void main(String[] args) {

		int count=0;
		int count1=0;
		int number[]= {23,56,67,8,12,3,5,7,9,102,34,4,5};
		for(int i=0;i<number.length;i++)
		{
			if(number[i]%2==0) 
			{
				//count++;
				System.out.println("evan count is "+number[i]);
			}
			else
			{
				//count1++;
				count=number[i]++;
				System.out.println("odd count is "+number[i]);
				
				System.out.println("odd count is "+count);
			}
			
		}
		

	}

}
