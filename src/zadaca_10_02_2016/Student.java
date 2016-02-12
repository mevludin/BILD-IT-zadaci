package zadaca_10_02_2016;

public class Student extends Person {
	//data field
	public static final String Prva = "Freshman";
	public static final String Druga= "Sophomore";
	public static final String Trca = "Junior";
	public static final String Cetvrta = "Senior";
	public String status;
	//constructor with args
	public Student(String name, String status) {
		super(name);
		this.status = status;
	}
	public Student(String name) {
		super(name);
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
			
		return "Student [Person [name=" + getName() + ", adress=" + getAddress() + ", phone=" + getPhoneNumber() + ", mail="
				+ getEmailAddress() + " , status=" + status + "]";
		
	}
    

}
