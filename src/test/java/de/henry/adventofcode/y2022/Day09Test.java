package de.henry.adventofcode.y2022;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day09Test {

    String testInput =
            "R 4\n" +
            "U 4\n" +
            "L 3\n" +
            "D 1\n" +
            "R 4\n" +
            "D 1\n" +
            "L 5\n" +
            "R 2";
    @Test
    public void test() {
        assertEquals(13, Day09.process(testInput));
    }
}