package Person;

import java.util.Arrays;

public class Student extends Person 
{
	// Initializing institute
	static final String institueName = "XYZ Institute Of Technology";
	
	// Declaring 
	int rollNo;
	String[] subjects;
	
	 // Parameterized Constructor
	Student(String name, int age, String mob, int rollNo, String[] subjects)
	{
		 super(name, age, mob);
		 this.rollNo = rollNo;
		 this.subjects = subjects;
	}

	  // Overriding the toString() method
	 @Override
	  public String toString() {
	    return "Student{" +
	           "  \n name : '" +name + '\'' +
	           ", \n age : " +age +
	           ", \n mob : " +mob +
	           ", \n rollNumber : " +rollNo +
	           ", \n subjects : " + Arrays.toString(subjects) +
	           ", \n institute : '" +institueName + '\'' +
	           '}';
	  }
}
