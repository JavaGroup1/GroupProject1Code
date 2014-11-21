import java.util.ArrayList;
import java.util.List;


public class TicketSales {
	private double grossSales;
	private double netSales;
	private int numSold;
	private double taxes;
	private double basePricePerTicket;
	private List<Customer> customerList = new ArrayList<Customer>();
	private static TicketSales ticketSales;
	
	private TicketSales(){
		this.taxes = 0.13; 	//Assuming all concerts occur in Ontario and the tax remains constant
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public double getNetSales() {
		return netSales;
	}

	public int getNumSold() {
		return numSold;
	}

	public static TicketSales getTicketSales() {
		if(null == ticketSales){ticketSales = new TicketSales();}
		return ticketSales;
	}
	
	
	public void sellTicket(Concert concert, Customer customer, char seatType, int seats) throws ApplicationException{
		double cost;
		boolean seatsLeft = true;
		switch(seatType){
			case 'a': 
				cost = this.basePricePerTicket * 1.50;
				
				break;
			case 'b':
				cost = this.basePricePerTicket * 1.25;
				break;
				
			case 'c':
				cost = this.basePricePerTicket;
				break;
			default:
				cost = 0;
				break;
		}
		try{
			
		}
		catch(Exception ex){
			
		}
		
		//TODO
	}
	
	public void sellConcertSeason(Customer c, char seatType){
		
		//TODO
	}
	
}
