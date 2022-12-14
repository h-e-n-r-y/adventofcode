package de.henry.adventofcode.y2020;

import static org.junit.jupiter.api.Assertions.*;

import de.henry.adventofcode.y2020.DayTwo;
import org.junit.jupiter.api.Test;

class DayTwoTest {

	@Test
	void testTestPolicy() {
		assertTrue(DayTwo.testPolicy("5-5 o", "000ooooo000"));
	}

	@Test
	void testTestNewPolicy() {
		assertFalse(DayTwo.testNewPolicy("5-7 o", "00000000000"));
		assertFalse(DayTwo.testNewPolicy("5-7 o", "0000o0o0000"));
		assertTrue(DayTwo.testNewPolicy("5-7 o", "0000o000000"));
		assertTrue(DayTwo.testNewPolicy("5-7 o", "000000o0000"));
	}

}
