import java.util.Arrays;

/*Write array methods that carry out the following tasks for an array of integers. For
 each method, provide a test program.
 a.   Swap the first and last elements in the array.
 b.   Shift all elements by one to the right and move the last element into the first
 position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.
 c.   Replace all even elements with 0.
 d.   Replace each element except the first and last by the larger of its two neighbors.
 e.   Remove the middle element if the array length is odd, or the middle two
 elements if the length is even.
 f.   Move all even elements to the front, otherwise preserving the order of the
 elements.
 g.   Return the second-largest element in the array.
 h.   Return true if the array is currently sorted in increasing order.
 i.   Return true if the array contains two adjacent duplicate elements.
 j.   Return true if the array contains duplicate elements (which need not be adjacent).*/


public class P_E_06_2
{
	public static void initArray (int[] arr)
	{
		for(int i = 0; i < arr.length; i ++)
		{
			arr[i] = (int)(Math.random() * 10);
			System.out.print (arr[i] + " ");
		}
		System.out.println ();
	}

	public static void swapElem (int[] arr, int index1, int index2)
	{
		System.out.println ("Swap elements by providing their indexes");
		if (arr != null && 
		    (arr.length - 1) >= index1 && 
		    (arr.length -1) >= index2)
		{
			int tmp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = tmp;
		}
		System.out.println (Arrays.toString(arr));
	}
	
	public static void shiftElemsToTheRight (int[] arr)
	{
		System.out.println ("Shift elements to the right and the last element becomes first element.");
		if (arr != null && arr.length > 1)
			{
				int nElems = arr.length - 1;
				int tmp1 = arr[0];
				int tmp2 = 0;
				for (int i = 0; i < nElems; i++)
				{
					tmp2 = arr[i+1];
					arr[i+1] = tmp1;
					tmp1 = tmp2;
				}
				arr[0] = tmp1;
				
				System.out.println (Arrays.toString(arr));
			}
	}
	
	public static void replaceEvenElems (int[] arr, int replacement)
	{
		System.out.println ("Replace even elems with a specific value");
		if (arr != null && arr.length > 0)
			{
				for (int i = 0; i < arr.length; i++)
				{
					if ((arr[i]%2) == 0)
					{
						arr[i] = replacement;
					}
						
				}
			}
		System.out.println (Arrays.toString(arr));
	}

	public static void replaceElemByHNeighbor (int[] arr)
	{
		System.out.println ("Replace Elem by its highest neighbor");
		if (arr != null && arr.length > 0)
		{
			int nElems = arr.length - 2; //because we want to exclude the last element
			for (int i = 1; i < nElems; i++)// start at 1 because we want to exclude first element
			{
				int maxNeighbor = max (arr[i-1], arr[i+1]);
				if (maxNeighbor > arr[i])
				{
					arr[i] = maxNeighbor;
				}
			}
			
			System.out.println (Arrays.toString(arr));
		}
	}
	
	public static int max (int a, int b)
	{
		return (a > b)? a:b;
	}
	
	
	
	public static void moveEvenElemsToFront (int[] arr)
	{
		System.out.println ("Move Even Elems to the front of the array");
		if (arr != null && arr.length > 0)
		{
			int index = 0;
			int nElems = arr.length -1;
			
			for (int i = 0; i < nElems; i++)
			{
				if ((arr[i] % 2) == 0)
				{
					int tmp = arr[i];
					for (int j = i; j > index; j--)
					{
						arr[j] = arr[j-1];
					}
					arr[index] = tmp;
					index++;
				}
			}
		}
		System.out.println (Arrays.toString(arr));
	}

	public static int getSecondLargestElem (int[] arr)
	{
		System.out.println ("Return the seond largest element in the array.");
		int firstLargest = 0;
		int secondLargest = 0;
		if (arr != null && arr.length > 0)
		{
			int nElems = arr.length -1;
			
			for (int i = 0; i < nElems; i ++)
			{
				if (firstLargest < arr[i])
				{
					secondLargest = firstLargest;
					firstLargest = arr[i];
				}
				else
				{
					if (secondLargest < arr[i])
					{
						secondLargest = arr[i];
					}
				}
			}
			System.out.println (firstLargest + " " + secondLargest);
		}
		return secondLargest;
	}

	public static boolean isArraySortedIncreasing (int[] arr)
	{
		System.out.println ("Verify if array is sorted.");
		boolean isSorted = true;
		if (arr != null && arr.length > 0)
		{
			for(int i = 0; i < arr.length; i++)
			{
				if (arr[i] < arr[i+1])
				{
					isSorted = false;
					break;
				}
			}
		}
		System.out.println (isSorted);
		return isSorted;
	}

	public static boolean arrayHasAdjacentDuplicates (int[] arr, int index)
	{
		//Recursive implementaton.
		if (arr == null || arr.length <= 0 || index >= arr.length-1)
		{
			return false;
		}
			if (arr[index] == arr[index+1])
			{
				return true;
			}
			return arrayHasAdjacentDuplicates (arr, ++index);
	}

	public static boolean arrayHasDuplicateElems (int[] arr, int index, int runner)
	{
		//recursive implementation
		if (arr == null || arr.length <= 0 || index >= arr.length-1)
		{
			return false;
		}
		
		if (arr[index] == arr[runner])
			return true;
		if (runner + 1 > arr.length - 1)
		{
			runner = ++index;
			
		}
		return arrayHasDuplicateElems (arr, index, ++runner);
	}
	public static void main(String[] args)
	{
		final int NUMBERELEMENTS = 10;
		int[] array = new int[NUMBERELEMENTS];
		
		initArray (array);
		
		swapElem (Arrays.copyOf(array, array.length), 0, array.length - 1);
		shiftElemsToTheRight (Arrays.copyOf (array, array.length));
		replaceEvenElems (Arrays.copyOf(array, array.length), 4);
		replaceElemByHNeighbor (Arrays.copyOf(array, array.length));
		
		moveEvenElemsToFront (Arrays.copyOf(array, array.length));
		getSecondLargestElem (Arrays.copyOf(array, array.length));
		isArraySortedIncreasing (Arrays.copyOf(array, array.length));
		
		
		System.out.println ("Adjacent duplicates: " + arrayHasAdjacentDuplicates (Arrays.copyOf(array, array.length), 0));
		
		int[] array2 = {1, 2, 3, 4};
		System.out.println ("Array has duplicates: " + arrayHasDuplicateElems (array2, 0, 1));
	}

}
