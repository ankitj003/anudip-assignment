package synchronization;

public class FiboRev {
	
	// This method prints out the first 10 numbers in the Fibonacci sequence
	synchronized void printFibonacci() {
			
		  int i = 1, n = 10, first = 0, second = 1 ,next;
		  System.out.println("Fibonacci series of ten number");
	      while (i <= n)  {  
	      // Print the next number in the series
	      System.out.println(first);
	      // Calculate the next number in the series
	      next = first + second;
	      first = second;
	      second = next;
	      i++;
	    }
	 }
	 
	 // This method prints out the numbers from 10 down to 1 in reverse order
	 synchronized void printReverse() {  
	      System.out.println("Reverse of number from 1 to 10");
	      // Iterate over the numbers in reverse order
	      for(int i=10;i>0;i--) {
	    	  // Print the current number
	    	  System.out.println(i);
	      }
		}
}
