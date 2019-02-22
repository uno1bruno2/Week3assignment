package main;

import java.util.ArrayList;
import java.util.List;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String str = "";
		for (int i = 0; i < input.length(); i++) {
			str = str + input.charAt(i) + input.charAt(i) + input.charAt(i);
		}
		return str;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		if (input.length() < 9) {
			return "";
		}
		input = input.toLowerCase();
		List<Integer> bertLocations = new ArrayList<Integer>();
		for (int i = 0; i < input.length() - 3; i++) {
			if (input.charAt(i) == 'b' && input.charAt(i+1) == 'e' && input.charAt(i+2) == 'r' && input.charAt(i+3) == 't') {
				bertLocations.add(i+4);
			}
		}
		
		String str = "";
		
		if (bertLocations.size() != 0 && bertLocations.size() != 1) {
			for (int i = 0; i < bertLocations.size()-1; i++) {
				for (int j = bertLocations.get(i+1)-5; j > bertLocations.get(i)-1; j--) {
					str = str + input.charAt(j);
				}
			}
		}
		return str;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int[] intArray = { a , b , c };
		int minimum = Math.min(a, b);
		minimum = Math.min(minimum, c);
		int medium = 0;
		int maximum = Math.max(a, b);
		maximum = Math.max(maximum, c);
		int i = 0;
		int j = 0;
		while(minimum - intArray[i] != 0) {
			i++;
		}
		while(maximum - intArray[j] != 0) {
			j++;
		}
		int k = i + j;
		if (k == 1) {
			medium = c;
		} else if (k == 2) {
			medium = b;
		} else if (k == 3) {
			medium = a;
		}
		
		if(maximum - medium == medium - minimum) {
			return true;
		} else {
			return false;
		}
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		if(input.length() <= a) {
			return "";
		} else {
			List<Character> newStr = new ArrayList<Character>();
			for (int i = 0; i < input.length(); i++) {
				newStr.add(input.charAt(i));
			}
			
			int inputMid = input.length()/2;
			int posAwayFromMid = (a-1)/2;
			for (int i = 0; i < a; i++) {
				newStr.remove(inputMid - posAwayFromMid);
			}
			
			String newInput = "";
			for (int i = 0; i < newStr.size(); i++) {
				newInput += newStr.get(i);
			}
			return newInput;
		}
		
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		if (input.length() < 3) {
			return false;
		}
		input = input.toLowerCase();
		int inputLength = input.length();
		if (input.charAt(inputLength-3) == 'd' && input.charAt(inputLength-2) == 'e' && input.charAt(inputLength-1) == 'v') {
			return true;
		} else {
			return false;
		}
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		if (input == "") {
			return 0;
		} else if (input.length() == 1) {
			return 1;
		} else {
			int maxBlock = input.length();
			for (int i = 0; i < input.length() - maxBlock + 1; i++) {
				int j = 0;
				
				while(true) {
					if (input.charAt(j) == input.charAt(j+1)) {
							
						} else {
							b
						}
					}
				}
			}
		}
		return 0;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		arg1 = arg1.toLowerCase();
		int count = 0;
		for (int i = 1; i < arg1.length() - 2; i++) {
			if (arg1.charAt(i-1) == ' ' && arg1.charAt(i) == 'a' && arg1.charAt(i+1) == 'm' && arg1.charAt(i+2) == ' ') {
				count++;
			}
		}
		if(arg1.charAt(arg1.length() - 3) == ' ' && arg1.charAt(arg1.length() - 2) == 'a' && arg1.charAt(arg1.length() - 1) == 'm') {
			count++;
		}
		if(arg1.charAt(0) == 'a' && arg1.charAt(1) == 'm' && arg1.charAt(2) == ' ') {
			count++;
		}
		return count;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		if (arg1 % 15 == 0) {
			return "fizzbuzz";
		} else if (arg1 % 3 == 0) {
			return "fizz";
		} else if (arg1 % 5 == 0) {
			return "buzz";
		} else {
			return null;
		}
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		List<Integer> nums = new ArrayList<Integer>();
		for (int i = 0; i < arg1.length(); i++) {
			switch(arg1.charAt(i)) {
			case '0':
				nums.add(0);
			case '1':
				nums.add(1);
			case '2':
				nums.add(2);
			case '3':
				nums.add(3);
			case '4':
				nums.add(4);
			case '5':
				nums.add(5);
			case '6':
				nums.add(6);
			case '7':
				nums.add(7);
			case '8':
				nums.add(8);
			case '9':
				nums.add(9);
			default:
				nums.add(-1);
			}
		}
		List<Integer> spacePositions = new ArrayList<Integer>();
		spacePositions.add(-1);
		for (int i = 0; i < arg1.length(); i++) {
			if (nums.get(i) == -1) {
				spacePositions.add(i);
			}
		}
		spacePositions.add(arg1.length());
		
		List<Integer> actualNums = new ArrayList<Integer>();
		for (int i = 1; i < spacePositions.size(); i++) {
			int k = 0;
			int number = 0;
			for (int j = arg1.charAt(spacePositions.get(i))-1; j > arg1.charAt(spacePositions.get(i-1)); i--) {
				if (k == 0) {
					number += arg1.charAt(j);
					k++;
				} else if (k == 1) {
					number += arg1.charAt(j)*10;
					k++;
				} else {
					number += arg1.charAt(j) * Math.pow(10, k);
					k++;
				}
				
			}
			System.out.println(number);
			actualNums.add(number);
		}
		
		
		return 0;
		
	}
	
	
}
