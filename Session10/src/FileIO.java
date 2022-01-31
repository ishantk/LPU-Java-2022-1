import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


class Customer{
	
	String name;
	String phone;
	float temperature;
	String inDateTime;
	String outDateTime;
	
	Customer(){
		
	}

	Customer(String name, String phone, float temperature, String inDateTime, String outDateTime) {
		this.name = name;
		this.phone = phone;
		this.temperature = temperature;
		this.inDateTime = inDateTime;
		this.outDateTime = outDateTime;
	}

	public String toString() {
		return name+","+phone+","+temperature+","+inDateTime+","+outDateTime+"\n";
	}
	
}

class CovidCustomerManagementApp{
	
	FileIOOperations ioOperations;
		
	CovidCustomerManagementApp(){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to Customer Management Solution");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		// Create the Object of FileIOOperations :)
		ioOperations = new FileIOOperations();
	}
	
	
	void markEntryForCustomer() {
		
		System.out.println("Enter the Customer Details :)");
		
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		System.out.println("Enter Customer Name: ");
		customer.name = scanner.nextLine();
		
		System.out.println("Enter Customer Phone: ");
		customer.phone = scanner.nextLine();
		
		System.out.println("Enter Customer In Date Time: ");
		customer.inDateTime = scanner.nextLine();
		customer.outDateTime = customer.inDateTime;
		
		System.out.println("Enter Customer Temperature: ");
		customer.temperature = scanner.nextFloat();
		scanner.close();
		
		System.out.println("Customer Details: "+customer);
		
		//ioOperations.writeDataInFile(customer.toString());
		ioOperations.writeDataInBinaryFile(customer.toString());
		
	}
	
	void markExitForCustomer() {
		// Updating the data means a big time algo :)
		// Hence, we need databases rather than files
		// When we use files is basically to read or write. Thats it
	}
	
	void readCustomerEntries() {
		//ioOperations.readFromFile();
		ioOperations.readFromFileInBinary();
	}
	
}

class FileIOOperations{
	
	void writeDataInFile(String dataToWrite) {
		
		// FileWriter -> writes data as text
		
		try {
			File file = new File("customers.csv"); // reference to the file
			//FileWriter writer = new FileWriter(file); // for writing data in text file
			FileWriter writer = new FileWriter(file, true); // for writing data in text file using append mode
			writer.write(dataToWrite); // write data in file
			writer.close(); // releases memory resources
			System.out.println("Data Saved :)");
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	
	}
	
	void readFromFile() {
		try {
			
			File file = new File("customers.csv"); 
			//File file = new File("/Users/ishant/Documents/BATCHES/LPU-JavaEE-22-1/Session10/src/Blocks.java");
			FileReader reader = new FileReader(file); // read char by char
			BufferedReader buffer = new BufferedReader(reader); // read line by line
			
			String line = "";
			while((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	}
	
	void writeDataInBinaryFile(String dataToWrite) {
		
		//FileOutputStream -> Write data as bytes
		
		try {
			File file = new File("customers1.csv"); // reference to the file
			
			//FileOutputStream stream = new FileOutputStream(file);
			FileOutputStream stream = new FileOutputStream(file, true);
			stream.write(dataToWrite.getBytes());
			stream.close();
			System.out.println("Data Saved :)");
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	
	}
	
	void readFromFileInBinary() {
		try {
			
			File file = new File("customers.csv"); 
			//File file = new File("/Users/ishant/Documents/BATCHES/LPU-JavaEE-22-1/Session10/src/Blocks.java");
			
			FileInputStream stream = new FileInputStream(file);
			
			int data = 0;
			while((data = stream.read()) != -1) {
				System.out.print((char)data);
			}
			
			stream.close();
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	}
	
	// how eclipse generates source file :)
	void generateJavaSourceFile() {
		try {
			
			StringBuffer buffer = new StringBuffer();
			buffer.append("class MyApp{\n");
			buffer.append("\tpublic static void main(String[] args){\n");
			buffer.append("\t\tSystem.out.println(\"Hello\");\n");
			buffer.append("\t}\n");
			buffer.append("}\n");
			
			File file = new File("MyApp.java");
			FileWriter writer = new FileWriter(file);
			writer.write(buffer.toString());
			writer.close();
			System.out.println("MyApp.java Generated");
			
		} catch (Exception e) {
			System.out.println("Something Went Wrong: "+e);
		}
	}
	
}

public class FileIO {

	public static void main(String[] args) {
		
		//CovidCustomerManagementApp app = new CovidCustomerManagementApp();
		//app.markEntryForCustomer();
		//app.readCustomerEntries();
		
		FileIOOperations ioOperations = new FileIOOperations();
		ioOperations.generateJavaSourceFile();
		
	}

}
