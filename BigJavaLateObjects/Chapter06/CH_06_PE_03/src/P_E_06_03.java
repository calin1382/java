import java.util.ArrayList;
import java.util.Scanner;

public class P_E_06_03 
{

	public static void main(String[] args) 
	{
		ArrayList<Double> values = new ArrayList<Double> ();
		//Read inputs
		System.out.println ("Please enter values, Q to quit:");
		Scanner in = new Scanner (System.in);
		while (in.hasNextDouble())
		{
			values.add(in.nextDouble());
		}
		
		// Find the largest value
		double largest = values.get(0);
		double smallest = values.get(0);
		
		for (int i = 1; i < values.size(); i++)
		{
			if (values.get(i) > largest)
			{
				largest = values.get(i);
			}
			if (values.get(i) < smallest)
			{
				smallest = values.get(i);
			}
		}
		
		//Print all values, marking the largest
		for (double elem : values)
		{
			System.out.print(elem);
			if (elem ==  largest)
			{
				System.out.print("<== largest value");
			}
			if (elem == smallest)
			{
				System.out.print ("<== smallest value");
			}
			System.out.println();
		}

	}

}
