package com.numbertochar.controller;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.numbertochar.NumberToCharacterSequence;

@RestController
@RequestMapping("/numtochar")
public class NumberToCharSequenceController {
	
	@Autowired
	NumberToCharacterSequence numberToCharacterSequence;
	
	@GetMapping
	public String getCharacterSequence(@RequestParam int[] list_of_number) {
		return numberToCharacterSequence.getCharacterSequenceForList(list_of_number);
	}
	
	

}
