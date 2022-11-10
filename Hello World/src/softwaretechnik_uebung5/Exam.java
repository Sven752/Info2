package softwaretechnik_uebung5;

import java.util.List;

public class Exam 
{
	private int maxValue;
	private List<Student> registered;
	
	public Exam(int maxValue)
	{
		this.maxValue = maxValue;
	}
	
	public boolean register(Student student)
	{
		if (registered.isEmpty()  == true)
		{
			registered.add(student);
			return true;
		}
		
		if (registered.contains(student))
		{
			return false;
		}
		else
		{
			registered.add(student);
			return true;
		}
	}
	
	public void addQuestion(int id, String Task, int value)
	{
		
	}
	
	public List<Student> getRegistered()
	{
		return registered;
	}


	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	
}
