import java.sql.Date;

package symphony.domain;


public class Conductor extends Musician {
	protected int conductorID;
	
	private Conductor(int cid){
		this.conductorID = cid;
	}
	
	
	/*
	 * builder for conductor
	 */
	public static class Builder{
		private Conductor conductor;
		private String newFirstName;
		private String newLastName;
		private Date newDateOfBirth;
		private String newEmail;
		private String newHomePhone;
		private String newCellPhone;
		private String newHomeAddress;
		private String newOrchestraSection;
		private String newPosition;
		
		private Builder(Conductor conductor,String fName, String lName){
			this.conductor = conductor;
			this.newFirstName = fName;
			this.newLastName = lName;
			this.newDateOfBirth = new Date(0, 0, 0);
			this.newEmail = new String();
			this.newHomePhone = new String();
			this.newCellPhone = new String();
			this.newHomeAddress = new String();
			this.newOrchestraSection = new String();
			this.newPosition = new String();
		}
		
		public Builder dateOfBirth(Date dob){this.newDateOfBirth = dob;return this;}
		public Builder email(String e){this.newEmail = e;return this;}
		public Builder homePhone(String hp){this.newHomePhone = hp;return this;}
		public Builder cellPhone(String cp){this.newCellPhone = cp;return this;}
		public Builder homeAddress(String ha){this.newHomeAddress = ha;return this;}
		public Builder orchestraSection(String os){this.newOrchestraSection = os;return this;}
		public Builder position(String p){this.newPosition = p;return this;}
		
		public Person build(){
			conductor.firstName = this.newFirstName;
			conductor.lastName = this.newLastName;
			conductor.dateOfBirth = this.newDateOfBirth;
			conductor.email = this.newEmail;
			conductor.homePhone = this.newHomePhone;
			conductor.cellPhone = this.newCellPhone;
			conductor.homeAddress = this.newHomeAddress;
			conductor.orchestraSection = this.newOrchestraSection;
			conductor.position = this.newPosition;
			return this.conductor;
		}
	}
	
	public static Builder newBuild(int i, String fName, String lName){
		return new Builder(new Conductor(i), fName, lName);
	}
	
	public int getConductorID(){return this.conductorID;}
	
}
