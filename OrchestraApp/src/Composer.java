import java.sql.Date;

package symphony.domain;


public class Composer extends Person{
	protected Date dateOfDeath;
	protected int composerID;
	
	private Composer(int cID, Date dd){}
	
	//builder
	public static class Builder{
		private Composer composer;
		private String newFirstName;
		private String newLastName;
		private Date newDateOfBirth;
		private String newEmail;
		private String newHomePhone;
		private String newCellPhone;
		private String newHomeAddress;
		
		private Builder(Composer composer,String fName, String lName){
			this.composer = composer;
			this.newFirstName = fName;
			this.newLastName = lName;
			this.newDateOfBirth = new Date(0, 0, 0);
			this.newEmail = new String();
			this.newHomePhone = new String();
			this.newCellPhone = new String();
			this.newHomeAddress = new String();
		}
		
		public void dateOfBirth(Date dob){this.newDateOfBirth = dob;}
		public void email(String e){this.newEmail = e;}
		public void homePhone(String hp){this.newHomePhone = hp;}
		public void cellPhone(String cp){this.newCellPhone = cp;}
		public void homeAddress(String ha){this.newHomeAddress = ha;}
		
		public Person build(){
			composer.firstName = this.newFirstName;
			composer.lastName = this.newLastName;
			composer.dateOfBirth = this.newDateOfBirth;
			composer.email = this.newEmail;
			composer.homePhone = this.newHomePhone;
			composer.cellPhone = this.newCellPhone;
			composer.homeAddress = this.newHomeAddress;
			return this.composer;
		}
	}
	
	public Builder builder(int i, String fName, String lName){
		return new Builder(new Composer(i,new Date(0,0,0)),fName, lName);	// change int to get new ids
	}
	
	public Builder builder(int i, Date date, String fName, String lName){
		return new Builder(new Composer(i,date),fName, lName);
	}
	
	public void setDateOfDeath(Date dod){this.dateOfDeath = dod;}
	
	public int getComposerID(){return this.composerID;}
	public Date getDateOfDeath(){return this.dateOfDeath;}
}
