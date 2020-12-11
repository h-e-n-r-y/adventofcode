package de.henry.adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class DayTenTest {

	static String INPUT ="28\n"
			+ "33\n"
			+ "18\n"
			+ "42\n"
			+ "31\n"
			+ "14\n"
			+ "46\n"
			+ "20\n"
			+ "48\n"
			+ "47\n"
			+ "24\n"
			+ "23\n"
			+ "49\n"
			+ "45\n"
			+ "19\n"
			+ "38\n"
			+ "39\n"
			+ "11\n"
			+ "1\n"
			+ "32\n"
			+ "25\n"
			+ "35\n"
			+ "8\n"
			+ "17\n"
			+ "7\n"
			+ "9\n"
			+ "4\n"
			+ "2\n"
			+ "34\n"
			+ "10\n"
			+ "3";
	static int[] numbers;
	static {
		String[] n = INPUT.split("\n");
		numbers = new int[n.length];
		int i=0;
		for (String s : n) {
			numbers[i++] = Integer.parseInt(s);
		}
		Arrays.sort(numbers);
	}
	
	@Test
	void testJoltDifFactor() {
		assertEquals(220, DayTen.joltDiffFactorAllAdapters(numbers));
	}

}
