package tech;

public class FurnitureTester 
{
	public static void main(String args[])
	{
		Furniture.setname("Kartell");
		Furniture.setcolor("black");
		Furniture.setprice(30000);
		System.out.println("==================================");
		System.out.println("Name is " +Furniture.getname());
		System.out.println("==================================");
	   System.out.println("Color is " +Furniture.getcolor());
	   System.out.println("==================================");
	
	  System.out.println("Price is " +Furniture.getprice());
	
	}
	

}