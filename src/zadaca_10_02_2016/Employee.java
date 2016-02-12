package zadaca_10_02_2016;

import java.util.Date;

public class Employee extends Person{
	//data field
	private double salary;
	    private String office;
	    private Date dateHir;
	   //constructov with arg name
	    public Employee(String name) {
			super(name);
		}
//constructor with all args
		public Employee(String name, double salary, String office, Date dateHir) {
			super(name);
			this.salary = salary;
			this.office = office;
			this.dateHir = dateHir;
		}
//getters and setters
		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public String getOffice() {
			return office;
		}

		public void setOffice(String office) {
			this.office = office;
		}

		public Date getDateHir() {
			return dateHir;
		}

		public void setDateHir(Date dateHir) {
			this.dateHir = dateHir;
		}
//to string
		@Override
		public String toString() {
				
			return "Employee [Person [name=" + getName() + ", adress=" + getAddress()+ ", phone=" + getPhoneNumber() + ", mail="
					+ getEmailAddress() + ",office=" + office + ", salary=" + salary + ", dateHired=" + dateHir+ "]";
						
			
		}
	    
	    

}
