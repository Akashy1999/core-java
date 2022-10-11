package tech;

public class AirportsInIndia {

	static String airports[]= {null,null,null,null,null,null};
	static int i;


	public static void setairports(String name) 
	{
		if(airports.length>i ) 
		{
			airports[i]=name;
			i++;
		}
		else
		{
			System.out.println("check youer array[] its invalid" );
		}
	}
	public static void getairports() 
	{
		for(int i=0;i<airports.length;i++)
		{

			String ref =airports[i];

			System.out.println("AirportsInIndia is " +ref);

		}
		System.out.println("*************************" );
	}

		public static boolean updateairports(String  newairports,String oldairports ) 
	{
		System.out.println("update started");
		if(newairports != null && oldairports != null) 	
		{
			for(int i=0;i<airports.length;i++)
			{
				if(airports[i]==oldairports) 
				{
					System.out.println("old Beach name is "+airports[i] );
					airports[i]= newairports;
					System.out.println("new Beach name is "+airports[i] );
					return true;
				}
			}
		}
		return false;
	}
	public static boolean updateairports(String  newairports,int existingname ) 
	{
		System.out.println("update started");
		if(newairports != null && existingname != 0) 	
		{
			for(int i=0;i<airports.length;i++)
			{
				if(i== existingname) 
				{
					for(int a=0;a<airports.length;a++) 
					{
						System.out.println("old Beach name is "+airports[i] );
						airports[i]= newairports;
						System.out.println("new Beach name is "+airports[i] );
						return true;

					}
				}
			}
		}

		return false;
	}
}
