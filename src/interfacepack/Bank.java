package interfacepack;

public interface Bank {
	
	String ACCOUNT_TYPE_1 = "Savings";  // final and static by default
	String ACCOUNT_TYPE_2 = "Current";  // final and static by default
	
	
	//  ACCOUNT_TYPE_1=It is Upper Snake Case 
	
	
	
	//abstract by default
	// no use of curly basis{} (it is only for interface & abstract modifier)
	public void openAccount();
	public void depositMoney();
	public void transferMoney();
	public void withdrawMoney();
	
	default public void attachAdhaarAndPan() {
		System.out.println("Adhaar and Pan got attached");
	}
	
	static public void newTaxation() {
		System.out.println("Implementing new taxation");
	}
	
// default & static for comman purposes/use
	
}

class HDFCBank implements Bank {
	
	@Override
	public void openAccount() {
		System.out.println("Account opened in HDFC Bank");
	}
	
	@Override
	public void depositMoney() {
		System.out.println("Amount deposited into HDFC Bank");
	}
	
	@Override
	public void withdrawMoney() {
		System.out.println("Amount withdrawn from HDFC Bank");
	}
	
	@Override
	public void transferMoney() {
		System.out.println("Money transfered from HDFC Bank");
	}
	
//	@Override
//	public void newTaxation() {
//		System.out.println("Implementing new taxation");
//	}
	
}
