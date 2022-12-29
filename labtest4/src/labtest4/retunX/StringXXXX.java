package labtest4.characterX;
import java.util.Scanner;

public class StringXXXX {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// Input from the user
		System.out.print("Enter a String :");
		String str = sc.next();
		
		// String length should be greater than 4
		if(str.length()<4)
		{
			System.out.println("Invalid String");
			
		}
		else 
		{	
			// Calling method and storing value in masked
			String masked = XLastFour(str);
			
			// Printing masked String
	    	System.out.println(masked);
		}
		sc.close();
	}

	
	// Method to Mask all characters except last 4	
	public static String XLastFour(String str) 
	{
	    // Get the last 4 characters of the original string
	    String lastFour = str.substring(str.length() - 4);

	    // Build the hide string by repeating the 'X' character
	    StringBuilder hide = new StringBuilder();
	    for (int i = 0; i < str.length() - 4; i++) 
	    {
	      hide.append('X');
	    }

	    // Append the last 4 characters to the masked string
	    hide.append(lastFour);
	    
	    // Converting StringBuilder to String
	    return hide.toString();
	}
}
