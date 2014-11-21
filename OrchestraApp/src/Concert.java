import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

package symphony.domain;

public class Concert {
	private int concertID;
	private Date performanceDate;
	private Orchestra orchestra;
	private List<Composition> compositions = new ArrayList<Composition>();
	private Venue venue;
	protected int seatsLeftA;
	protected int seatsLeftB;
	protected int seatsLeftC;
	
	public Concert(Venue v, Date d, Orchestra o){
		this.venue = v;
		this.seatsLeftA = this.venue.getNumSeatsA();
		this.seatsLeftB = this.venue.getNumSeatsB();
		this.seatsLeftC = this.venue.getNumSeatsC();
		this.performanceDate = d;
		this.orchestra = o;
	}
	
	public Concert(Venue v, Date d){ 
		this(v,d, new Orchestra());
	}
	
	
	public int getConcertID(){return this.concertID;}
	public Date getPerformanceDate(){return this.performanceDate;}
	public Orchestra getOrchestra(){return this.orchestra;}
	public Venue getVenue(){return this.venue;}
	
	public int getCompositionListSize(){return this.compositions.size();}
	public Composition getCompositionAt(int i){return this.compositions.get(i);}
	public void addComposition(Composition c){this.compositions.add(c);}
	
	public void setPerformanceDate(Date d){this.performanceDate = d;}
	public void setOrchestra(Orchestra o){this.orchestra = o;}
	public void setVenue(Venue v){this.venue = v;}
}
