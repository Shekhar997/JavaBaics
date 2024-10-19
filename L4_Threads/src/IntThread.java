
public class IntThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();

		for (int i = 0; i < 10; i++) {
			System.out.println("Int thread " + i + " " + this.getName());

			
			  try { Thread.sleep(200); }
			  catch (InterruptedException e) { 
				  // TODO
			  //Auto-generated catch block 
				  e.printStackTrace(); }
			 
		}

	}

	public IntThread() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IntThread(Runnable task, String name) {
		super(task, name);
		// TODO Auto-generated constructor stub
	}

	public IntThread(Runnable task) {
		super(task);
		// TODO Auto-generated constructor stub
	}

	public IntThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public IntThread(ThreadGroup group, Runnable task, String name, long stackSize,
			boolean inheritInheritableThreadLocals) {
		super(group, task, name, stackSize, inheritInheritableThreadLocals);
		// TODO Auto-generated constructor stub
	}

	public IntThread(ThreadGroup group, Runnable task, String name, long stackSize) {
		super(group, task, name, stackSize);
		// TODO Auto-generated constructor stub
	}

	public IntThread(ThreadGroup group, Runnable task, String name) {
		super(group, task, name);
		// TODO Auto-generated constructor stub
	}

	public IntThread(ThreadGroup group, Runnable task) {
		super(group, task);
		// TODO Auto-generated constructor stub
	}

	public IntThread(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

}
