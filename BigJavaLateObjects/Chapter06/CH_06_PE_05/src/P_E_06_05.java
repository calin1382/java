import java.lang.reflect.Array;
import java.util.Arrays;


public class P_E_06_05 
{
	// We Assume that the partially filled array does not contain "0" in the filled part. It only
	// contains "0" in the unfilled part (filled by default upon construction of the array.
	public static void removeMin (int[] arr)
	{
		// Find the smallest value in the array.
		int smallest = arr[0];
		int indexSmallest = -1;
		int arrSize = 0;
		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] != 0)
			{
				arrSize ++;
				if (smallest > arr[i])
				{
					smallest = arr[i];
					indexSmallest = i;
				}
			}
		}
		
		for (int i = indexSmallest; i < arrSize + 1; i++)
		{
			int newIndex = i+1;
			while (arr[newIndex] == smallest)
			{
				newIndex++;
			}
			arr[i] = arr[newIndex];
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = new int[6];
		arr[0] = 3;
		arr[1] = 2;
		arr[2] = 1;
		arr[3] = 5;
		arr[4] = 6;
		removeMin (arr);
		System.out.println (Arrays.toString(arr));

	}

}
