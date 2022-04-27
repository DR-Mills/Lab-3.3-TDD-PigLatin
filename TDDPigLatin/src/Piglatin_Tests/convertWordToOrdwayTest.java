package Piglatin_Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dustin.is.learning.PigLatinTranslator;

class convertWordToOrdwayTest {

	@Test
	void allCaps() {
		String test = "WORD";
		String actual = PigLatinTranslator.convertWordToOrdway(test);
		assertEquals("ORDWay", actual);
	}
	
	@Test
	void startsWithA() {
		String test = "alabama";
		String actual = PigLatinTranslator.convertWordToOrdway(test);
		assertEquals("alabamaay", actual);
	}
	
	@Test
	void startsWithNumbers() {
		String test = "123Dragon";
		String actual = PigLatinTranslator.convertWordToOrdway(test);
		assertEquals("agon123Dray", actual);
	}

	@Test
	void vowelAtEnd() {
		String test = "bro";
		String actual = PigLatinTranslator.convertWordToOrdway(test);
		assertEquals("obray", actual);
	}
}
