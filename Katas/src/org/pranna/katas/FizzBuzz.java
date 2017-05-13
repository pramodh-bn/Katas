package org.pranna.katas;

public class FizzBuzz {

	
	public String fizzBuzz(int i) {
		if(isDivisibleByFiveAndThree(i))
			return "FizzBuzz";
		else if(isDivisibleByThree(i))
			return "Fizz";
		else if(isDivisibleByFive(i))
			return "Buzz";
		else 
			return String.valueOf(i);
	}
	
	public boolean isDivisibleByFiveAndThree(int i){
		return isDivisibleByThree(i) && isDivisibleByFive(i);
	}

	public boolean isDivisibleByThree(int i) {
		return i % 3 == 0 && isNotZero(i);
	}

	private boolean isDivisibleByFive(int i) {
		return i % 5 == 0 && isNotZero(i);
	}
	
	public boolean isNotZero(int i){
		return i != 0;
	}

	public static void main(String[] args) {
		FizzBuzz fizzBuzzer = new FizzBuzz();
		for(int i=0; i < 100; i++){
			System.out.println(fizzBuzzer.fizzBuzz(i));
		}
	}
	
}
