package Person;

public class PersonMain {

	public static void main(String[] args) {
		
		// String Array for Subjects
		String s1[] = new String[]{"Math", "Physics", "Chemistry"};
		String s2[] = new String[]{"Computer Science", "History", "Geography"};
		
		
		// Object of  Students
		Student student1 = new Student("Peter Parker", 20, "1234567890", 1,s1);
		Student student2 = new Student("Mary Jane", 21, "0987654321", 2,s2);
		  
		// Printing 
		System.out.println(student1);
		System.out.println(student2);

	}

}
