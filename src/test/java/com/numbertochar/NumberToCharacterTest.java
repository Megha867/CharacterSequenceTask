package com.numbertochar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.numbertochar.NumberToCharacter;

public class NumberToCharacterTest {
	
	NumberToCharacter convert = new NumberToCharacter();
	
	@Test
	public void testOddNumber() {
		char letter = convert.getCharacter(1);
		assertEquals('b', letter);
	}
	
	@Test
	public void testEvenNumber() {
		char letter = convert.getCharacter(2);
		assertEquals('A', letter);
	}
	
	@Test
	public void testGetSequenceCharacterFromOne() {
		String letter= convert.getCharacterSequence(2);
	}

}
