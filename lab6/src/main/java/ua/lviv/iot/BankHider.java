package ua.lviv.iot;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankHider {
	private static String regularEx = "\\d{4}";
	private static String secondPattern = "[^\\d]*(\\d{4}\\s?){3}\\d{4}(\\s?|\\w)[^\\d]*";

	public static void printText(String text) {
		final Pattern mainPattern = Pattern.compile(regularEx);
		final Pattern cardNumberSeeker = Pattern.compile(secondPattern);
		final Matcher cardMatcher = cardNumberSeeker.matcher(text);
		System.out.println("Line with hidden bank number:");

		while (cardMatcher.find()) {
			Matcher digitMatcher = mainPattern.matcher(cardMatcher.group());
			System.out.print(digitMatcher.replaceFirst(""));
		}
	}
}