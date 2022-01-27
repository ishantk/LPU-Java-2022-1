
class YoutubeChannel{
	
	String name;
	Notification notification;
	
	YoutubeChannel() {
		name = "auribises";
	}
	
	void uploadVideo(String videoName) {
		notification.notifyUser("A new Video Uploaded: "+videoName);
	}
	
	void subscribe(Notification notification) { // Polymorphic Statement
		this.notification = notification; // reference of User copied to Notification :)
		System.out.println("Thank You for Subscribing");
	}
	
}

abstract class Notification{
	abstract void notifyUser(String message);
}

class User extends Notification{
	
	String name;
	String email;
	
	User(){
		name = "John";
		email = "john@example.com";
	}
	
	void notifyUser(String message) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Dear, "+name);
		System.out.println("A New Notification Received");
		System.out.println("Message: "+message);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}

public class YoutubeAbstraction {

	public static void main(String[] args) {
		
		YoutubeChannel channel = new YoutubeChannel();
		
		User user = new User();
		
		channel.subscribe(user);
		
		channel.uploadVideo("Learning Java With Ishant");

	}

}
