package com.st.w2d1hw;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SortStringArray {
	
	public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("abacus");
        strings.add("pog");
        strings.add("bear");
        strings.add("zebra");
        strings.add("lemonade");
        strings.add("bananas");
        List<String> ordered, reverseOrdered, firstLetterOrdered, eFirstOrdered, eFirstOrdered2;
        ordered = sortStringsByLength(strings);
        reverseOrdered = reverseSortStringsByLength(strings);
        firstLetterOrdered = sortByFirstChar(strings);
        eFirstOrdered = sortStringsWithEFirst(strings);
        eFirstOrdered2 = sortStringsWithEFirst(strings);
        for (String s: eFirstOrdered2)
        	System.out.println(s);
	}
	
	public static List<String> sortStringsByLength(ArrayList<String> strings) {
		List<String> orderedByLength = strings.stream()
				                              .sorted( (s1,s2) -> s1.length() - s2.length())
				                              .collect(Collectors.toList());
		return orderedByLength;
	}
	
	public static List<String> reverseSortStringsByLength(ArrayList<String> strings) {
		List<String> reverseOrderedByLength = strings.stream()
				                              .sorted( (s1,s2) -> s2.length() - s1.length())
				                              .collect(Collectors.toList());
		return reverseOrderedByLength;
	}
	
	public static List<String> sortByFirstChar(ArrayList<String> strings) {
		List<String> orderedByFirstChar = strings.stream()
				                              .sorted( (s1,s2) -> s1.charAt(0) - s2.charAt(0) )
				                              .collect(Collectors.toList());
		return orderedByFirstChar;
	}
	
	public static List<String> sortStringsWithEFirst(ArrayList<String> strings) {
		List<String> stringsWithEFirst = strings.stream()
				                              .sorted( (s1,s2) -> { if (s1.contains("e"))
				                            		                   return -1;
				                                                     return 1;
				                                                  }
				                              )
				                              .collect(Collectors.toList());
		return stringsWithEFirst;
	}
	
	public static List<String> cleanerSortStringsWithEFirst(ArrayList<String> strings) {
		List<String> stringsWithEFirst = strings.stream()
				                              .sorted( (s1,s2) -> eIsInString(s1, s2))
				                              .collect(Collectors.toList());
		return stringsWithEFirst;
	}
	
	private static int eIsInString(String s1, String s2){
		if (s1.contains("e")) {
			return -1;
		}
		return 1;
	}
}
