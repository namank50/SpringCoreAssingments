
public class Address {
	String street;
	String city;
	int zip;
	String country;
	
	
	
	public Address(String street, String city, int zip, String country) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public int getZip() {
		return zip;
	}
	public String getCountry() {
		return country;
	}
	

}
