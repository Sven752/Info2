package softwaretechnik_uebung5;

public class Student 
{
	private int id;
	private String name;
	private Project project;
	
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Project getProject()
	{
		return project;
	}
	
}
