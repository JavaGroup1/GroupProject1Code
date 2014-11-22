package symphony.domain;

public class Venue {
	protected int venueID;
	protected String name;
	protected String postalCode;
	protected String address;
	protected int numSeatsA;
	protected int numSeatsB;
	protected int numSeatsC;
	
	/**
	 * 
	 * @param name -Venue name
	 * @param postalCode -Venue Postal Code
	 * @param address -Venue Address
	 * @param seatsA -Number of class A seats at the venue
	 * @param seatsB -Number of class B seats at the venue
	 * @param seatsC -Number of class C seats at the venue
	 */
	public Venue(String name,String postalCode, String address, int seatsA, int seatsB, int seatsC){
		this.name = name;
		this.postalCode = postalCode;
		this.address = address;
		this.numSeatsA = seatsA;
		this.numSeatsB = seatsB;
		this.numSeatsC = seatsC;
	}
	
	public String getName(){return this.name;}
	public String getPostalCode(){return this.postalCode;}
	public String getAddress(){return this.address;}
	public int getNumSeatsA(){return this.numSeatsA;}
	public int getNumSeatsB(){return this.numSeatsB;}
	public int getNumSeatsC(){return this.numSeatsC;}
	
	public void setNumSeatsA(int a){this.numSeatsA = a;}
	public void setNumSeatsB(int b){this.numSeatsB = b;}
	public void setNumSeatsC(int c){this.numSeatsC = c;}
	
}
