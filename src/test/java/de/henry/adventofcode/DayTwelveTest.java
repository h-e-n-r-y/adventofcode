package de.henry.adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.henry.adventofcode.DayTwelve.Step;

class DayTwelveTest {

	@Test
	void test() {
		Step[] steps = DayTwelve.load("F10\n"
				+ "N3\n"
				+ "F7\n"
				+ "R90\n"
				+ "F11");
		DayTwelve.go(steps);
		assertEquals(17, DayTwelve.pose);
		assertEquals(8, -DayTwelve.posn);
		
	}

}
