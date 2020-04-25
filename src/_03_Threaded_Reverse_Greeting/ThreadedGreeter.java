package _03_Threaded_Reverse_Greeting;

public class ThreadedGreeter implements Runnable{

	int threadNumber;
	
	ThreadedGreeter(){
		threadNumber = 0;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: " + threadNumber);
	}

}
