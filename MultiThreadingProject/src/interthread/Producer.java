package interthread;

public class Producer {
	
	int availableProducts;
	
	// The constructor takes the number of available products as a parameter
	Producer(int availableProducts)
	{
		this.availableProducts=availableProducts;
	}
	
	// This method is called when a customer demands a certain number of products
	synchronized public void demand(int n)
	{
		// Print the current number of available products
		System.out.println("Available Product :"+availableProducts);
		
		// If there are not enough products available, wait until more are supplied
		if (n>availableProducts)
		{
			try {
				  wait();
				}catch(InterruptedException ie)
			     {
					ie.printStackTrace();					
			     }
			}
			
		// Decrement the number of available products by the amount demanded
		availableProducts-=n;
		
		// Print the new number of available products
		System.out.println("Available Products after demant fulfillment :"+availableProducts);	
	}
	
	// This method is called when the producer receives a supply of products
	synchronized public void supply(int n)
	{
		// Print the current number of available products
		System.out.println("Available Products before receiving supply :"+availableProducts);
		
		// Increment the number of available products by the amount supplied
		availableProducts+=n;
		
		// Print the new number of available products
		System.out.println("Available Products after receiving supply :"+availableProducts);
		
		// Notify any waiting threads that the number of available products has changed
		notify();
	}

}
