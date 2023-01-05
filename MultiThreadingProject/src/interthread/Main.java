package interthread;

public class Main {

	public static void main(String[] args) {
		
		// Create a new producer with 1000 available products
		Producer p = new Producer(1000);
		
		// Create a new demand thread and supply thread, each with a reference to the producer
		DemandThread dt = new DemandThread(p);
		SupplyThread st = new SupplyThread(p);
		
		// Start both threads
		dt.start();
		st.start();

	}

}
