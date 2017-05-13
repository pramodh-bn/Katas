package org.pranna.katas.diamond;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiamondTester {
	Diamond diamond = new Diamond();
	String expected;
	String actual;

	@Test
	public void getDiamondObject() {
		assertEquals(Diamond.class.getName(), diamond.getClass().getName());
	}
	
	@Test
	public void whenPassedNullShouldReturnNothing(){
		expected = "";
		actual = diamond.getDiamond(null);
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPassedAShouldReturn2As(){
		expected = "A\nA\n";
		actual = diamond.getDiamond('A');
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPassedBShouldReturn2As2Bs(){
		expected = " A \n"
				 + "B B\n"
				 + " A \n";
		actual = diamond.getDiamond('B');
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPassedCShouldReturnABBCCBBA(){
		expected = "  A  \n"
				 + " B B \n"
				 + "C   C\n"
				 + " B B \n"
				 + "  A  \n";
		actual = diamond.getDiamond('C');
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPassedDShouldReturnABBCCDDCCBBA(){
		expected = "   A   \n"
				 + "  B B  \n"
				 + " C   C \n"
				 + "D     D\n"
				 + " C   C \n"
				 + "  B B  \n"
				 + "   A   \n";
		actual = diamond.getDiamond('D');
		assertEquals(expected, actual);
	}

	@Test
	public void whenPassedFShouldReturnABBCCDEFFEDCCBBA(){
		expected = "     A     \n"
				 + "    B B    \n"
				 + "   C   C   \n"
				 + "  D     D  \n"
				 + " E       E \n"
				 + "F         F\n"
				 + " E       E \n"
				 + "  D     D  \n"
				 + "   C   C   \n"
				 + "    B B    \n"
				 + "     A     \n";
		actual = diamond.getDiamond('F');
		assertEquals(expected, actual);
	}

	@Test
	public void whenPassedAShouldReturnIndex0(){
		expected = "0";
		actual = String.valueOf(diamond.getAlphabetIndex('A'));
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPassedBShouldReturnIndex1(){
		expected = "1";
		actual = String.valueOf(diamond.getAlphabetIndex('B'));
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPassedZShouldReturnIndex25(){
		expected = "25";
		actual = String.valueOf(diamond.getAlphabetIndex('Z'));
		assertEquals(expected, actual);
	}
	
	@Test
	public void whenPassed0ShouldReturnA(){
		expected = "A";
		actual = String.valueOf(diamond.getAlphabetGivenIndex(0));
		assertEquals(expected, actual);
	}

	@Test
	public void whenPassed1ShouldReturnB(){
		expected = "B";
		actual = String.valueOf(diamond.getAlphabetGivenIndex(1));
		assertEquals(expected, actual);
	}
	
	@Test 
	public void whenPassed25ShouldReturnZ(){
		expected = "Z";
		actual = String.valueOf(diamond.getAlphabetGivenIndex(25));
		assertEquals(expected, actual);
	}
	
	@Test
	public void givenAlphabetAAndLastAlphabetBShouldReturnAwithSpaceAround(){
		expected = " A ";
		actual = diamond.getSpacesAttached('A', 'B');
		assertEquals(expected, actual);
	}

	@Test
	public void givenAlphabetBAndLastAlphabetBShouldReturnBwithSpaceInBetween(){
		expected = "B B";
		actual = diamond.getSpacesAttached('B', 'B');
		assertEquals(expected, actual);
	}

	@Test
	public void givenAlphabetAAndLastAlphabetCShouldReturnAinMiddleWithSpaceAround(){
		expected = "  A  ";
		actual = diamond.getSpacesAttached('A', 'C');
		assertEquals(expected, actual);
	}

	@Test
	public void givenAlphabetBAndLastAlphabetCShouldReturnBwithSpaceANDSpaceAround(){
		expected = " B B ";
		actual = diamond.getSpacesAttached('B', 'C');
		assertEquals(expected, actual);
	}
}
