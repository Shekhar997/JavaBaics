
public class BankAccount {
	
	int id;
	String name;
	int bal;
	final int ifsc;
	
	public BankAccount(int id,String name, int bal, int ifsc) {
		this.id = id;
		this.name = name;
		this.bal = bal;
		this.ifsc = ifsc;
	}
	
	/*public BankAccount() {
		System.out.println("Default Constructor");
	}*/
	
	public void withdraw() {
		System.out.println("Withdraw successfull");
	}
	
	public void close() {
		System.out.println("Account is closed");
	}
}
