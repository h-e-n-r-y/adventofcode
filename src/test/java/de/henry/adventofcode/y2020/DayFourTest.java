package de.henry.adventofcode.y2020;

import static org.junit.jupiter.api.Assertions.*;

import de.henry.adventofcode.y2020.DayFour;
import org.junit.jupiter.api.Test;

class DayFourTest {

	@Test
	void testTestPassport() {
		assertFalse(DayFour.testPassport("pid:087499704 hgt:58in ecl:grn iyr:2012 eyr:2030 byr:1980\n"
				+ "hcl:#623a2f"));

		assertFalse(DayFour.testPassport("eyr:1972 cid:100\n"
				+ "hcl:#18171d ecl:amb hgt:170 pid:186cm iyr:2018 byr:1926"));
		assertFalse(DayFour.testPassport("iyr:2019\n"
				+ "hcl:#602927 eyr:1967 hgt:170cm\n"
				+ "ecl:grn pid:012533040 byr:1946"));
		assertFalse(DayFour.testPassport("hcl:dab227 iyr:2012\n"
				+ "ecl:brn hgt:182cm pid:021572410 eyr:2020 byr:1992 cid:277"));
		assertFalse(DayFour.testPassport("hgt:59cm ecl:zzz\n"
				+ "eyr:2038 hcl:74454a iyr:2023\n"
				+ "pid:3556412378 byr:2007"));

		assertTrue(DayFour.testPassport("pid:087499704 hgt:74in ecl:grn iyr:2012 eyr:2030 byr:1980\n"
				+ "hcl:#623a2f"));
		assertTrue(DayFour.testPassport("eyr:2029 ecl:blu cid:129 byr:1989\n"
				+ "iyr:2014 pid:896056539 hcl:#a97842 hgt:165cm"));
		assertTrue(DayFour.testPassport("hcl:#888785\n"
				+ "hgt:164cm byr:2001 iyr:2015 cid:88\n"
				+ "pid:545766238 ecl:hzl\n"
				+ "eyr:2022"));
		assertTrue(DayFour.testPassport("iyr:2010 hgt:158cm hcl:#b6652a ecl:blu byr:1944 eyr:2021 pid:093154719"));
		
	}

}
