package _03_Threaded_Reverse_Greeting;

public class ThreadedGreeter implements Runnable{

	int threadNumber;
	
	ThreadedGreeter(int threadNumber){
		this.threadNumber = threadNumber;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		if(threadNumber <= 50) {
			Thread t = new Thread(new ThreadedGreeter(threadNumber +1));
			t.start();
			System.out.println("Hello from thread number: " + threadNumber);
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
