package de.henry.adventofcode.y2022;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day02Test {
    @Test
    public void test() {
        assertEquals(15, Day02.calulateScore("A Y\n" +
                "B X\n" +
                "C Z", false),
                "wrong score");
        assertEquals(12, Day02.calulateScore("A Y\n" +
                        "B X\n" +
                        "C Z", true),
                "wrong score");
    }
}