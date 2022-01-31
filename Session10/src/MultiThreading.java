
class MovieTicket{
	String name;
	int seatNumber;
	
	MovieTicket(){
		
	}

	MovieTicket(String name, int seatNumber) {
		this.name = name;
		this.seatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return "MovieTicket [name=" + name + ", seatNumber=" + seatNumber + "]";
	}
	
}

/*class BookMyShowTask{
	
	void generate() {
		for(int i=1;i<=10;i++) {
			MovieTicket ticket = new MovieTicket("~RRR~", i);
			System.out.println("[BMS] Generating MovieTicket "+ticket);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}*/

// BookMyShowTask is now a Thread :)
class BookMyShowTask extends Thread{
	
	// run is overrided by Thread class :)
	public void run() {
		for(int i=1;i<=10;i++) {
			MovieTicket ticket = new MovieTicket("~RRR~", i);
			System.out.println("[BMS] Generating MovieTicket "+ticket);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}

class Payments{
	
}

/*class PayTMMovieTickets extends Payments, Thread{ // error :(
	
}*/
// If you are inheriting some other class and you wish to use it as a thread, you can implement runnable
class PayTMMovieTickets extends Payments implements Runnable{ 
	
	public void run() {
		for(int i=1;i<=10;i++) {
			MovieTicket ticket = new MovieTicket("^Pushpa^", i);
			System.out.println("[PMT] Generating MovieTicket "+ticket);
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}


public class MultiThreading {

	// main thread represented by main method
	public static void main(String[] args) {
		
		System.out.println("[main] started");
		
		BookMyShowTask task1 = new BookMyShowTask();
		
		// For the class, which implements Runnable write Polymorphic Statement
		Runnable ref = new PayTMMovieTickets();
		Thread task2 = new Thread(ref);
		
		task1.setName("BMS");
		task2.setName("PMT");
		
		task1.setPriority(Thread.MAX_PRIORITY); // 10
		task2.setPriority(Thread.MIN_PRIORITY); // 1 
		//Thread.NORM_PRIORITY // 5
		
		
		System.out.println("Task1 name:"+task1.getName()+" Priority: "+task1.getPriority());
		System.out.println("Task2 name:"+task2.getName()+" Priority: "+task2.getPriority());
		System.out.println("main name:"+Thread.currentThread().getName()+" Priority: "+Thread.currentThread().getPriority());
		
		
		//task.generate();
		task1.start(); // start is method in the Thread class, which internally executes the run method
		try {
			// join will make other threads to wait till time, task1 has not finished its execution
			// should be executed immediately after start
			task1.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		task2.start();
		
		for(int i=1;i<=10;i++) {
			MovieTicket ticket = new MovieTicket("*Avengers*", i);
			System.out.println("[main] Generating MovieTicket "+ticket);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("[main] finsihed");
		

	}

}
