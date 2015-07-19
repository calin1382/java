import java.util.Arrays;


public class P_E_06_07 
{
	/*
	 * The reverse is done using recursivity. Why not LOL.
	 */
	public static void reverseArrElements (int[] arr, int index)
	{
		int toReplaceIndex = index;
		int replaceWithIndex = arr.length - 1 - index;
		if (toReplaceIndex < replaceWithIndex)
		{
			int tmp = arr[toReplaceIndex];
			arr[toReplaceIndex] = arr[replaceWithIndex];
			arr[replaceWithIndex] = tmp;
			
			reverseArrElements (arr, ++index);
		}
	}

	public static void main(String[] args) 
	{
		int[] arr = {1, 4, 9, 16, 9, 7, 4, 9, 11, 12};
		reverseArrElements (arr, 0);
		
		System.out.println (Arrays.toString(arr));
	}

}
