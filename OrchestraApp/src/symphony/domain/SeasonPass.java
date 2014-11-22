package symphony.domain; 
import java.sql.Date;


public class SeasonPass {
	
	public SeasonPass(double price, String seatSection, char grade,
			ConcertSeason concertSeason) 
	{
		super();
		this.price = price;
		this.seatSection = seatSection;
		this.grade = grade;
		this.concertSeason = concertSeason;
	}
	private double price;
	private String ticketID;
	private String seatSection;
	private char grade;
	private ConcertSeason concertSeason;
	/*
	 * gets
	 */
	public double getPrice() {
		return price;
	}
	public String getTicketID() {
		return ticketID;
	}
	public String getSeatSection() {
		return seatSection;
	}
	public char getGrade() {
		return grade;
	}
	public ConcertSeason getConcertSeason() {
		return concertSeason;
	}
	
	
	
}