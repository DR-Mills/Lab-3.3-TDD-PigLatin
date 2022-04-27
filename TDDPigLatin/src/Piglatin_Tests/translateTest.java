package Piglatin_Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import dustin.is.learning.PigLatinTranslator;

class translateTest {

	@Test
	void startsWithA() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("alabama"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("alabamaway", actual);
	}

	@Test
	void startsWithE() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("Eskimo"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("eskimoway", actual);
	}
	
	@Test
	void startsWithI() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("illuminate"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("illuminateway", actual);
	}
	
	@Test
	void startsWithO() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("odd"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("oddway", actual);
	}
	
	@Test
	void startsWithU() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("uMbReLlA"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("umbrellaway", actual);
	}
	@Test
	void startsWithY() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("yellow"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("ellowyay", actual);
	}
	@Test
	void containsButDoesntStartWithY() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("glyph"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("yphglay", actual);
	}
	
	
	
	@Test
	void startsWith1Consonant1() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("dog"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("ogday", actual);
	}
	
	@Test
	void startsWith1Consonant2() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("Hippopotomonstrosesquippedaliophobia"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("ippopotomonstrosesquippedaliophobiahay", actual);
	}
	
	@Test
	void startsWith2Consonants() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("pseudonym"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("eudonympsay", actual);
	}
	
	@Test
	void startsWith3Consonants() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("strength"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("engthstray", actual);
	}
	
	@Test
	void mixedCaseWord() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("WoOd"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("oodway", actual);
	}
	
	@Test
	void noVowels() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("psst"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("psstay", actual);
	}
	@Test
	void containsCharacters() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("joe@email.com"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("joe@email.com", actual);
	}
	
	@Test
	void multipleWords() {
		ArrayList<String> test = new ArrayList<>(Arrays.asList("yogurt", "is", "healthy"));
		String actual = PigLatinTranslator.translate(test);
		assertEquals("ogurtyay isway ealthyhay", actual);
	}
	
}

