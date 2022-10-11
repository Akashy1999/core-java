package tech;

public class AirportsInIndiaTester {
	public static void main(String[] args) {
		
	
	AirportsInIndia.setairports("Indira Gandhi International Airport");
	AirportsInIndia.setairports("Chhatrapati Shivaji International Airport");
	AirportsInIndia.setairports("Kempegowda International Airport");
	AirportsInIndia.setairports("Netaji Subhash Chandra Bose International Airport");
	AirportsInIndia.setairports("Rajiv Gandhi International Airport");
	AirportsInIndia.setairports("Varun Gandhi International Airport");
	AirportsInIndia.getairports();
	AirportsInIndia.updateairports("akash","Indira Gandhi International Airport");
	AirportsInIndia.getairports();
	AirportsInIndia.updateairports("sharu",4);
	AirportsInIndia.getairports();
	
	
}
}