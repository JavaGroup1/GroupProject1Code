package symphony.domain;
import java.util.ArrayList;
import java.util.List;


public abstract class Musician extends Employee{
	protected List<String> instrumentArray = new ArrayList<String>();
	protected String orchestraSection;
	protected String position;
	protected List<Integer> performanceIDs = new ArrayList<Integer>();
	
	protected Musician(){}
	/*
	 * sets
	 */
	public void setOrchestraSection(String section){this.orchestraSection = section;}
	public void setPosition(String position){this.position = position;}
	/*
	 * gets
	 */
	public String getOrchestraSection(){return this.orchestraSection;}
	public String getPosition(){return this.position;}
	/*
	 * instrument list accessors
	 */
	public void addInstrument(String instrument){instrumentArray.add(instrument);}
	public List<String> getInstrumentList(){return this.instrumentArray;}
	public boolean removeInstrument(String i){return this.instrumentArray.remove(i);}
	/*
	 * performance list accessor
	 */
	public void addPerformance(int p){this.performanceIDs.add(p);}
	public List<Integer> getPerformanceList(){return this.performanceIDs;}
	public boolean removePerformance(Integer p){return this.performanceIDs.remove(p);}
	
}
