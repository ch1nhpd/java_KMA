package Buoi10.page39;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaExtractNumbersInString {
	public static void main(String[] args) {
		String str = "This string has numbers 35 and 21 in it.";
		System.out.println(str);
		// Find 1 or more numbers.
		Pattern p = Pattern.compile("\\d+");
		System.out.println("pattern: "+ p.toString());
		Matcher m = p.matcher(str);
		System.out.println("Matcher: "+ m.toString());
		while (m.find()) {
			String found = str.substring(m.start(), m.end());
			System.out.println("M.stat: "+ m.start()+" M.end: "+ m.end());
			System.out.println("Found: "+ found);
			Integer i = Integer.valueOf(found);
			System.out.println("Number found is: " + i);
		}
	}
}
