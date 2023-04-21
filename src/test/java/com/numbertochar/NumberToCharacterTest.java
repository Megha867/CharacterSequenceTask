package com.numbertochar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.numbertochar.NumberToCharacter;

public class NumberToCharacterTest {
	
	NumberToCharacter convert = new NumberToCharacter();
	
	@Test
	public void testOdddNumber() {
		char letter = convert.getCharacterSequence(1);
		assertEquals('b', letter);
	}
	
	@Test
	public void testEvenNumber() {
	
	}

}
