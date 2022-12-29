package labtest4.duplicateString;
import java.util.Scanner;

public class StringDuplicate {
	public static void main(String[] args) {
	    // Create a Scanner to read input from the user
	    Scanner sc = new Scanner(System.in);
	    // Prompt the user to enter a string
	    System.out.print("Enter a String :");
	    // Read the string from the user
	    String str = sc.next();
	    // Convert the string to an array of characters
	    char[] ch = str.toCharArray();
	   
	    // Print  the duplicate characters
	    System.out.print("Duplicate Characters: ");
	    
	    // Find and print the duplicate characters
	    checkDuplicate(str, ch);
	    
	    // Close the Scanner
	    sc.close();
	  }
	  
	  public static void checkDuplicate(String str, char[] ch) {
	    // Iterate through the array of characters
	    for (int i = 0; i < str.length(); i++) {
	      // Check each character after the current character for duplicates
	      for (int j = i + 1; j < str.length(); j++) {
	        // If a duplicate is found, print it and break out of the inner loop
	        if (ch[i] == ch[j]) {
	          System.out.print(ch[j] + " ");
	          break;
	        }
	      }
	    }
	}
}
		

