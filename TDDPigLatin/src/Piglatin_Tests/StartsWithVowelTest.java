package Piglatin_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dustin.is.learning.PigLatinTranslator;

class StartsWithVowelTest {

	@Test
	void startsWithLowercaseA() {
		String test = "apple";
		boolean actual = PigLatinTranslator.startsWithVowel(test);
		assertEquals(true, actual);
	}

	@Test
	void startsWithUppercaseE() {
		String test = "Elephant";
		boolean actual = PigLatinTranslator.startsWithVowel(test);
		assertEquals(true, actual);
	}
	
	@Test
	void startsWithConsonant() {
		String test = "potato";
		boolean actual = PigLatinTranslator.startsWithVowel(test);
		assertEquals(false, actual);
	}
}
