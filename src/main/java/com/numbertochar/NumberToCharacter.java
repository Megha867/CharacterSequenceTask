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
		String outputString="";
		for(int array_index=0;array_index<list_of_number.length;array_index++) {
			for(int count=1;count<=list_of_number[array_index];count++) {
				if(count%2==0)
					outputString+="A";
				else
					outputString+="b";
			}
			if(!(array_index==list_of_number.length-1))
				outputString+="-";
		}
		return outputString;
	}

}
