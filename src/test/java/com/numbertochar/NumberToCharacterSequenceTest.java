package com.numbertochar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class NumberToCharacterSequenceTest {
	
	NumberToCharacterSequence convert ;
	
	@BeforeEach
	public void setUp() {
		convert= new NumberToCharacterSequence();
	}
	
	@Test
	public void testOddNumber() {
		char letter = convert.getCharacterForNumber(1);
		assertEquals('b', letter);
	}
	
	@Test
	public void testEvenNumber() {
		char letter = convert.getCharacterForNumber(2);
		assertEquals('A', letter);
	}
	
	@Test
	public void testSequenceCharacterFromOne() {
		String sequenceCharacter= convert.getCharacterSequenceForNumber(2);
		assertEquals("bA", sequenceCharacter);
	}
	
	@Test
	public void testSequenceCharacterFromOneToOddNumber() {
		String sequenceCharacter= convert.getCharacterSequenceForNumber(5);
		assertEquals("bAbAb", sequenceCharacter);
	}
	
	@Test
	public void testSequenceCharacterForList() {
		int list_of_numbers[] = new int[] {1,2,3,4};
		String sequenceCharacter = convert.getCharacterSequenceForList(list_of_numbers);
		assertEquals("b-bA-bAb-bAbA", sequenceCharacter);
	}
	
	@Test
	public void testWhenNumberIsZero() {
		String sequenceCharacter= convert.getCharacterSequenceForNumber(0);
		assertEquals("0", sequenceCharacter);
	}
	
	
	@Test
	public void testSequenceCharacterForListWhenNumberIsZero() {
		int list_of_numbers[] = new int[] {1,2,0,4};
		String sequenceCharacter = convert.getCharacterSequenceForList(list_of_numbers);
		assertEquals("b-bA-0-bAbA", sequenceCharacter);
	}
	

}
