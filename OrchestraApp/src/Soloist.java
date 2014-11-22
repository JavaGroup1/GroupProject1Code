import java.sql.Date;

package symphony.domain;

public class Soloist extends Musician{
	protected int soloistID;
	protected int movementNumber;
	
	private Soloist(int sID){
		this.soloistID = sID;
	}
	
	public static Builder newBuild(int sid, String fName, String lName){
		return new Builder(new Soloist(sid),fName, lName);
	}
	/*
	 * Builder for soloist
	 */
	public static class Builder{
		private Soloist soloist;
		private String newFirstName;
		private String newLastName;
		private Date newDateOfBirth;
		private String newEmail;
		private String newHomePhone;
		private String newCellPhone;
		private String newHomeAddress;
		private String newOrchestraSection;
		private String newPosition;
		private int newMovementNumber;
		
		private Builder(Soloist soloist,String fName, String lName){
			this.soloist = soloist;
			this.newFirstName = fName;
			this.newLastName = lName;
			this.newDateOfBirth = new Date(0, 0, 0);
			this.newEmail = new String();
			this.newHomePhone = new String();
			this.newCellPhone = new String();
			this.newHomeAddress = new String();
			this.newOrchestraSection = new String();
			this.newPosition = new String();
			this.newMovementNumber = 0;
		}
		
		public Builder dateOfBirth(Date dob){this.newDateOfBirth = dob; return this;}
		public Builder email(String e){this.newEmail = e;return this;}
		public Builder homePhone(String hp){this.newHomePhone = hp;return this;}
		public Builder cellPhone(String cp){this.newCellPhone = cp;return this;}
		public Builder homeAddress(String ha){this.newHomeAddress = ha;return this;}
		public Builder orchestraSection(String os){this.newOrchestraSection = os;return this;}
		public Builder position(String p){this.newPosition = p;return this;}
		public Builder movementNumber(int mn){this.newMovementNumber = mn;return this;}
		
		public Soloist build(){
			soloist.firstName = this.newFirstName;
			soloist.lastName = this.newLastName;
			soloist.dateOfBirth = this.newDateOfBirth;
			soloist.email = this.newEmail;
			soloist.homePhone = this.newHomePhone;
			soloist.cellPhone = this.newCellPhone;
			soloist.homeAddress = this.newHomeAddress;
			soloist.orchestraSection = this.newOrchestraSection;
			soloist.position = this.newPosition;
			soloist.movementNumber = this.newMovementNumber;
			return this.soloist;
		}
	}
	
	
}
