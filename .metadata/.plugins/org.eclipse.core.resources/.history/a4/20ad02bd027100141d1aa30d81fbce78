import java.sql.Date;


public class Soloist extends Musician{
	protected int soloistID;
	protected int movementNumber;
	
	private Soloist(int sID){
		this.soloistID = sID;
	}
	
	public Builder newBuild(int sid, String fName, String lName){
		return new Builder(new Soloist(sid),fName, lName);
	}
	
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
		
		public void dateOfBirth(Date dob){this.newDateOfBirth = dob;}
		public void email(String e){this.newEmail = e;}
		public void homePhone(String hp){this.newHomePhone = hp;}
		public void cellPhone(String cp){this.newCellPhone = cp;}
		public void homeAddress(String ha){this.newHomeAddress = ha;}
		public void orchestraSection(String os){this.newOrchestraSection = os;}
		public void position(String p){this.newPosition = p;}
		public void movementNumber(int mn){this.newMovementNumber = mn;}
		
		public Person build(){
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
