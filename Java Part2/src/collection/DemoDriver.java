package collection;

public class DemoDriver {
	int id;
	String name;
	double salary;
	
	public DemoDriver(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "DemoDriver [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}
