package Piglatin_Tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dustin.is.learning.PigLatinTranslator;

class ConvertToLowerCaseTest {

	@Test
	void alreadyLowerCase() {
		String test = "lowercase";
		String expected = "lowercase";
		String actual = PigLatinTranslator.convertToLowerCase(test);
		assertEquals(expected, actual);
	}

	@Test
	void allUpperCase() {
		String test = "UPPERCASE";
		String expected = "uppercase";
		String actual = PigLatinTranslator.convertToLowerCase(test);
		assertEquals(expected, actual);
	}
	
	@Test
	void mixedCaseStartUpper() {
		String test = "MiXeDcAsE";
		String expected = "mixedcase";
		String actual = PigLatinTranslator.convertToLowerCase(test);
		assertEquals(expected, actual);
	}
	
	
	@Test
	void upperCaseContainsCharacters() {
		String test = "UPPERCASE@#$";
		String expected = "uppercase@#$";
		String actual = PigLatinTranslator.convertToLowerCase(test);
		assertEquals(expected, actual);
	}
}
