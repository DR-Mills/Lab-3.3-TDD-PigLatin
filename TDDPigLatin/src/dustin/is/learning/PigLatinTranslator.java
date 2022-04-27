package dustin.is.learning;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PigLatinTranslator {

	public static String translate(ArrayList<String> words) {
		String returnString = "";
		for (String word : words) {
			word = convertToLowerCase(word);
			if (containsNumber(word) || containsSymbol(word)) {
				returnString += word + " ";
			} else if (startsWithVowel(word)) {
				returnString += addWayToEnd(word) + " ";
			} else {
				returnString += convertWordToOrdway(word) + " ";
			}
		}
		return returnString.substring(0, returnString.length()-1); //removes the last " " from the last word in the String
	}

	public static String convertToLowerCase(String str) {
		return str.toLowerCase();
	}

	public static boolean startsWithVowel(String str) {
		Pattern vowel = Pattern.compile("[AaEeIiOoUu]");
		Matcher hasVowel = vowel.matcher(String.valueOf(str.charAt(0)));
		return hasVowel.find();
	}

	public static boolean containsNumber(String str) {
		Pattern number = Pattern.compile("[0-9]");
		Matcher hasNumber = number.matcher(str);
		return hasNumber.find();
	}

	public static boolean containsSymbol(String str) {
		Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		Matcher hasSpecial = special.matcher(str);
		return hasSpecial.find();
	}

	public static int indexOf1stVowel(String str) {
		if (str.startsWith("y")) {
			return 1; // nearly all words starting with y are followed by a vowel @ index 1
		}
		Pattern vowel = Pattern.compile("[AaEeIiOoUuYy]");
		Matcher hasVowel = vowel.matcher(str);
		try {
			hasVowel.find();
			return hasVowel.start();
		} catch (IllegalStateException e) {
			return str.length();
		}
	}

	public static String addWayToEnd(String str) {
		return str + "way";
	}

	public static String convertWordToOrdway(String str) {
		int firstVowelIndex = indexOf1stVowel(str);
		String subStrFront = str.substring(0, firstVowelIndex);
		String subStrEnd = str.substring(firstVowelIndex, str.length());
		return subStrEnd + subStrFront + "ay";
	}

}
