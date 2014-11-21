import java.sql.Date;

package symphony.domain;

public class Ticket {
	
	public Ticket(double price, String seatSection, char grade,
			Date concertDate, Concert concert) {
		super();
		this.price = price;
		this.seatSection = seatSection;
		this.grade = grade;
		this.concertDate = concertDate;
		this.concert = concert;
	}
	private double price;
	private String ticketID;
	private String seatSection;
	private char grade;
	private Date concertDate;
	private Concert concert;
	
	
	
	public double getPrice() {return price;}
	public String getTicketID() {return ticketID;}
	public String getSeatSection() {return seatSection;}
	public char getGrade() {return grade;}
	public Date getConcertDate() {return concertDate;}
	public Concert getConcert() {return concert;}
	

	
	
}
