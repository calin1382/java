import java.util.Arrays;


public class P_E_06_08 
{
	public static void switchFirstHalfWithSecondHalf (int[] arr)
	{
		// Find the middle of the array.
		int indexSH = arr.length / 2;
		int indexFH = 0;
		for (int i = 0; i < arr.length / 2; i++)
		{
			int tmp = arr[indexFH];
			arr[indexFH++] = arr[indexSH];
			arr[indexSH++] = tmp;
			
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {9, 13, 21, 4, 11, 7, 1, 3};
		switchFirstHalfWithSecondHalf (arr);
		
		System.out.println (Arrays.toString(arr));

	}

}
