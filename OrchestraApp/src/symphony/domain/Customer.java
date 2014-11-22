package symphony.domain;
import java.sql.Date;


public class Customer extends Person {
	protected int customerID;
	
	private Customer(int id){this.customerID = id;}
	/*
	 * Builder for Customer
	 */
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
		
		public Builder dateOfBirth(Date dob){this.newDateOfBirth = dob; return this;}
		public Builder email(String e){this.newEmail = e; return this;}
		public Builder homePhone(String hp){this.newHomePhone = hp; return this;}
		public Builder cellPhone(String cp){this.newCellPhone = cp; return this;}
		public Builder homeAddress(String ha){this.newHomeAddress = ha; return this;}
		
		public Customer build(){
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
	
	public static Builder builder(int i, String fName, String lName){
		return new Builder(new Customer(i),fName, lName);	// change int to get new ids
	}
	
	public int getCustomerID(){return this.customerID;}
	/*
	 * Charges the purchase to the customer's credit card
	 * does not work
	 * TODO
	 */
	public void chargeCustomer(double money) throws ApplicationException{
		// can't implement
		// charges customer and if it fails throws and exception
	}
}
