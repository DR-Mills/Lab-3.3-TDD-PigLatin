package dustin.is.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PigLatinPrompt {

	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		ArrayList<String> words = stringAsArrayList(promptForWord(scnr));
		String translatedWord = PigLatinTranslator.translate(words);
		System.out.println(translatedWord);
		
	}

	private static String promptForWord(Scanner scnr) {
		System.out.print("Welcome to the PigLatin Translator.\n" + "Please enter a word to translate: ");
		return scnr.nextLine();
	}
	
	private static ArrayList<String> stringAsArrayList(String str) {
		ArrayList<String> strAsArrayList = new ArrayList<>(Arrays.asList(str.split(" ")));
		return strAsArrayList;
	}
}
