package com.numbertochar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.numbertochar.NumberToCharacter;

public class NumberToCharacterTest {
	
	NumberToCharacter convert = new NumberToCharacter();
	
	@Test
	public void testOddNumber() {
		String letter = convert.getCharacterSequence(1);
		assertEquals("b", letter);
	}
	
	@Test
	public void testEvenNumber() {
		String letter = convert.getCharacterSequence(2);
		assertEquals("A", letter);
	}
	
	@Test
	public void testGetSequenceCharacterFrom1() {
		String letter= convert.getCharacterSequence(2);
		assertEquals("bA", letter);
	}

}
