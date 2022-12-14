package de.henry.adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import de.henry.adventofcode.y2020.DayFive;
import org.junit.jupiter.api.Test;

class DayFiveTest {

	@Test
	void testPassId() {
		assertEquals(567, DayFive.passId("BFFFBBFRRR"));
		assertEquals(119, DayFive.passId("FFFBBBFRRR"));
		assertEquals(820, DayFive.passId("BBFFBBFRLL"));
	}

}
