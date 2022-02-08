package com.auribises.bean;

// Bean: Its a Java Object Structure
//       It must have getters and setters 
public class Connection {
	
	String url;
	String username;
	String password;

	public Connection() {
		System.out.println("[Connection] - default constructor");
	}

	Connection(String url, String username, String password) {
		System.out.println("[Connection] - paramterized constructor");
		this.url = url;
		this.username = username;
		this.password = password;
	}

	// Getters and Setters are a mandatory part inside the bean
	// And they must be public
	@Override
	public String toString() {
		return "Connection [url=" + url + ", username=" + username + ", password=" + password + "]";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	// Bean Life Cycle
	// User Defined methods init and destroy, can be any name
	public void myInit() {
		System.out.println("[Connection] - myInit - "+username);
	}
	
	public void myDestroy() {
		System.out.println("[Connection] - myDestroy");
	}
	
}
