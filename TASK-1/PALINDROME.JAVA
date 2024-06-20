import java.util.*;
public class Palindrome
{
    public static String rev(String str) 
    {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) 
		{
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    } 
    public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int FLAG=1;
		String str = scanner.nextLine();
		String s1 = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String s2=rev(s1);
		for(int i=0;i<s1.length();i++)
		{
			if ( s1.charAt(i)!=s2.charAt(i))
			{
				FLAG=0;
				break;
			}
		}
		if ( FLAG == 0)
			System.out.println("NOT A PALINDROME STRING");
		else
			System.out.println("A PALINDROME STRING");   
	}
}