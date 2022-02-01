import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {

	public static void main(String[] args) {
		
		
		Date date = new Date();
		System.out.println("Today is: "+date);
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);

		
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String formattedDate = format2.format(date);
		System.out.println("formattedDate: "+formattedDate);
		
		// Manipulate the Calendar object to get some custom date from it
		calendar.set(Calendar.YEAR, 2023);
		calendar.set(Calendar.MONTH, 5);
		
		Date date1 = calendar.getTime();
		System.out.println(date1);
		
	}

}
