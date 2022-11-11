package softwaretechnik_uebung5;

import java.util.List;

public class TA 
{

	private String name;
	private List<Course> courses;
	
	public TA(Course course, String name)
	{
		courses.add(course);
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public List<Course> getCourses() 
	{
		return courses;
	}

	public void extendContract(Course course) 
	{
		this.courses.add(course);
	}
}
