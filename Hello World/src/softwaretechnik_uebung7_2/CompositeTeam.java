package softwaretechnik_uebung7_2;

import java.util.ArrayList;
import java.util.List;

public class CompositeTeam implements Team
{
	private List<Team> subTeams = new ArrayList<Team>();
	
	public ArrayList<String> getNameofSubteam()
	{
		ArrayList<String> liste = new ArrayList<String>();; 
		for (Team index: subTeams)
		{
			liste.addAll(subTeams.get(subTeams.indexOf(index)).getNameofSubteam());
		}
		return liste;
	}
	
	public int getNumberofAthletes()
	{
		int number = 0; 
		for (Team index: subTeams)
		{
			number++;
		}
		return number;
	}
	public int getNumberofGolds()
	{
		int number = 0; 
		for (Team index: subTeams)
		{
			number+= subTeams[index];
		}
		return number;
	}
}
