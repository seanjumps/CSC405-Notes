
public class Car {
	//instance variables
	private int location;
	private int speed;
	private int gas;
	
	//constructor
	public Car()
	{
		location = 0;
		speed = 0;
		gas = 10;
	}
	
	//methods aka actions/operations
	public void move()
	{
		speed = speed + 25;	//speed += 25;
		gas--;	//gas = gas - 1;
		location = location + speed;
	}
	
	public void fillUp()
	{
		gas = 10;
	}
}
