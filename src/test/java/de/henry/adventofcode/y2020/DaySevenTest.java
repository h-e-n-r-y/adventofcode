package de.henry.adventofcode.y2020;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import de.henry.adventofcode.y2020.DaySeven;
import org.junit.jupiter.api.Test;

class DaySevenTest {

	@Test
	void testFindContained() {
		DaySeven.cb = new HashMap<>();
		rule("shiny gold", "dark red", 2);
		rule("dark red", "dark orange", 2);
		rule("dark orange", "dark yellow", 2);
		rule("dark yellow", "dark green", 2);
		rule("dark green", "dark blue", 2);
		rule("dark blue", "dark violet", 2);
		
		Map<String, Integer> bags = DaySeven.findContainedBags("shiny gold", 1);
		assertEquals(126, DaySeven.calcCount(bags));
	}

	@Test
	void testFindContained2() {
		
		final String INPUT = "shiny gold bags contain 2 dark red bags.\n"
				+ "dark red bags contain 2 dark orange bags.\n"
				+ "dark orange bags contain 2 dark yellow bags.\n"
				+ "dark yellow bags contain 2 dark green bags.\n"
				+ "dark green bags contain 2 dark blue bags.\n"
				+ "dark blue bags contain 2 dark violet bags.\n"
				+ "dark violet bags contain no other bags.";
		final String[] RULES = INPUT.split("\n");

		DaySeven.cb = DaySeven.buildBagsMap(RULES);
		
		Map<String, Integer> bags = DaySeven.findContainedBags("shiny gold", 1);
		assertEquals(126, DaySeven.calcCount(bags));
	}

	private void rule(String container, String bag, int count) {
		Set<DaySeven.Entry> s1 = new HashSet<>();
		s1.add(new DaySeven.Entry(count, bag));
		DaySeven.cb.put(container, s1);
	}

}
