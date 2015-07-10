import java.util.ArrayList;
import java.util.ListIterator;


public class Knight 
{
	private Position position;
	private int boardSize = -1;
	private ArrayList<MovePattern> allowedMoves;

	public Knight (Position pos, int bSize)
	{
		position = new Position (pos);
		boardSize = bSize;
	}
	
	public Position getPos ()
	{
		return new Position (position);
	}
	
	public void setPosition (Position p)
	{
		position = new Position (p);
	}
	
	public void setAlowedMoves (ArrayList<MovePattern> moves)
	{
		allowedMoves = deepCopyMoves (moves, allowedMoves);
	}
	
	public int getBoardSize ()
	{
		return boardSize;
	}
	
	public void setBoardSize (int bSize)
	{
		boardSize = bSize;
	}

	public double calculateProbabilityFor_K_Moves (int numberMoves)
	{
		return calculateProbabilityRecursively (1, numberMoves, position, 0);
	}
	
	private ArrayList<MovePattern> deepCopyMoves (ArrayList<MovePattern> fromMoves, ArrayList<MovePattern> toMoves)
	{
		if (toMoves == null)
		{
			toMoves = new ArrayList<MovePattern>();
		}
		
		if (toMoves.size() > 0)
		{
			// Remove current elements
			ListIterator<MovePattern> iter = (ListIterator<MovePattern>) toMoves.iterator(); 
			while (iter.hasNext())
			{
				iter.next();
				iter.remove();	
			}
		}
		// Add new elements (make a deep copy of moves ArrayList's elements.
		ListIterator<MovePattern> iter = fromMoves.listIterator();
		while (iter.hasNext())
		{
			toMoves.add(new MovePattern ((MovePattern)iter.next()));
		}
		
		return toMoves;
	}
	
	private double calculateProbabilityRecursively (int step, int numberMoves, Position newPos, double maxProb)
	{
		double probability = 0.0;
		// Assume that the board starts at (0,0) up to (boardSize-1, boardSize-1)
		if (step > numberMoves)
		{
			return 0;
		}
		if (step == numberMoves)
		{
			return 1.0;
		}
		if (newPos.getX() < 0 || newPos.getY () < 0 || 
			newPos.getX () >= boardSize || newPos.getY() >= boardSize)
		{
			return 0.0;
		}
		
		ListIterator<MovePattern> iter = allowedMoves.listIterator();
		while (iter.hasNext())
		{
			MovePattern move = iter.next();
			double val = 1.0/8.0 *calculateProbabilityRecursively (++step, 
														   numberMoves, 
														   incrementPosByMove (newPos, move), 
														   0.0);
			probability += val ;
		}
			
		return probability;
	}
	
	private Position incrementPosByMove (Position p, MovePattern m)
	{
		return new Position (p.getX() + m.getMoveX(), p.getY() + m.getMoveY());
	}
}
