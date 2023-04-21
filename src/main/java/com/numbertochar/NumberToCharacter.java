package com.numbertochar;

public class NumberToCharacter {
	
	
	public char getCharacter(int number) {
			if(number%2==0)
				return 'A';
			else
				return 'b';
	}
	
	public String getCharacterSequence(int number) {
		String outputString="";
		for(int count=1;count<=number;count++) {
			if(count%2==0)
				outputString+="A";
			else
				outputString+="b";
		}
		return outputString;
	}

	public String getCharacterSequenceList(int[] list_of_number) {
		return null;
	}

}
