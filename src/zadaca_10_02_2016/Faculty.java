package zadaca_10_02_2016;

public class Faculty extends Employee {
	
	//data fields
	String officeHours;
	String rank;
//constructor with args
	public Faculty(String name, String officeHours, String rank) {
		super(name);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public Faculty(String name) {
		super(name);
	}
//getters and setters
	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	 @Override
	    public String toString() {
		 return "Faculty [officeH=" + officeHours+ ", rank=" + rank + "]";
	    }

}
