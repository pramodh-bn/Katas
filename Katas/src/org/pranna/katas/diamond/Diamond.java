package org.pranna.katas.diamond;

public class Diamond {

	public String getDiamond(Character alphabet) {
		int index = -1;
		String result = "";
		if(alphabet == null)
			return result;
		else {
			index = getAlphabetIndex(alphabet);
			result += getSpacesAttachedWithLine('A', alphabet);
			for(int i = 1; i < index + 1; i++){
				result += getSpacesAttachedWithLine(getAlphabetGivenIndex(i), alphabet);
			}
			for(int i = index - 1; i > 0; i--){
				result += getSpacesAttachedWithLine(getAlphabetGivenIndex(i), alphabet);
			}
			result += getSpacesAttachedWithLine('A', alphabet);;
			return result;
		}
		
		
	}
	
	public int getAlphabetIndex(Character alphabet){
		return Character.getNumericValue(alphabet) - Character.getNumericValue('A');
	}
	
	public Character getAlphabetGivenIndex(int index){
		return Character.valueOf((char)((int)'A' + index));
	}

	public String getSpacesAttached(Character insertCharacter, Character lastCharacter) {
		int lastIndex = getAlphabetIndex(lastCharacter);
		int insertIndex = getAlphabetIndex(insertCharacter);
		char[] result = new char[lastIndex*2 + 1];
		for(int i = 0; i < result.length; i++){
				result[i] = ' ' ;
		}
		result[lastIndex-insertIndex] = insertCharacter;
		result[lastIndex+insertIndex] = insertCharacter;
		return String.valueOf(result);
	} 
	
	public String getSpacesAttachedWithLine(Character insertCharacter, Character lastCharacter) {
		return getSpacesAttached(insertCharacter, lastCharacter) + "\n";
	} 

}
