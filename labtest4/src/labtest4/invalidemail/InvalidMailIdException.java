package labtest4.emailException;

//creating our own excepttion 'InvalidMailIdException' by Extending from exception class 
public class InvalidMailIdException extends Exception{

	  //Constructs a new InvalidMailIdException with the specified message
	  //parameter msg is the message to be displayed when the exception is thrown	
	InvalidMailIdException(String msg) 
	{
		super(msg);
	}
}
