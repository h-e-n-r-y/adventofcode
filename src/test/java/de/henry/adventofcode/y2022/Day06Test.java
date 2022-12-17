package de.henry.adventofcode.y2022;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day06Test {
    @Test
    public void test() {
        assertEquals(5, Day06.countCharsTillMarker("bvwbjplbgvbhsrlpgdmjqwftvncz", 4), "wrong count");
        assertEquals(6, Day06.countCharsTillMarker("nppdvjthqldpwncqszvftbrmjlhg", 4), "wrong count");
        assertEquals(10, Day06.countCharsTillMarker("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg", 4), "wrong count");
        assertEquals(11, Day06.countCharsTillMarker("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw", 4), "wrong count");

        assertEquals(19, Day06.countCharsTillMarker("mjqjpqmgbljsphdztnvjfqwrcgsmlb", 14), "wrong count");
        assertEquals(23, Day06.countCharsTillMarker("bvwbjplbgvbhsrlpgdmjqwftvncz", 14), "wrong count");
        assertEquals(23, Day06.countCharsTillMarker("nppdvjthqldpwncqszvftbrmjlhg", 14), "wrong count");
        assertEquals(29, Day06.countCharsTillMarker("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg", 14), "wrong count");
        assertEquals(26, Day06.countCharsTillMarker("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw", 14), "wrong count");


    }
}