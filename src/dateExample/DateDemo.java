package dateExample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		// Standard date format
		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		sdf.format(d);
		System.out.println(sdf.format(d));

		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(sdf1.format(d));

		SimpleDateFormat sdf2 = new SimpleDateFormat();
		System.out.println(sdf2.format(d));
	}

}
