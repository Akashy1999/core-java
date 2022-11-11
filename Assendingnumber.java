import java.util.Scanner;

public class Assendingnumber
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		 System.out.print("Enter size of array:");
		int b= s.nextInt();
		int a[] = new int[b];
		int temp=0;
		System.out.println("array element are ");
	
		for (int i = 0; i < b; i++) 
		{
			a[i] = s.nextInt();
		}
		for(int i=0;i<b; i++) 
		{
			for(int j=i+1;j<b; j++)
			{
				if(a[i]>a[j]) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Elements of array sorted in ascending order: ");    
		for (int i = 0;i<a.length;i++)
		{     
			System.out.print(a[i] + " ");  
		}
		System.out.println("first largest number "+a[b - 1]+ " secand largest number "+a[b - 2]);
		System.out.println("first smallest number "+a[0]+" secand smallest number: "+a[1]);
		//System.out.println("first smallest number "+a[b - 1]+ " secand smallest number: "+a[b - 2]);
	//	System.out.println("first largest number "+a[0]+"  secand largest number "+a[1]);
	}
	}
