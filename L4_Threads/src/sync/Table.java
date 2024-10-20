package sync;

public class Table {
	
	public synchronized void printTable(int n) {
		for(int i = 1;i<=10;i++) {
			System.out.println(i + " * " + n +"="+i*n);
		}
	}

}
