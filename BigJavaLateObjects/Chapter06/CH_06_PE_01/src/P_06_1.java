/* Write a program that initializes an array with ten random integers and 
 * then prints four lines of output,containing:
 * 	-> Every element at an even index
 *  -> Every even element
 *  -> All elements in reverse order
 *  -> Only the first and last element
 */


public class P_06_1
{
	public static void printSpecialArrayElements (int[] arr)
	{
		initArray (arr);
		printEvenIndexes (arr);
		printEvenElems (arr);
		printElemsReverseOrder (arr);
		printHeadAndTail (arr);
	}
	public static void initArray (int[] arr)
	{
		for(int i = 0; i < arr.length; i ++)
		{
			arr[i] = (int)(Math.random() * 10);
			System.out.print (arr[i] + " ");
		}
		System.out.println ();
	}
	public static void printEvenIndexes (int[] arr)
	{
		System.out.println ("Print the elements that are at even indexes");
		for (int i = 0; i < arr.length; i++)
		{
			if (i%2 == 0)
			{
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println ();
	}
	
	public static void printEvenElems (int[] arr)
	{
		System.out.println ("Print only the even elements");
		for(int elem : arr)
		{
			if (elem%2 == 0)
			{
				System.out.print(elem  + " ");
			}
		}
		System.out.println ();
	}
	
	public static void printElemsReverseOrder (int[] arr)
	{
		System.out.println ("Print Elements in reversed order");
		int numberElems = arr.length -1;
		for (int i = numberElems; i >= 0; i--)
		{
			System.out.print (arr[i]  + " ");
		}
		System.out.println ();
	}
	
	public static void printHeadAndTail (int[] arr)
	{
		System.out.println ("First and last element");
		System.out.println (arr[0] + " " + arr[arr.length-1]);
	}
	public static void main(String[] args)
	{
		final int NUMBERELEMENTS = 10;
		int[] array = new int[NUMBERELEMENTS];
		printSpecialArrayElements (array);
	}
	

}
