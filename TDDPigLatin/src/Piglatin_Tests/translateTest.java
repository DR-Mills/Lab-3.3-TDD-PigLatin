package Piglatin_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dustin.is.learning.PigLatinTranslator;

class translateTest {

	@Test
	void startsWithA() {
		String test = "alabama";
		String actual = PigLatinTranslator.translate(test);
		assertEquals("alabamaway", actual);
	}

	@Test
	void startsWithE() {
		String test = "Eskimo";
		String actual = PigLatinTranslator.translate(test);
		assertEquals("eskimoway", actual);
	}
	
	@Test
	void startsWithI() {
		String test = "illuminate";
		String actual = PigLatinTranslator.translate(test);
		assertEquals("illuminateway", actual);
	}
	
	@Test
	void startsWithO() {
		String test = "odd";
		String actual = PigLatinTranslator.translate(test);
		assertEquals("oddway", actual);
	}
	
	@Test
	void startsWithU() {
		String test = "uMbReLlA";
		String actual = PigLatinTranslator.translate(test);
		assertEquals("umbrellaway", actual);
	}
	
	@Test
	void startsWith1Consonant1() {
		String test = "dog";
		String actual = PigLatinTranslator.translate(test);
		assertEquals("ogday", actual);
	}
	
	@Test
	void startsWith1Consonant2() {
		String test = "Hippopotomonstrosesquippedaliophobia";
		String actual = PigLatinTranslator.translate(test);
		assertEquals("ippopotomonstrosesquippedaliophobiahay", actual);
	}
	
	@Test
	void startsWith2Consonants() {
		String test = "pseudonym";
		String actual = PigLatinTranslator.translate(test);
		assertEquals("eudonympsay", actual);
	}
	
	@Test
	void startsWith3Consonants() {
		String test = "strength";
		String actual = PigLatinTranslator.translate(test);
		assertEquals("engthstray", actual);
	}
	
	@Test
	void mixedCaseWord() {
		String test = "WoOd";
		String actual = PigLatinTranslator.translate(test);
		assertEquals("oodway", actual);
	}
	
	@Test
	void noVowels() {
		String test = "psst";
		String actual = PigLatinTranslator.translate(test);
		assertEquals("psstay", actual);
	}
}

