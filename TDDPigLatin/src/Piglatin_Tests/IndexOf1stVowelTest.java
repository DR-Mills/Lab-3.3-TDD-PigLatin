package Piglatin_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dustin.is.learning.PigLatinTranslator;

class IndexOf1stVowelTest {

	@Test
	void startsWithVowel() {
		String test = "apple";
		int actual = PigLatinTranslator.indexOf1stVowel(test);
		assertEquals(0, actual);
	}

	@Test
	void vowelAtIndex1() {
		String test = "dog";
		int actual = PigLatinTranslator.indexOf1stVowel(test);
		assertEquals(1, actual);
	}
	
	@Test
	void vowelAtIndex2() {
		String test = "dragon";
		int actual = PigLatinTranslator.indexOf1stVowel(test);
		assertEquals(2, actual);
	}
	
	@Test
	void noVowel() {
		String test = "bcdfghjklmnpqrstvwxz";
		int actual = PigLatinTranslator.indexOf1stVowel(test);
		assertEquals(-1, actual);
	}
}
