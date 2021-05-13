
public class Customer {
	
	int customerId;
	String customerName;
	long customerContact;
	Address customerAddress;
	
	
	public Customer(int customerId, String customerName, long customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void printDetails() {
		System.out.println("Customer ID = "+this.customerId);
		System.out.println("Customer Name = "+this.customerName);
		System.out.println("Customer Contact = "+this.customerContact);
		System.out.println("Customer Address is = ");
		System.out.println("Street :" +getCustomerAddress().getStreet());
		System.out.println("City :" +getCustomerAddress().getCity());
		System.out.println("Zip :" +getCustomerAddress().getZip());
		System.out.println("Country :" +getCustomerAddress().getCountry());
	}

}
