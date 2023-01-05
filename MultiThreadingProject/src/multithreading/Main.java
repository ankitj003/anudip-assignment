package multithreading;

public class Main {
	// main method
	public static void main(String[] args) { 
		
		// crearting three thread of myfriend class
		Thread thread1=new MyFriend(); //thread1
		Thread thread2=new MyFriend(); //thread2
		Thread thread3=new MyFriend(); //thread3
        // starting each thread	
		thread1.start();
		thread2.start();
		thread3.start();
	}
}
