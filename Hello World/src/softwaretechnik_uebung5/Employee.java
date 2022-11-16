package softwaretechnik_uebung5;

public class Employee 
{
	private String name;
	private int id;
	private Department department;
	
	public Employee(String name, int id, Department department)
	{
		this.id = id;
		this.name = name;
		this.department = department;
	}
}
