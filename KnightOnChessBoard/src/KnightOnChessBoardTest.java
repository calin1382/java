import java.util.ArrayList;


public class KnightOnChessBoardTest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Knight knight = new Knight(new Position (2,2), 5);
		ArrayList<MovePattern> moves = new ArrayList<MovePattern>(8);
		moves.add (new MovePattern (2,1));
		moves.add (new MovePattern (2,-1));
		moves.add (new MovePattern (-2,1));
		moves.add (new MovePattern (-2,-1));
		moves.add (new MovePattern (1,2));
		moves.add (new MovePattern (-1,2));
		moves.add (new MovePattern (1,-2));
		moves.add (new MovePattern (-1,-2));
		
		knight.setAlowedMoves(moves);
		double probability = knight.calculateProbabilityFor_K_Moves(11);
		System.out.print("Probability is: "+probability);
	}

}
