package softwaretechnik_uebung7_2;

import java.util.ArrayList;


public class CompositeTeam implements Team
{
	private ArrayList<Team> subTeams = new ArrayList<Team>();
	private String name;
	
	public CompositeTeam(String name)
	{
		this.name = name;
	}
	
	public ArrayList<String> getNameofSubteam()
	{
		ArrayList<String> liste = new ArrayList<String>();; 
		for (Team index: subTeams)
		{
			liste.addAll(subTeams.get(subTeams.indexOf(index)).getNameofSubteam());
		}
		System.out.println(name+ "has following members");
		System.out.println(subTeams.toString());
		return liste;
	}
	
	public int getNumberofAthletes()
	{
		int number = 0; 
		for (Team index: subTeams)
		{
			number = subTeams.get(subTeams.indexOf(index)).getNumberofAthletes();
		}
		System.out.println(name + "has following number of members");
		System.out.println(number);
		return number;
	}
	public int getNumberofGolds()
	{
		int number = 0; 
		for (Team index: subTeams)
		{
			number+= subTeams.get(subTeams.indexOf(index)).getNumberofGolds();
		}
		System.out.println(name + "has following number of gold medals");
		System.out.println(number);
		return number;
	}
	
	public void addTeam(Team team)
	{
		subTeams.add(team);
	}
	
	public void removeTeam(Team team)
	{
		subTeams.remove(team);
	}
	
	public ArrayList<Team> getTeams()
	{
		return subTeams;
	}
	
	
}
