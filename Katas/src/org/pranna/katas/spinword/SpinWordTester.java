package org.pranna.katas.spinword;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpinWordTester {
	SpinWord sw = new SpinWord();
	String actual ;
	String expected;

	@Test
	public void getSpinWordObject() {
		assertEquals(SpinWord.class.getName(), sw.getClass().getName());
	}
	
	@Test
	public void returnNullifPassedNull(){
		expected = null;
		actual = sw.spinWord(null);
		assertEquals(expected, actual);
	}
	
	@Test
	public void passWordLessThanFiveShouldReturnString(){
		expected = "abc";
		actual = sw.spinWord("abc");
		assertEquals(expected, actual);
	}
	
	@Test
	public void passWordGreaterThanFiveShouldReverse(){
		expected = ("hdomarp");
		actual = sw.spinWord("pramodh");
		assertEquals(expected, actual);
	}
	
	@Test
	public void givenAPhraseWithWordsLessThanFiveReturnNormal(){
		expected = ("This is just a word");
		actual = sw.spinWords(expected);
		assertEquals(expected, actual);
	}

	@Test
	public void givenAPhraseWithWordsGreatherThanFiveReturnReversed(){
		expected = ("Hey wollef sroirraw");
		actual = sw.spinWords("Hey fellow warriors");
		assertEquals(expected, actual);
	}
}
