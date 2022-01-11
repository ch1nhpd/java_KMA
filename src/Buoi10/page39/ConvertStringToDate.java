package Buoi10.page39;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class ConvertStringToDate {
	public static void main(String[] args) {
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");
		SimpleDateFormat formatter2 = new SimpleDateFormat("dMy");
		String dateString = "12042014";
		try {
			Date date = formatter.parse(dateString);
			System.out.println("Date string: " + dateString);
			System.out.println("String convert to date: " + date);
			System.out.println("Date with formatter : " + formatter.format(date));
			System.out.println("Date with formatter2: " + formatter2.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
