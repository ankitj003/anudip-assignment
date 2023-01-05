package synchronization;

public class Main {
	
	public static void main(String[] args) {
		
		// Create a new instance of the FiboRev class
	    FiboRev fr = new FiboRev();
	    
	    // Create two new threads that will execute the methods in the FiboRev class
		MyThread1 th1 = new MyThread1(fr);
		MyThread2 th2 = new MyThread2(fr);
		
		// Start both threads
		th1.start();
		th2.start();
	}

}
