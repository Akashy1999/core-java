package tech;

public class StadiumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stadium.setstadiumName("Kanteerava Stadium");
		Stadium.setstadiumName ("a multi-purpose stadium");
		Stadium.setstadiumName("Chinnaswamy Stadium");
		Stadium.setstadiumName("cricket stadium");
		Stadium.setstadiumName("Bangalore Football Stadium");
		Stadium.getstadiumName();
		Stadium.updatestadiumName("cricket stadium","Hockey Stadium");
		Stadium.getstadiumName();
		Stadium.updatestadiumName("Kabaddi court ",4);
		Stadium.getstadiumName();
		
		

	}

}

