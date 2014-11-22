package symphony.domain;
import java.sql.Date;


public class Ticket {
	
	public Ticket(double price, String seatSection, char grade,
			Date concertDate, Concert concert) {
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
	
	
	/*
	 * Gets
	 */
	/**
	 * 
	 * @return price of ticket
	 */
	public double getPrice() {return price;}
	/**
	 * 
	 * @return Ticket id
	 */
	public String getTicketID() {return ticketID;}
	/**
	 * 
	 * @returnseat section
	 */
	public String getSeatSection() {return seatSection;}
	/**
	 * 
	 * @return Grade of seat 
	 */
	public char getGrade() {return grade;}
	/**
	 * 
	 * @return Date of Concert
	 */
	public Date getConcertDate() {return concertDate;}
	/**
	 * 
	 * @return Concert
	 */
	public Concert getConcert() {return concert;}
}
