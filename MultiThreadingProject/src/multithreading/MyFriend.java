package multithreading;

public class MyFriend extends Thread{
	//override the run method of the thread class
	public void run() 
	{
		//create an array of friends name
		String[] friends={"Gopal","Abhishek","Ankit","Sam","Aman","Vipin","Pujan","Ayush","Ram","Bob"};
        // loop for iterating over the friend array
		for (int i = 0; i < friends.length; i++) 
        {
			//print each friends name along with thread name on the console
            System.out.println(Thread.currentThread().getName()+" "+friends[i]);
        }
	}	
}
