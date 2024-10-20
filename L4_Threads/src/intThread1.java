
public class intThread1 extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		for(int i = 0;i<10;i++) {
			System.out.println("Int Thread "+ i +" "+ this.getName());
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
