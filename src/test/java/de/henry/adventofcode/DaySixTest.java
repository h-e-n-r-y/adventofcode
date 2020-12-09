package de.henry.adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DaySixTest {

	@Test
	void testCount() {
		assertEquals(3, DaySix.count("abc"));
		assertEquals(3, DaySix.count("a\nb\nc"));
		assertEquals(3, DaySix.count("ab\nac"));
		assertEquals(1, DaySix.count("a\na\na\na"));
		assertEquals(1, DaySix.count("b"));
	}

	@Test
	void testCount2() {
		assertEquals(3, DaySix.count2("abc"));
		assertEquals(0, DaySix.count2("a\nb\nc"));
		assertEquals(1, DaySix.count2("ab\nac"));
		assertEquals(1, DaySix.count2("a\na\na\na"));
		assertEquals(1, DaySix.count2("b"));
	}

}
