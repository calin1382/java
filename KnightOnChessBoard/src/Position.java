
public class Position 
{
	private int posX = -1;
	private int posY = -1;
	
	public Position ()
	{
	}
	
	public Position (int x, int y)
	{
		posX = x;
		posY = y;
	}
	
	public Position (Position pos)
	{
		posX = pos.getX ();
		posY = pos.getY ();
	}

	
	public int getX ()
	{
		return posX;
	}
	
	public int getY ()
	{
		return posY;
	}
	
}
