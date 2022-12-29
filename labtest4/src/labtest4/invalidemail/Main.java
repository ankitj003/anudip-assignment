package labtest4.emailException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) { // main method
	  
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter email id: "); // Prompt user to enter the string
    String emailId = sc.nextLine();   //Read the emailId from the user

    try { //this block checks the emailId contain @ and '.' 
      if (!emailId.contains(".") || !emailId.contains("@") || !emailId.substring(emailId.indexOf("@")).contains("."))
      {
        throw new InvalidMailIdException("Invalid email id"); //prints messege that email is invalid if it does not contain @ and '.'
      }
      System.out.println("Your email id is valid!!"); // if email is proper vaild messege will be printed
     } 
    catch (InvalidMailIdException e) // catching the exception of invaild emailid
    {
      System.out.println(e); 
    }
    finally
	{
		sc.close(); // closes the Scanner class
	}
  }
}



