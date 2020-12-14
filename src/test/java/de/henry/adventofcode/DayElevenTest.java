package de.henry.adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class DayElevenTest {

	String input1 = "L.LL.LL.LL\n"
			+ "LLLLLLL.LL\n"
			+ "L.L.L..L..\n"
			+ "LLLL.LL.LL\n"
			+ "L.LL.LL.LL\n"
			+ "L.LLLLL.LL\n"
			+ "..L.L.....\n"
			+ "LLLLLLLLLL\n"
			+ "L.LLLLLL.L\n"
			+ "L.LLLLL.LL";
	String[] i1 = input1.split("\n");

	Logger log = LoggerFactory.getLogger(DayElevenTest.class);
	
	@Test
	void testApplySeatingRules() {
		Boolean[][] map = DayEleven.load(input1);
		log.debug("\n{}\n\n", DayEleven.printMap(map));

		DayEleven.applySeatingRules(map);
		assertEquals("#.##.##.##\n"
				+ "#######.##\n"
				+ "#.#.#..#..\n"
				+ "####.##.##\n"
				+ "#.##.##.##\n"
				+ "#.#####.##\n"
				+ "..#.#.....\n"
				+ "##########\n"
				+ "#.######.#\n"
				+ "#.#####.##\n", DayEleven.printMap(map));

		DayEleven.applySeatingRules(map);
		assertEquals("#.LL.L#.##\n"
				+ "#LLLLLL.L#\n"
				+ "L.L.L..L..\n"
				+ "#LLL.LL.L#\n"
				+ "#.LL.LL.LL\n"
				+ "#.LLLL#.##\n"
				+ "..L.L.....\n"
				+ "#LLLLLLLL#\n"
				+ "#.LLLLLL.L\n"
				+ "#.#LLLL.##\n", DayEleven.printMap(map));
		
		assertEquals(20, DayEleven.countOccoupied(map));

	}

}
