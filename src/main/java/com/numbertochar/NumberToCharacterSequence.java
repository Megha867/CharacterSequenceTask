package com.numbertochar;

public class NumberToCharacterSequence {
	
	public char getCharacterForNumber(int number) {
			if(number%2==0)
				return 'A';
			else
				return 'b';
	}
	
	public String getCharacterSequenceForNumber(int number) {
		String outputString="";
		if(number>0) {
			for(int count=1;count<=number;count++) {
				if(count%2==0)
					outputString+="A";
				else
					outputString+="b";
			}
		}
		if(number<=0) {
			outputString+="0";
		}
		return outputString;
	}

	public String getCharacterSequenceForList(int[] list_of_number) {
		String outputString="";
		for(int array_index=0;array_index<list_of_number.length;array_index++) {
				if(list_of_number[array_index]>0) {
					for(int count=1;count<=list_of_number[array_index];count++) {
						if(count%2==0)
							outputString+="A";
						else
							outputString+="b";
					}
				}
				if(list_of_number[array_index]<=0) {
					outputString+="0";
				}
				if(!(array_index==list_of_number.length-1))
					outputString+="-";
		}
		return outputString;
	}

}
