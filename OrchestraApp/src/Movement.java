package symphony.domain;

public class Movement {
	private String movementID;
	private String movementName;
	private Composition composition;
	private Soloist soloist;
	
	public Movement(String id, String name)
	{
		this.movementID = id;
		this.movementName = name;
	}
	
	/*
	 * gets
	 */
	public String getMovementName() {return movementName;}
	public String getMovementID() {	return movementID;	}
	public Composition getComposition() {return composition;}
	public Soloist getSoloist() {return soloist;}
	/*
	 * sets
	 */
	public void setMovementName(String movementName) {movementName = movementName;}
	public void setSoloist(Soloist soloist) {this.soloist = soloist;}

}
