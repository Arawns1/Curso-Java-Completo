package Ex06;

public class Employees {
	int id;
	String name;
	double salary;
	
	
	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public void increaseSalary(double percentage) {
		salary = salary + (salary * percentage / 100.00);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}

	
	
	public String toString(){
		return this.id
			+ ", "
			+ (this.name).toUpperCase()
			+ ", "
			+ this.salary;
	}
}
