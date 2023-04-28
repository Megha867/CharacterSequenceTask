package com.numbertochar;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class NumberToCharacterSequenceTest {
	
	NumberToCharacterSequence convert ;
	
	@BeforeEach
	public void setUp() {
		convert= new NumberToCharacterSequence();
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,3,5,7})
	public void shouldReturn_b_whenNumberIsOdd(int number) {
		assertEquals('b', convert.getCharacterForNumber(number));
	}
	
	@ParameterizedTest
	@ValueSource(ints = {2,4,6,8})
	public void shouldReturn_A_whenNumberIsEven(int number) {
		assertEquals('A', convert.getCharacterForNumber(number));
	}
	
	@Test
	public void shouldReturnSequenceCharacter_ForGivenEvenNumber() {
		assertEquals("bA", convert.getCharacterSequenceForNumber(2));
	}
	
	@Test
	public void shouldReturnSequenceCharacter_ForGivenOddNumber() {
		assertEquals("bAbAb", convert.getCharacterSequenceForNumber(5));
	}
	
	@Test
	public void shouldReturnSequenceCharacter_ForGivenListOfNumbers() {
		assertEquals("b-bA-bAb-bAbA", convert.getCharacterSequenceForList(new int[] {1,2,3,4}));
	}
	
	@Test
	public void shouldReturnZero_WhenNumberIsZero() {
		assertEquals("0", convert.getCharacterSequenceForNumber(0));
	}
	
	@Test
	public void shouldReturnSequenceOfCharacterAndZeroWhenListContainsZero() {
		assertEquals("b-bA-0-bAbA", convert.getCharacterSequenceForList(new int[] {1,2,0,4}));
	}
	

}
