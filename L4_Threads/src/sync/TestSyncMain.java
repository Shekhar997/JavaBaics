package sync;

public class TestSyncMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table table = new Table();
		
		Thread1 t = new Thread1(table);
		
		Thread2 t2 = new Thread2(table);
		
		t.start();
		
		t2.start();

	}

}
