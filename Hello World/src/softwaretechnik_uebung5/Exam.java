package softwaretechnik_uebung5;

import java.util.List;

public class Exam 
{
	private int maxValue;
	private List<Student> registered;
	private List<Question> questions;
	
	public Exam(int maxValue, int idq1, String taskq1, int maxValueq1)
	{
		this.maxValue = maxValue;
		Question question = new Question(taskq1, idq1, maxValueq1);
	}
	
	public boolean register(Student student)
	{
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
	
	public void addQuestion(int id, String task, int value)
	{
		Question question = new Question(task, id, value);
		questions.add(question);
	}
	
	public List<Student> getRegistered()
	{
		return registered;
	}


	public void setMaxValue(int maxValue) 
	{
		if (maxValue < registered.size())
		{
		this.maxValue = maxValue;
		}
	}
	
}
