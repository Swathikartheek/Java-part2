package CustomException;

public class Customer {

	String name;
	int age;
	String address;
	public Customer(String name, int age, String address) {
		try {

			this.name = name;
			if(age>=18) {

				this.age = age;
			}
			else
			{

				throw new UnderAgeException();
			}

		}
		catch (Exception e)
		{
			System.out.println("age should be more than 18");
		}
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
}
