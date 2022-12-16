package de.henry.adventofcode.y2022;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day04Test {
    @Test
    public void test() {
        int[] r = Day04.calcNrOfOverlappingPairs("2-4,6-8\n" +
                "2-3,4-5\n" +
                "5-7,7-9\n" +
                "2-8,3-7\n" +
                "6-6,4-6\n" +
                "2-6,4-8");
        assertEquals(2, r[0], "wrong #full overlaps");
        assertEquals(4, r[1], "wrong #partial overlaps");

    }
}