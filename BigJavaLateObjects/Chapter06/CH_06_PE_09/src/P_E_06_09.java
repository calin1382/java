
public class P_E_06_09 
{

	public static boolean equals (int[] a, int[] b)
	{
		if (a.length != b.length)
		{
			return false;
		}
		
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != b[i])
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int[] a = {3, 2, 1};
		int[] b = {3, 2};
		System.out.println (equals (a, b));
	}

}
