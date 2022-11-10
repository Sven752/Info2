package softwaretechnik_uebung5;

import java.util.List;

public class Course 
{
	private int id;
	private String name;
	private int maxCapacity;
	private boolean isFull;
	private List<Professor> professor;
	private List<Student> students;
	
	public Course(int id, String name, int maxCapacity, Professor professor)
	{
		this.id = id;
		this.maxCapacity = maxCapacity;
		this.name = name;
		this.professor.add(professor);
	}
	
	public void enroll(Student student)
	{
		if (students.size() > maxCapacity)
		{
			System.out.println("Der Kurs hat bereits die maximale Mitgliederzahl!");
			return;
		}
		students.add(student);
	}
	
}
