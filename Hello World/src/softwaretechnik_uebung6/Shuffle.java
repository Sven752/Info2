package softwaretechnik_uebung6;

import java.util.Random;

public class Shuffle 
{
	Random random;
	
	public Shuffle()
	{
		random = new Random();
	}
	
	public Card shuffle()
	{
		Card card = new Card(random.nextInt(100));
		return card;
	}
	
}
