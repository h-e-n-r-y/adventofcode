package de.henry.adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.henry.adventofcode.DayTwelve.Step;
import de.henry.adventofcode.DayTwelve.DIR;
import de.henry.adventofcode.DayTwelve.Pos;

class DayTwelveTest {

	@BeforeEach
	void setup() {
		DayTwelve.ship = new Pos();
		DayTwelve.dir = DIR.E;
	}
	
	@Test
	void test() {
		Step[] steps = DayTwelve.load("F10\n"
				+ "N3\n"
				+ "F7\n"
				+ "R90\n"
				+ "F11");
		DayTwelve.go(steps);
		assertEquals(17, DayTwelve.ship.pose);
		assertEquals(-8, DayTwelve.ship.posn);
	}

	@Test
	void testNew() {
		Step[] steps = DayTwelve.load("F10\n"
				+ "N3\n"
				+ "F7\n"
				+ "R90\n"
				+ "F11");
		DayTwelve.goNew(steps);
		assertEquals(214, DayTwelve.ship.pose);
		assertEquals(-72, DayTwelve.ship.posn);
	}

}
