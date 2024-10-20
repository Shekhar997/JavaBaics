
public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntThread i1 = new IntThread("Thread 1");
		
		//i1.start();
		i1.run();
		
		IntThread i2 = new IntThread("Thread 2");
		i2.setDaemon(true);
		i2.start();
		
		
		System.out.println("Thread name "+ i2.getName());
		
		System.out.println("Thread id "+i2.getId());
		
		for(int i = 0;i<10;i++) {
			System.out.println("Int thread "+ i);
			
			
			  try { Thread.sleep(100); } 
			  catch (InterruptedException e) { // TODO
			  //Auto-generated catch block 
			  e.printStackTrace(); }
			 
		}
		
		//i2.start();

	}

}
