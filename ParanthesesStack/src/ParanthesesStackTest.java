import java.util.Stack;


public class ParanthesesStackTest
{
	public static boolean isStringValid (String string)
	{
		boolean isValid = true;
		
		if (string == null)
		{
			return false;
		}
		
		if (string.length() == 0)
		{
			return false;
		}
		
		Stack<Character> strStack = new Stack<Character>();
		char[] ch = string.toCharArray();
		for(int i = 0; i < ch.length; i++)
		{
			switch (ch[i])
			{
				case '(':
				case '[':
				case '{':
				{
					strStack.push(ch[i]);
					break;
				}
				case ')':
				{
					Character s = strStack.pop();
					if (s != '(')
					{
						isValid = false;
					}
					break;
				}
				case ']':
				{
					Character s = strStack.pop();
					if (s != '[')
					{
						isValid = false;
					}
					break;
				}
				case '}':
				{
					Character s = strStack.pop();
					if (s != '{')
					{
						isValid = false;
					}
					break;
				}
			}
			if (isValid == false)
			{
				break;
			}
		}
		
		return isValid;
	}

	public static void main(String[] args)
	{
		
		String str1 = "{[()]}";
		String str2 = "{{{}}]";
		
		System.out.println( "String " + str1 + " is valid: " + isStringValid(str1));
		System.out.println( "String " + str2 + " is valid: " + isStringValid(str2));
	}

}
