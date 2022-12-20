package de.henry.adventofcode.y2022;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day08Test {

    String testInput =
            "30373\n" +
            "25512\n" +
            "65332\n" +
            "33549\n" +
            "35390";
    @Test
    public void test() {
        assertEquals(21, Day08.getVisibleTreeCount(testInput));

        assertEquals(8, Day08.getBestScore(testInput));

    }
}