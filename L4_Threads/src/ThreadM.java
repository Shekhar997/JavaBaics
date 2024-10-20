
public class ThreadM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		intThread1 t1 = new intThread1();
		
		intThread1 t2 = new intThread1();
		t2.setDaemon(true);
		
		intThread1 t3 = new intThread1();
		t3.setPriority(10);
		
		for(int i = 0;i<1;i++) {
			t1.start();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			t2.start();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			t3.start();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
