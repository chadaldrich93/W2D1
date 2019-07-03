package com.st.w2d1hw;

import java.util.ArrayList;
import java.util.stream.Collectors;

class ConvertIntegerList{
	
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(4);
		intList.add(7);
		intList.add(2);
		intList.add(3);
		intList.add(9);
		String converted = convertArrayListToString(intList);
		System.out.println(converted);
	}
	
	public static String convertArrayListToString(ArrayList<Integer> list) {
		return list.stream()
				   .map(e -> e.toString())
				   .map( e -> prependEToEven(e))
				   .map(e -> prependOToOdd(e))
				   .collect(Collectors.joining(","));
	}
	
	public static String prependEToEven(String source) {
		if (source.length() != 1) {
			return source;
		}
		if (Integer.parseInt(source) % 2 == 0) {
			return "e" + source;
		}
		return source;
	}
	
	public static String prependOToOdd(String source) {
		if (source.length() != 1) {
			return source;
		}
		if (Integer.parseInt(source) % 2 != 0) {
			return "o" + source;
		}
		return source;
	}
	
}