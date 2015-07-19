import java.util.Scanner;


public class P_E_06_06 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
		int sum = 0;
		int nElems = 0;
		
		System.out.println ("Please enter a value or Q to quit:");
		
		while (in.hasNextInt())
		{
			int value = in.nextInt();
			nElems ++;
			if (nElems % 2 == 0)
			{
				sum = sum - value;
			}
			else
			{
				sum = sum + value;
			}
		}
		
		System.out.println ("Sum is : " + sum);
		in.close();
	}

}
