package com.st.w2d1hw;

import java.time.Month;
import java.time.Year;

class MonthLengths{
	
	public static int getMonthLength(Year year, Month month) {
		switch (month) {
		case JANUARY:
			return 31;
		case FEBRUARY:
			return year.isLeap()? 28 : 29;
		case MARCH:
			return 31;
		case MAY:
			return 31;
		case JULY:
			return 31;
		case AUGUST:
			return 31;
		case OCTOBER:
			return 31;
		case DECEMBER:
			return 31;
		default:
			return 30;
		}
	}
}