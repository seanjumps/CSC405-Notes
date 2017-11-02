
public class Cheese {
	private boolean isStinky;	
	private int texture;			//1-10
	
	//Constructor
	public Cheese(boolean i, int t)
	{
		isStinky = i;
		texture = t;
	}
	
	public boolean delicious()
	{
		if(!isStinky)
		{
			if (texture > 2)
			{
				return true;
			}
		}
		return false;
	}
	
	public void leaveOut()
	{
		texture = texture + 2;
	}
}
