package interview.com;

public class Arraywitheachvaluedoubled {
int a[]= {1,2,3};

	void arraydoub() 
	{
		for(int i=0;i<a.length;i++)
		{
			int c=a[i]+a[i];
			//System.out.println(c);
		
		int num[]=new int[1];
		for(int j=0;j<num.length;j++) {
			num[j]=c;
			System.out.print(" "+num[j]);
		}
		}
	}
	public static void main(String[] args) {
		Arraywitheachvaluedoubled b=new Arraywitheachvaluedoubled();
		System.out.println("Array with each value doubled");
		b.arraydoub();
	}
}

