package com.numbertochar;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class NumberToCharacterSequence {
	
	public char getCharacterForNumber(int number) {
		return (number%2==0)?'A':'b';
	}
	
	public String getCharacterSequenceForNumber(int number) {
		String characterSequence="";
		if(number>0) {
			for(int counter=1;counter<=number;counter++) {
				characterSequence+=getCharacterForNumber(counter);
			}
		}
		if(number<=0) 
			characterSequence+="0";
		return characterSequence;
	}

	public String getCharacterSequenceForList(int[] list_of_number) {
		String characterSequence="";
		for(int array_index=0;array_index<list_of_number.length;array_index++) {
			characterSequence+=getCharacterSequenceForNumber(list_of_number[array_index]);
				if(!(array_index==list_of_number.length-1))
					characterSequence+="-";
		}
		return characterSequence;
	}

}
