
public class P_E_06_04 
{

	/*
	 * This function returns the difference between the sum of all the elements of the array
	 * (except the smallest value) and the smallest value.
	 */
	public static int sumWithoutSmallest (int[] arr)
	{
		int sum = 0;
		int smallest = arr[0];
		
		for (int elem : arr)
		{
			if (smallest >= elem)
			{
				if (smallest != elem)
				{
					sum += smallest;
					smallest = elem;
				}
			}
			else
			{
				sum += elem;
			}
			
		}
		return sum - smallest;
	}
	public static void main(String[] args) 
	{
		int[] array = {3, 2, 1, 5};
		System.out.println ("Difference is : " + sumWithoutSmallest (array));

	}

}
