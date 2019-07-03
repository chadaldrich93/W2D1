package com.st.w2d1hw;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FilterStrings{
	
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("blue");
		strings.add("aardvark");
		strings.add("ape");
		strings.add("cheetah");
		strings.add("are");
		strings.add("abacus");
		strings.add("all");
		List<String> filtered = threeLettersStartsWithA(strings);
		for (String s: filtered) {
			System.out.println(s);
		}
	}
	
	public static List<String> threeLettersStartsWithA(ArrayList<String> strings){
		return strings.stream()
		       .filter( e -> e.length() == 3)
		       .filter( e -> e.charAt(0) == 'a')
		       .collect(Collectors.toList());
	}
	
}