package org.pranna.katas.spinword;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SpinWord {

	public String spinWord(String word) {
		if(word == null) 
			return null;
		if(word.length() < 5) 
			return word;
		else 
			return reverse(word);
	}
	
	private String reverse(String word){
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString();
	}

	public String spinWords(String expected) {
		return Arrays.asList(expected.split(" ")).stream().map(str -> spinWord(str)).collect(Collectors.joining(" "));
//		String[] st = expected.split(" ");
//		for(int i=0; i < st.length; i++)
//			st[i] = spinWord(st[i]);
//		return String.join(" ", st);
	}

}
