public class Card
{
	//instance variables
	private int suit;
	private int value;
	
	//constructor
	public Card(int s, int v)
	{
		suit = s;
		value = v;
	}
	
	public int getValue()
	{
		if (value == 1)
		{
			return 11;
		}
	}
	
	public String toString()
	{
		String out = "";
		
		if (suit == 0)
			out = "Spades";
		if (suit == 1)
			out = "Clubs";
		if (suit == 2)
			out = "Hearts";
		if (suit == 3)
			out = "Diamonds";
		
		if (value > 1 && value <=10)
			out = value + " of " + out;
		//Jack, 11
		if (value == 11)
			out = "Jack of " + out;
		
		if (value == 1)
			out = "Ace of " + out;
		if (value == 12)
			out = "Queen of " + out;
		if (value == 13)
			out = "King of " + out;
		
		return out;
	}
}
