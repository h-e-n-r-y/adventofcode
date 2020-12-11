package de.henry.adventofcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DayTenTest {

	static String INPUT = "28\n"
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

	static String INPUT2 = "16\n"
			+ "10\n"
			+ "15\n"
			+ "5\n"
			+ "1\n"
			+ "11\n"
			+ "7\n"
			+ "19\n"
			+ "6\n"
			+ "12\n"
			+ "4";

	@Test
	void testJoltDiffFactorAllAdapters() {
		assertEquals(220, DayTen.joltDiffFactorAllAdapters(DayTen.load(INPUT)));
	}

	/**
	 * 1 4 5 6 7 10 11 12 15 16 19
	 * 
	 *  3 1 1 1 3  1  1  3  1  3
	 */
	@Test
	void testJoltDiffAdapterCombinations() {
		assertEquals(8L, DayTen.joltDiffAdaptersCombinations(DayTen.load(INPUT2)));
	}

	static String INPUT3 = "1\n"
			+ "4\n"
			+ "5\n";

	/**
	 * 1 4 5
	 * 
	 * (0) 1 4 5 (8)
	 * 
	 *  1 3 1 
	 */
	@Test
	void testJoltDiffAdapterCombinations2() {
		assertEquals(1L, DayTen.joltDiffAdaptersCombinations(DayTen.load(INPUT3)));
	}

	static String INPUT4 = "1\n"
			+ "4\n"
			+ "5\n"
			+ "6\n";
	/**
	 * 1 4 5 6
	 * 
	 * (0) 1 4 5 6 (9)
	 * (0) 1 4 6 (9)
	 * 
	 *  1 3 1 1
	 */
	@Test
	void testJoltDiffAdapterCombinations3() {
		assertEquals(2L, DayTen.joltDiffAdaptersCombinations(DayTen.load(INPUT4)));
	}


}
