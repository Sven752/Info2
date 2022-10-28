package softwaretechnik_uebung3;

public class Elevator
{
	
	public  int current=5;
	int dest;
	
	private static Elv_States  state = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest=dest_floor;
		System.out.println("*** Destination floor is: "+ dest);
		System.out.println("--------------------------------------------");
		arrive_atFloor(dest);


	}

	private void arrive_atFloor(int a) 
	{
		if (a == current)
		{
			System.out.println("***You arrived at you destination floor!");
		}
		if (a < current)
		{
			state.cState = state.mdown;
			do 
			{
				current = current -1;
				System.out.println("You arrived at floor: "+ current );
				System.out.println("You are moving: "+ state.toString() );
			}while (a != current);
			System.out.println("***You arrived at you destination floor!");
		}
		if (a > current)
		{
			state.cState = state.mup;
			do 
			{
				current = current +1;
				System.out.println("*** You arrived at floor: "+ current);
				System.out.println("You are moving: "+ state.toString() );
			}while (a != current);
			System.out.println("*** You arrived at you destination floor!");
		}
		
	}
}
	

