public class TogepiThing extends PokeThing {
	
	public TogepiThing() {
		super("togepi" , "" , 0);
	}
	
	public void step()
	{
		Direction d = getRandomDirection(); 
		setDirection(d);
		move();
	}
	
	public Direction getRandomDirection()
	{
		Direction d = Direction.NORTH;
		int i = (int)(Math.random() * 8) + 1;
		for (int j = 0; j < i; j++)
			d = d.nextHalf();
		return d;
	}
}