package Piglatin_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dustin.is.learning.PigLatinTranslator;

class ContainsSymbolTest {

	@Test
	void containsSymbolWithin() {
		String test = "google@gmail";
		boolean actual = PigLatinTranslator.containsSymbol(test);
		assertEquals(true, actual);
	}

	@Test
	void numbersWithSymbol() {
		String test = "5+3";
		boolean actual = PigLatinTranslator.containsSymbol(test);
		assertEquals(true, actual);
	}
	
	@Test
	void noSymbols() {
		String test = "IHaveNoSymbols";
		boolean actual = PigLatinTranslator.containsSymbol(test);
		assertEquals(false, actual);
	}
}
