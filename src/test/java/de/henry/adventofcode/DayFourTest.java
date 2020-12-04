package de.henry.adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DayFourTest {

	@Test
	void testTestPassport() {
		assertTrue(DayFour.testPassport("iyr:1933 ecl:#232e20 pid:#d03ca7\n"
				+ "eyr:2030 hcl:598ed6 hgt:154in byr:2011"));
	}

}
