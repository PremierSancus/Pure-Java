import java.util.Scanner;

public class Test
{
	public static void main(String[] args)
	{
		
		
		Scanner scan = new Scanner(System.in);
		String word;
		String reverse = "";
		
		System.out.print("Enter the string: ");
		word = scan.next();
	
		for(int i = word.length()-1; i >=0; i--)
		{
			reverse = reverse + word.charAt(i);
		}
		
		if(word.equals(reverse))
		{
				System.out.print(word + " is a PALINDROME.");
		}
		else
		{
			System.out.print(word + " is NOT a PALINDROME.");
		}
		
	}

}