package zadaca_10_02_2016;

public class Staff extends Employee {
	//data field
	protected String title;
//constructor with all args
	public Staff(String name, String title) {
		super(name);
		this.title = title;
	}
//constructor with name arg
	public Staff(String name) {
		super(name);
	}
//getters and setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//override
	@Override
	public String toString() {
		return "Staff [title=" + title + "]";
	}

}
