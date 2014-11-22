import java.util.ArrayList;
import java.util.List;

package symphony.domain;

public class Composition {
	protected int compositionID;
	protected List<Movement> movements = new ArrayList<Movement>();
	protected Composer composer;
	protected String name;
	
	public Composition(Composer c, String n){
		this.composer = c;
		this.name = n;
	}
	/*
	 * gets
	 */
	public int getCompositionID(){return this.compositionID;}
	public Composer getComposer(){return this.composer;}
	/*
	 * sets
	 */
	public int getMovementListSize(){return this.movements.size();}
	public Movement getMovementAt(int i){return this.movements.get(i);}
	public void addMovement(Movement m){this.movements.add(m);}
	
	
}
