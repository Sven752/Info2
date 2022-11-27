package softwaretechnik_uebung7_2;

import java.util.ArrayList;
import java.util.List;

public class Athlete implements Team 
{
	String name;
	int Gold;
	
	
	public ArrayList<String> getNameofSubteam() 
	{
		ArrayList<String> liste = new ArrayList<String>();
		liste.add(name);
		return liste;
		
	}
	
	@Override
	public int getNumberofAthletes() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getNumberofGolds() {
		// TODO Auto-generated method stub
		return 0;
	}
}
