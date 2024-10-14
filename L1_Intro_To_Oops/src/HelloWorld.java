
public class HelloWorld {
	
	public static void main(String[] args) {
		
		System.out.println("Hellow World!1");
		
		int v1 = 2;
		
		BankAccount ac1 = new BankAccount(1,"Shekhar",52000,45325);
		
		BankAccount ac2 = new BankAccount(1,"Shekhar",52000,45325);
		
		ac1.withdraw();
		
		ac1.close();
	}

}
