package softwaretechnik_uebung6;

import java.util.Scanner; 

public class chair 
{
	Player computer;
	Player player2;
	Scanner in;
	
	public chair()
	{
		computer = new Player();
		player2 = new Player();
		in = new Scanner(System.in);
		play();
		if(computer.getCurrentCard().getNumber()>player2.getCurrentCard().getNumber())
		{
			System.out.println("You lost!");
		}
		else if(computer.getCurrentCard().getNumber()>player2.getCurrentCard().getNumber())
		{
			System.out.println("You played equal!");
		}
		else
		{
			System.out.println("You won");
		}
	}
	
	public void play()
	{
		Boolean answer = false;
		int i = 1;
		for (i=1; i<=5;i++)
		{
			System.out.println("Your current number is:  " + player2.getCurrentCard().getNumber());
			System.out.println("Do you want to draw another card(true) or place your bet(false)? You can draw 5 cards at max.");
			answer = in.nextBoolean();
			if(answer)
			{
				player2.drawCard();
				System.out.println("Card drawn!");
			}
			if(!answer)
			{
				System.out.println("Bet placed!");
				break;
			}
		}
		
	}
}
