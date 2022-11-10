package softwaretechnik_uebung5;

import java.util.List;

public class Project 
{
	private String name;
	private List<Student> member;
	
	public Project(String name)
	{
		this.name = name;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public List<Student> getMember() {
		return member;
	}

	public void addMember(Student Student) {
		member.add(Student);
	}
	
}
