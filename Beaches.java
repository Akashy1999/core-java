package tech;

public class Beaches 
{
	static String beachname[]= {null,null,null,null,null,null};
	static int i;

	public static void setbeachname(String name) 
	{
		if(beachname.length>i ) 
		{
			beachname[i]=name;
			i++;
		}
		else
		{
			System.out.println("check youer array[] its invalid" );
		}
	}
	public static void getbeachname() 
	{
		for(int i=0;i<beachname.length;i++) 
		{
			String ref =beachname[i];
			System.out.println("beachname is " +ref);
		}

	}
	public static boolean updatebeachname(String  newBeachnam,String oldBeachname ) 
	{
		System.out.println("update started");
		if(newBeachnam != null && oldBeachname != null) 	
		{
			for(int i=0;i<beachname.length;i++)
			{
				if(beachname[i]==oldBeachname) 
				{
					System.out.println("old Beach name is "+beachname[i] );
					beachname[i]= newBeachnam;
					System.out.println("new Beach name is "+beachname[i] );
					return true;
	
					
				}
			}
		}
		return false;
	}
	public static boolean updatebeachname(String  newbeachname,int existingname ) 
	{
		System.out.println("update started");
		if(newbeachname != null && existingname != -1) 	
		{
			for(int i=0;i<beachname.length;i++)
			{
				if(i== existingname) 
				{
					for(int a=0;a<beachname.length;a++) 
					{
						System.out.println("old Beach name is "+beachname[i] );
						beachname[i]= newbeachname;
						System.out.println("new Beach name is "+beachname[i] );
						return true;

					}
				}
			}
		}

		return false;
	}
	
}