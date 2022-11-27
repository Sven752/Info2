package softwaretechnik_uebung7_2;

import java.util.ArrayList;


public class Athlete implements Team 
{
	String name;
	int gold;
	
	public Athlete(String name, int gold)
	{
		this.name = name;
		this.gold = gold;
	}
	
	public Athlete(String name)
	{
		this.name = name;
	}
	
	
	
	
	public void wonGold()
	{
		gold++;
	}
	
	public ArrayList<String> getNameofSubteam() 
	{
		ArrayList<String> liste = new ArrayList<String>();
		liste.add(name);
		return liste;
		
	}
	
	public int getNumberofAthletes() 
	{
		return 1;
	}

	public int getNumberofGolds() 
	{
		return gold;
	}
}
