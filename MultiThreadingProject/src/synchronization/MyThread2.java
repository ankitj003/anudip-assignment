package synchronization;

public class MyThread2 extends Thread{

	// This field holds a reference to an instance of the FiboRev class
	FiboRev fr;
	public MyThread2(FiboRev fr) {
		// Call the super class's constructor
		super();
		this.fr = fr;
	}

	// This method is executed when the thread is started
	@Override
	public void run() {
		
		// Call the printReverse method on the FiboRev instance
		fr.printReverse();
	}
}
