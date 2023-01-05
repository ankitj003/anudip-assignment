package synchronization;

public class MyThread1 extends Thread{

	// This field holds a reference to an instance of the FiboRev class
	FiboRev fr;
	public MyThread1(FiboRev fr) {
		// Call the super class's constructor
		super();
		// Save the reference to the FiboRev instance in the field
		this.fr = fr;
	}

	// This method is executed when the thread is started
	@Override
	public void run() {
		
		// Call the printFibonacci method on the FiboRev instance
		fr.printFibonacci();
	}
}
