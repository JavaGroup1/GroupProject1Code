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
	private List<Ticket> tickets = new ArrayList<Ticket>();
	private List<SeasonPass> seasonPasses = new ArrayList<SeasonPass>();
	
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
	
	
	public Ticket sellTicket(Concert concert, Customer customer, char seatType, int seats) throws ApplicationException{
		double cost = 0;
		boolean seatsLeft = true;
		
		if(concert == null){throw new ApplicationException("No concert selected");}
		if(customer == null){throw new ApplicationException("No customer selected");}
		switch(seatType){
			case 'a': 
				cost = this.basePricePerTicket * 1.50;
				seatsLeft = concert.checkSeatsA(seats);
				break;
			case 'b':
				cost = this.basePricePerTicket * 1.25;
				seatsLeft = concert.checkSeatsB(seats);
				break;
				
			case 'c':
				cost = this.basePricePerTicket;
				seatsLeft = concert.checkSeatsC(seats);
				break;
			default:
				cost = 0;
				break;
		}
		
		
		if(!seatsLeft){throw new ApplicationException("Sorry no seats avaliable.");}
		
		
		switch(seatType){
			case 'a': 
				concert.removeSeatsA(seats);
				break;
			case 'b':
				concert.removeSeatsB(seats);
				break;
			case 'c':
				concert.removeSeatsC(seats);
				break;
		}
		customer.chargeCustomer(cost * this.taxes);
		
		this.grossSales = cost * this.taxes;
		this.netSales = cost;
		this.numSold = seats;
		Ticket temp = new Ticket(cost * this.taxes, "where ever you can", seatType, concert.getPerformanceDate(), concert);
		this.tickets.add(temp);
		return temp;
	}
	
	public SeasonPass sellConcertSeason(Customer customer, char seatType, int seats) throws ApplicationException{
		ConcertSeason season = ConcertSeason.getConcertSeason();
		List<Concert> bookedConcerts = new ArrayList<Concert>();
		boolean seatsLeft = true;
		double cost = 0;
		if(season.getConcertList().size() == 0){throw new ApplicationException("Season has no concerts");}
		if(customer == null){throw new ApplicationException("No customer selected");}
		
		
		for(Concert concert : season.getConcertList()){
			switch(seatType){
				case 'a': 
					cost = this.basePricePerTicket * 1.50;
					seatsLeft = concert.checkSeatsA(seats);
					break;
				case 'b':
					cost = this.basePricePerTicket * 1.25;
					seatsLeft = concert.checkSeatsB(seats);
					break;
					
				case 'c':
					cost = this.basePricePerTicket;
					seatsLeft = concert.checkSeatsC(seats);
					break;
				default:
					cost = 0;
					break;
			}
		}
		
		if(!seatsLeft){throw new ApplicationException("Sorry no seats avaliable.");}
		
		try{
			for(Concert concert : season.getConcertList()){
				switch(seatType){
					case 'a': 
						concert.removeSeatsA(seats);
						break;
					case 'b':
						concert.removeSeatsB(seats);
						break;
					case 'c':
						concert.removeSeatsC(seats);
						break;
				}
				bookedConcerts.add(concert);
			}
		customer.chargeCustomer(cost * this.taxes * season.getConcertList().size());
		this.grossSales += cost * this.taxes * season.getConcertList().size();
		this.netSales += cost * season.getConcertList().size();	
		}catch(Exception ex){
			// undo the seats
			for(Concert concert: bookedConcerts)
			{
				switch(seatType){
					case 'a': 
						concert.addSeatsA(seats);
						break;
					case 'b':
						concert.addSeatsB(seats);
						break;
					case 'c':
						concert.addSeatsC(seats);
						break;
				}
			}
			throw ex;
		}
		SeasonPass temp = new SeasonPass(cost * this.taxes * season.getConcertList().size() , "Where ever you can", seatType, season);
		this.seasonPasses.add(temp);
		return temp;
	}
}
