import java.sql.Date;


public class Customer extends Person {
	protected int customerID;
	
	private Customer(int id){this.customerID = id;}
	
	public static class Builder{
		private Customer customer;
		private String newFirstName;
		private String newLastName;
		private Date newDateOfBirth;
		private String newEmail;
		private String newHomePhone;
		private String newCellPhone;
		private String newHomeAddress;
		
		private Builder(Customer customer,String fName, String lName){
			this.customer = customer;
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
			customer.firstName = this.newFirstName;
			customer.lastName = this.newLastName;
			customer.dateOfBirth = this.newDateOfBirth;
			customer.email = this.newEmail;
			customer.homePhone = this.newHomePhone;
			customer.cellPhone = this.newCellPhone;
			customer.homeAddress = this.newHomeAddress;
			return this.customer;
		}
	}
	
	public Builder builder(int i, String fName, String lName){
		return new Builder(new Customer(i),fName, lName);	// change int to get new ids
	}
	
	public int getCustomerID(){return this.customerID;}
}
