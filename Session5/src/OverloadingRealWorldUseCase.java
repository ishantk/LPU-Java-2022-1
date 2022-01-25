class Authentication{
	
	// Method Overloading
	static void login(String email, String password) {
		System.out.println("Logging in with Email and Password");
	}
	
	static void login(String phone, int otp) {
		System.out.println("Logging in with Phone and OTP");
	}
	
	static void login(String gmailId) {
		System.out.println("Logging in with Google Account");
	}
	
}


public class OverloadingRealWorldUseCase {
	
	public static void main(String[] args) {
		
		Authentication.login("john@example.com", "john123");
		Authentication.login("john@gmail.com");
		Authentication.login("+91 99999 11111", 1299);

	}

}
