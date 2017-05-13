package org.pranna.katas.fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTester {
	FizzBuzz fizBuzz = new FizzBuzz();
	boolean isDivisibleByThree = false;
	String expected = "";
	String actual = "";

	@Test
	public void testFizzBuzzObject() {
		assertEquals(FizzBuzz.class.getName(), fizBuzz.getClass().getName());
	}
	
	@Test
	public void givenANumberDivisibleByThreeShouldReturnFizz(){
		String number = "";
		number = fizBuzz.fizzBuzz(3);
		assertEquals("Fizz", number);
		number = fizBuzz.fizzBuzz(6);
	}
	
	@Test
	public void givenANumberNotDivisibleByThreeShouldReturnNumber(){
		expected = "1";
		actual = fizBuzz.fizzBuzz(1);
		assertEquals(expected, actual);
	}
	
	@Test 
	public void givenANumberDivisibleByFiveShouldReturnBuzz(){
		expected = "Buzz";
		actual = fizBuzz.fizzBuzz(5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void givenANumberNotDivisibleByThreeOrFiveShouldReturnNumber(){
		expected = "1";
		actual = fizBuzz.fizzBuzz(1);
		assertEquals(expected, actual);
	}
	
	@Test
	public void givenANumberDivisibleByThreeAndFiveShouldReturnFizzBuzz(){
		expected = "FizzBuzz";
		actual = fizBuzz.fizzBuzz(15);
		assertEquals(expected, actual);
	}
	
	@Test 
	public void givenANumberNotDivisibleByFiveAndThreeShouldReturnSameNumber(){
		expected = "8";
		actual = fizBuzz.fizzBuzz(8);
		assertEquals(expected, actual);
	}
	
	@Test
	public void givenASetOfNumbersShouldShowFizzBuzzAccordingly(){
		expected = "012Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz";
		for(int i = 0; i < 16; i++)
			actual += fizBuzz.fizzBuzz(i);
		assertEquals(expected, actual);
	}

}
