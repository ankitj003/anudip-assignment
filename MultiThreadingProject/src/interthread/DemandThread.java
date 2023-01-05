package interthread;

public class DemandThread extends Thread {
	
	// This field holds a reference to the producer object
	Producer p;
	// The constructor takes a reference to the producer object as a parameter
	DemandThread(Producer p)
	{
		this.p=p;
	}
	
	// This method is executed when the thread is started
	public void run()
	{
		// Call the demand method on the producer object to make a demand for 200 products
		p.demand(200);
	}

}
