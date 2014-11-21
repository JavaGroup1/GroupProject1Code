import java.sql.Date;

package symphony.domain;


public class Conductor extends Musician {
	protected int conductorID;
	
	private Conductor(int cid){
		this.conductorID = cid;
	}
	
	//builder
	
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
		
		public void dateOfBirth(Date dob){this.newDateOfBirth = dob;}
		public void email(String e){this.newEmail = e;}
		public void homePhone(String hp){this.newHomePhone = hp;}
		public void cellPhone(String cp){this.newCellPhone = cp;}
		public void homeAddress(String ha){this.newHomeAddress = ha;}
		public void orchestraSection(String os){this.newOrchestraSection = os;}
		public void position(String p){this.newPosition = p;}
		
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
	
	public Builder newBuild(int i, String fName, String lName){
		return new Builder(new Conductor(i), fName, lName);
	}
	
	
	
}
