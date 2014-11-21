import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

package symphony.domain;

public class ConcertSeason {
	private ConcertSeason concertSeason;
	private Date startDate;
	private List<Concert> concerts = new ArrayList<Concert>();
	
	
	private ConcertSeason(){}
	
	public ConcertSeason getConcertSeason(){
		if(this.concertSeason == null){
			this.concertSeason = new ConcertSeason();
		}
		return this.concertSeason;
	}
	
	public List<Concert> getConcertList(){return this.concerts;}
	public void addConcert(Concert c){this.concerts.add(c);}
	public void removeConcertAt(int i){this.concerts.remove(i);}
	
	public Date getStartDate(){return this.startDate;}
	public void setStartDate(Date d){this.startDate = d;}
	
	
}
