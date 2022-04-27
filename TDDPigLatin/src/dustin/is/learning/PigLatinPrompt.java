package dustin.is.learning;

import java.util.Scanner;

public class PigLatinPrompt {

	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		String word = promptForWord(scnr);
		String translatedWord = PigLatinTranslator.translate(word);
		System.out.println(translatedWord);
		
	}

	private static String promptForWord(Scanner scnr) {
		System.out.print("Welcome to the PigLatin Translator.\n" + "Please enter a word to translate: ");
		return scnr.nextLine();
		
	}
}
