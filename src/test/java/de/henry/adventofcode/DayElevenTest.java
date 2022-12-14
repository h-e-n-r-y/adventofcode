package de.henry.adventofcode;

import static org.junit.jupiter.api.Assertions.*;

import de.henry.adventofcode.y2020.DayEleven;
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

	@Test
	void testApplySeatingRulesNew() {
		Boolean[][] map = DayEleven.load(input1);
		log.debug("\n{}\n\n", DayEleven.printMap(map));

		DayEleven.applySeatingRulesNew(map);
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

		DayEleven.applySeatingRulesNew(map);
		assertEquals("#.LL.LL.L#\n"
				+ "#LLLLLL.LL\n"
				+ "L.L.L..L..\n"
				+ "LLLL.LL.LL\n"
				+ "L.LL.LL.LL\n"
				+ "L.LLLLL.LL\n"
				+ "..L.L.....\n"
				+ "LLLLLLLLL#\n"
				+ "#.LLLLLL.L\n"
				+ "#.LLLLL.L#\n", DayEleven.printMap(map));
		
		DayEleven.applySeatingRulesNew(map);
		assertEquals("#.L#.##.L#\n"
				+ "#L#####.LL\n"
				+ "L.#.#..#..\n"
				+ "##L#.##.##\n"
				+ "#.##.#L.##\n"
				+ "#.#####.#L\n"
				+ "..#.#.....\n"
				+ "LLL####LL#\n"
				+ "#.L#####.L\n"
				+ "#.L####.L#\n", DayEleven.printMap(map));
		
		DayEleven.applySeatingRulesNew(map);
		assertEquals("#.L#.L#.L#\n"
				   + "#LLLLLL.LL\n"
				   + "L.L.L..#..\n"
				   + "##LL.LL.L#\n"
				   + "L.LL.LL.L#\n"
				   + "#.LLLLL.LL\n"
				   + "..L.L.....\n"
				   + "LLLLLLLLL#\n"
				   + "#.LLLLL#.L\n"
				   + "#.L#LL#.L#\n", DayEleven.printMap(map));
		
		DayEleven.applySeatingRulesNew(map);
		assertEquals("#.L#.L#.L#\n"
				+ "#LLLLLL.LL\n"
				+ "L.L.L..#..\n"
				+ "##L#.#L.L#\n"
				+ "L.L#.#L.L#\n"
				+ "#.L####.LL\n"
				+ "..#.#.....\n"
				+ "LLL###LLL#\n"
				+ "#.LLLLL#.L\n"
				+ "#.L#LL#.L#\n", DayEleven.printMap(map));
		
		assertEquals(31, DayEleven.countOccoupied(map));

	}

}
