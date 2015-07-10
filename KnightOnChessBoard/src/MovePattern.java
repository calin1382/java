
public class MovePattern 
{
	private int moveX = 0;
	private int moveY = 0;
	
	public MovePattern (int dx, int dy)
	{
		moveX = dx;
		moveY = dy;
	}
	
	public MovePattern (MovePattern m)
	{
		moveX = m.getMoveX();
		moveY = m.getMoveY();
	}
	
	public int getMoveX ()
	{
		return moveX;
	}
	
	public int getMoveY ()
	{
		return moveY;
	}
	
	public void setX (int dx)
	{
		moveX = dx;
	}
	
	public void setY (int dy)
	{
		moveY = dy;
	}

}
