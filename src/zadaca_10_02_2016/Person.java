package zadaca_10_02_2016;

public class Person {
	//data fields
	private String name;
	private String adress;
	private String phoneNumber;
	private String emailAddress;
	//constructor with name arg
	public Person(String name) {
		this.name = name;
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return adress;
	}
	public void setAddress(String address) {
		this.adress = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		
		return "Person [name=" + name + ", adress=" + adress + ", phone=" + phoneNumber + ", mail=" + emailAddress + "]";
	}
	
	
	

}
