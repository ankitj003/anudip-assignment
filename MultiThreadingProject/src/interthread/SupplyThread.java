package interthread;

public class SupplyThread extends Thread {
	
	Producer p;
	
	// The constructor takes a reference to the producer object as a parameter
	SupplyThread(Producer p)
	{
		// Save the reference to the producer object in the field
		this.p=p;
	}
	
	// This method is executed when the thread is started
	public void run()
	{
		// Call the supply method on the producer object to supply 100 products
		p.supply(100);
	}

}
