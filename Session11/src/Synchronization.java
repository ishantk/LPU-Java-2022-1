class MovieTicket{
	
	String name;
	char row;
	int seatNumber;
	int price;
	String userEmail;
	boolean isBooked;
	
	
	MovieTicket(){
		price = 200;
		userEmail = "";
		isBooked = false;
	}

	MovieTicket(String name, char row, int seatNumber) {
		this();
		this.name = name;
		this.row = row;
		this.seatNumber = seatNumber;
	}

	@Override
	public String toString() {
		return "MovieTicket [name=" + name + ", row=" + row + ", seatNumber=" + seatNumber + ", price=" + price
				+ ", userEmail=" + userEmail + ", isBooked=" + isBooked + "]";
	}
	
}

class CA{

	// locking the method for usage by multiple threads
	synchronized void book() {
		
	}
}

// BookMovieTicketTask is a Thread
// Why it is Thread -> Booking a ticket can be a time consuming job due to 
// internet connectivity and it must be done by a child thread and not by main
class BookMovieTicketTask extends Thread{
	
	MovieTicket ticket;
	User user;
	
	BookMovieTicketTask(MovieTicket ticket, User user){
		this.ticket = ticket;
		this.user = user;
		System.out.println("Movie Ticket Seat Selected: "+ticket.seatNumber+" by "+user.name);
	}
	
	public void run() {
		
		// Locking the ticket object
		// No other thread will be able to read or write in the same ticket object
		// i.e. if the first thread has entered the block, other threads will wait to access the same ticket object
		synchronized (ticket) {
			
			if(!user.isPrime) {
				try {
					// State of Thread here is: BLOCKED/WAITING/TIMED_WAITITING
					ticket.wait(); 		 // wait will make the thread to wait and temporarily release the lock
					//ticket.wait(3000); // Timed Waiting :) -> automatically resume after 3 secs
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			if(!ticket.isBooked) {
				// 1. Make the Payment
				System.out.println("Dear, "+user.name+" Please pay: "+ticket.price+" for your movie "+ticket.name+"....");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thank you "+user.name+" for making the payment of "+ticket.price);
				
				
				// 2. Update the Status of MovieTicket Object
				ticket.isBooked = true;
				ticket.userEmail = user.email;
				
				// 3. Send an Email to Customer for the booked Movie Ticket 
				System.out.println("Ticket Booked and Email Sent to "+user.email);
				ticket.notify(); // who so ever thread is waiting, notify it to resume the execution
			}else {
				System.out.println("Sorry, "+user.name+" Ticket "+ticket.seatNumber+" already booked");
			}
		} // once the synchronized block finished, lock is released
		
	}
}

class User{
	
	String name;
	String email;
	boolean isPrime;
	
	User(){
		
	}

	User(String name, String email, boolean isPrime) {
		this.name = name;
		this.email = email;
		this.isPrime = isPrime;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", isPrime=" + isPrime + "]";
	}
	
}


public class Synchronization {

	public static void main(String[] args) {
	
		MovieTicket ticket1 = new MovieTicket("Pushpa", 'A', 1);
		MovieTicket ticket2 = new MovieTicket("Pushpa", 'A', 2);
		MovieTicket ticket3 = new MovieTicket("Pushpa", 'A', 3);
		MovieTicket ticket4 = new MovieTicket("Pushpa", 'A', 4);
		MovieTicket ticket5 = new MovieTicket("Pushpa", 'A', 5);
		
		MovieTicket[] rowA = {ticket1, ticket2, ticket3, ticket4, ticket5};
		for(MovieTicket ticket : rowA) {
			System.out.println(ticket);
		}
		
		System.out.println();
		
		User user1 = new User("John", "john@example.com", false);
		User user2 = new User("Fionna", "fionna@example.com", true);
		
		// 2 different users, would like to book 2 different tickets
		//BookMovieTicketTask task1 = new BookMovieTicketTask(ticket1, user1);
		//BookMovieTicketTask task2 = new BookMovieTicketTask(ticket4, user2);
		
		// in a certain use case, 2 different users can also attempt to book the same movie ticket
		// In this scenario our algos can behave differently as multiple threads are trying to share the same object
		// we need Synchronization :)
		BookMovieTicketTask task1 = new BookMovieTicketTask(ticket3, user1);
		System.out.println("1. task1 state is: "+task1.getState()); // NEW
		
		BookMovieTicketTask task2 = new BookMovieTicketTask(ticket3, user2);
		
		// both the threads will run in parallel i.e. asynchronously and book movie tickets
		task1.start(); // RUNNABLE
		System.out.println("2. task1 state is: "+task1.getState());
		task2.start(); 
		
	
		try {
			Thread.sleep(5000); // so as above threads do the job and we will print the status of Movie Tickets later
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("3. task1 state is: "+task1.getState()); // TERMINATED
		
		System.out.println();
		for(MovieTicket ticket : rowA) {
			System.out.println(ticket);
		}
		
		
		
	}

}

// Deadlock: when both threads are waiting to be notified by each other
