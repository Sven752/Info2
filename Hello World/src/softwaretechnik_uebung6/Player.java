package softwaretechnik_uebung6;

public class Player 
{
	private Card currentCard;
	
	public Player()
	{
		Shuffle shuffle = new Shuffle();
		currentCard = shuffle.shuffle();
	}
	
	public void drawCard()
	{
		Shuffle shuffle = new Shuffle();
		currentCard = shuffle.shuffle();
	}
}
