package com.numbertochar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class NumberToCharacterTest {
	
	NumberToCharacter convert ;
	
	@BeforeEach
	public void setUp() {
		convert= new NumberToCharacter();
	}
	
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
	public void testSequenceCharacterFromOne() {
		String sequenceCharacter= convert.getCharacterSequence(2);
		assertEquals("bA", sequenceCharacter);
	}
	
	@Test
	public void testSequenceCharacterFromOneToOddNumber() {
		String sequenceCharacter= convert.getCharacterSequence(5);
		assertEquals("bAbAb", sequenceCharacter);
	}
	
	@Test
	public void testSequenceCharacterForList() {
		int list_of_numbers[] = new int[] {1,2,3,4};
		String sequenceCharacter = convert.getCharacterSequenceList(list_of_numbers);
		assertEquals("b-bA-bAb-bAbA", sequenceCharacter);
	}
	
	

}
