package symphony.domain;
import java.sql.Date;




public class Composer extends Person{
	protected Date dateOfDeath;
	protected int composerID;
	
	private Composer(int cID, Date dd){}
	
	//builder for composer
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
		
		public Builder dateOfBirth(Date dob){this.newDateOfBirth = dob;return this;}
		public Builder email(String e){this.newEmail = e;return this;}
		public Builder homePhone(String hp){this.newHomePhone = hp;return this;}
		public Builder cellPhone(String cp){this.newCellPhone = cp;return this;}
		public Builder homeAddress(String ha){this.newHomeAddress = ha;return this;}
		
		public Composer build(){
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
	
	public static Builder builder(int i, String fName, String lName){
		return new Builder(new Composer(i,new Date(0,0,0)),fName, lName);	// change int to get new ids
	}
	
	public static Builder builder(int i, Date date, String fName, String lName){
		return new Builder(new Composer(i,date),fName, lName);
	}
	/*
	 * set
	 */
	public void setDateOfDeath(Date dod){this.dateOfDeath = dod;}
	/*
	 * gets
	 */
	public int getComposerID(){return this.composerID;}
	public Date getDateOfDeath(){return this.dateOfDeath;}
}
