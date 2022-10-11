package tech;

public class Banks {
	static String banks[]= {null,null,null,null,null,null};
	static int i;

	public static void getbanks() 
	{
		for(int i=0;i<banks.length;i++) 
		{
			String ref =banks[i];
			System.out.println("Banks name is " +ref);
		}
		System.out.println("===================" );

	}
	public static boolean setbanks(String name) 
	{
		if(i<banks.length ) 
		{
			banks[i++]=name;
		}
		else
		{
			System.out.println("check youer array[] its invalid" );
		}
		
		return false;
	}

public static boolean updatebanks(String  newbanks,String oldbanks ) 
{
	System.out.println("update started");
	if(newbanks != null && oldbanks != null) 	
	{
		for(int i=0;i<banks.length;i++)
		{
			if(banks[i]==oldbanks) 
			{
				System.out.println("old Beach name is "+banks[i] );
				banks[i]= newbanks;
				System.out.println("new Beach name is "+banks[i] );
				return true;
			}
		}
	}
	return false;
}
public static boolean updatebanks(String newbanks,int existingname) 
{
	System.out.println("update started");
	if(newbanks != null && existingname != -1) 	
	{
		for(int i=0;i<banks.length;i++)
		{
			if(i== existingname) 
			{
				for(int a=0;a<banks.length;a++) 
				{
					System.out.println("old Beach name is "+banks[i] );
					banks[i]= newbanks;
					System.out.println("new Beach name is "+banks[i] );
					return true;

				}
			}
		}
	}
	return false;
}
}