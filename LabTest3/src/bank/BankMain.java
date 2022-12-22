package bank;

public class BankMain {

	public static void main(String[] args) {
		
		// Objects of BankA,BankB and BankC
		Bank bankA = new BankA();
		Bank bankB = new BankB();
		Bank bankC = new BankC();
		  
		// Printing 
		System.out.println("Balance in Bank A: " + bankA.getBalance());
		System.out.println("Balance in Bank B: " + bankB.getBalance());
		System.out.println("Balance in Bank C: " + bankC.getBalance());

	}

}
