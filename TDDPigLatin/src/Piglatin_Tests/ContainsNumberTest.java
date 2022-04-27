package Piglatin_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dustin.is.learning.PigLatinTranslator;

class ContainsNumberTest {

	@Test
	void startsWithNumber() {
		String test = "4long";
		boolean actual = PigLatinTranslator.containsNumber(test);
		assertEquals(true, actual);
	}

	@Test
	void containsNumber() {
		String test = "be4long";
		boolean actual = PigLatinTranslator.containsNumber(test);
		assertEquals(true, actual);
	}
	

}
