import java.util.ArrayList;
import java.util.List;

package symphony.domain;

public class Orchestra {
	public Orchestra() {	}
	private Conductor conductor;
	private int orechestraID;
	private List<Soloist> soloists = new ArrayList<Soloist>();
	
	
	public Conductor getConductor() {return conductor;}
	public int getOrechestraID() {return orechestraID;}
	
	
	
	
}
