package de.henry.adventofcode.y2020;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * Solves the "Lost-Boardingpass"-Riddle of December 5th 2020.
 * https://adventofcode.com/2020
 * 
 * @author henry
 *
 */
public class DayFive {
	
	private static final String INPUT = "FFBFFFBLLL\n"
			+ "BFBFBBFRLR\n"
			+ "FFFBFFBLLL\n"
			+ "FFBFBBBRRL\n"
			+ "BFFFBBFLRR\n"
			+ "BFBFBFBLLL\n"
			+ "BFFFBFFLLL\n"
			+ "FFFFFBFLLR\n"
			+ "FBFBFFBRLL\n"
			+ "BBFFBFBLRL\n"
			+ "FFFBBBBLRL\n"
			+ "BFFFFFFRLL\n"
			+ "FBBBBFFRLL\n"
			+ "FBFBFBFLLL\n"
			+ "BBFFBFFLRR\n"
			+ "BFBBFFBLRL\n"
			+ "FBFFFBBLLR\n"
			+ "BFFFFFBLRL\n"
			+ "BBFBFBBLLL\n"
			+ "FFFBBBBLRR\n"
			+ "FBFFBFFLRR\n"
			+ "BFFBFBFLRL\n"
			+ "BFBBFFFLRR\n"
			+ "FBFFBBBRLR\n"
			+ "FBFFBBBRRR\n"
			+ "BBFBFBFLRR\n"
			+ "BFFBBFFLLL\n"
			+ "BFFBBFBRRL\n"
			+ "FFFBFFBLRR\n"
			+ "FBBBBBBLLL\n"
			+ "FFBFFFFRRL\n"
			+ "BBFBFBBRLR\n"
			+ "BFFBFFFLRR\n"
			+ "BBFFFFBLRL\n"
			+ "BBFFBFBLLL\n"
			+ "BBFFFFFRLR\n"
			+ "BFBFBBFLRL\n"
			+ "FFFBFFBRLR\n"
			+ "FFFFBFFLLL\n"
			+ "FFBBFBFRLL\n"
			+ "BFFBBFBRLL\n"
			+ "BFFFBFFRLL\n"
			+ "BFFFBBFRLR\n"
			+ "BFFFFFBRRR\n"
			+ "BFBBBFFRRL\n"
			+ "FFBFBFFRRL\n"
			+ "FBBFBBBRRR\n"
			+ "FFFBBBBRLR\n"
			+ "FBFBFBFRLR\n"
			+ "FFBFFFFLLL\n"
			+ "FBBFFFBLRR\n"
			+ "BFBFFBBLLR\n"
			+ "FBFFBBBRLL\n"
			+ "FBFFBBFRRL\n"
			+ "FBBBFFBLRL\n"
			+ "BBFBFBFLLL\n"
			+ "BFFBFBBLLL\n"
			+ "BBFFBFBRRR\n"
			+ "FFBBFFFLRL\n"
			+ "BFFBBBBLRL\n"
			+ "FFFBBFFLRL\n"
			+ "FFBBBBBLRR\n"
			+ "FBFFFBBRLR\n"
			+ "BBFBFFFRLL\n"
			+ "FFBFFBFLRL\n"
			+ "FFBFBFFLLR\n"
			+ "FBBBBFBRRR\n"
			+ "FBFBFBFRRR\n"
			+ "FBBFBBBLRL\n"
			+ "BBFFFBBLRL\n"
			+ "BFFBFBBLLR\n"
			+ "FBFBBFFLRR\n"
			+ "FFBBFFFRLR\n"
			+ "FFFFBBFLLR\n"
			+ "FBFFBFBRRR\n"
			+ "FFFBFFFRLR\n"
			+ "FBFFBFBLRL\n"
			+ "FBBFFFFRRR\n"
			+ "BFFFBFBLLR\n"
			+ "FFFBBFFRLL\n"
			+ "FFBFBFBLLL\n"
			+ "FFBFBBFRLL\n"
			+ "BFFBBBBRRR\n"
			+ "BFFBFFFLRL\n"
			+ "FFFFFFBRRL\n"
			+ "FFBBFBBRRR\n"
			+ "FFBFBFFRLR\n"
			+ "FBBFFBBLRR\n"
			+ "BFFBFFBRLR\n"
			+ "BBFBFFFLRL\n"
			+ "BFBFBFFLRR\n"
			+ "BFFBBFFRLL\n"
			+ "FFBFBBFLLR\n"
			+ "BBFBFFFLRR\n"
			+ "FFFFBBBLRL\n"
			+ "FFFBFBFRLR\n"
			+ "BFBFFFBLRL\n"
			+ "BFFFBBFLRL\n"
			+ "FFFFBFFRRL\n"
			+ "BFBBBFBRLL\n"
			+ "BFBBBFFRRR\n"
			+ "BFFFBFBLRL\n"
			+ "BFFBFFBRRL\n"
			+ "FBBBFBFLLL\n"
			+ "FBBFBBBRLR\n"
			+ "FFBBBFBRLR\n"
			+ "FFFBBFBLLL\n"
			+ "BFFFFFBRLL\n"
			+ "FBFBFFBLRR\n"
			+ "FBFFFBFLLR\n"
			+ "FBBFFBFRRL\n"
			+ "BFFFFFFRLR\n"
			+ "FFBFBBBRLL\n"
			+ "BFFFFFBLLR\n"
			+ "FFFBFBBLRL\n"
			+ "FBBBFFBLRR\n"
			+ "FBBFFBFRLR\n"
			+ "FBBFBBFRRR\n"
			+ "FFBFFBFLLL\n"
			+ "BFBBBFBLRL\n"
			+ "FBFBBBBRRR\n"
			+ "FBBBFBFRRL\n"
			+ "FBBFBBBRRL\n"
			+ "BBFBFFFRLR\n"
			+ "BFBFBBBRLL\n"
			+ "FFBBFFFLLR\n"
			+ "FBFFFFFRRR\n"
			+ "BFBBFFBRRR\n"
			+ "FBBBBFBLRL\n"
			+ "BFBBBFBLLR\n"
			+ "FBFBFBFLRR\n"
			+ "FBBBFBBLLR\n"
			+ "BFFFBFFRRR\n"
			+ "BBFBFBFRLR\n"
			+ "BBFFBFBRRL\n"
			+ "FFBBBFFRRL\n"
			+ "FBFFBFBLRR\n"
			+ "BBFFBBBRLL\n"
			+ "FBFFBFFLLR\n"
			+ "FFFBFBFLLL\n"
			+ "FFBBBFBLLL\n"
			+ "BFBFFBFRRR\n"
			+ "FBFBBFBLLR\n"
			+ "BBFFFFFLLR\n"
			+ "BBFBBFFRLL\n"
			+ "FFFFBFBLLR\n"
			+ "BBFFBBBLRL\n"
			+ "FBBFFFBRLR\n"
			+ "BFFFFBFLRL\n"
			+ "FFBBFFBRRR\n"
			+ "BBFFFBFLLR\n"
			+ "BBFFFBBRRR\n"
			+ "FBBFFBFRLL\n"
			+ "BFFBFFBLRR\n"
			+ "FFFBBFBRLL\n"
			+ "FBBFFBBRLL\n"
			+ "BFFFBFBRRR\n"
			+ "FBFBFFFLRL\n"
			+ "BFBBFBBRRR\n"
			+ "FBBBFFBLLL\n"
			+ "FBBFFBFRRR\n"
			+ "FBFBFFFRRR\n"
			+ "FBFFFFFRLR\n"
			+ "FBBBFBBLLL\n"
			+ "FFFFBFFLRR\n"
			+ "BBFFFFBLLR\n"
			+ "FFBFBBFLRL\n"
			+ "FBFFFFFLRR\n"
			+ "BFFBBFBLLL\n"
			+ "FFBBFFFLRR\n"
			+ "BFFFFFFLRL\n"
			+ "BFBFBBBLRL\n"
			+ "BBFBFFBRLL\n"
			+ "FFBFBFBRLL\n"
			+ "FFFFBBBLLL\n"
			+ "FFBBBFFLRR\n"
			+ "BFFBBBBLLR\n"
			+ "FFFBFFBLRL\n"
			+ "FBBBFBFRLR\n"
			+ "FFBBFBFLLL\n"
			+ "BBFFFBBLRR\n"
			+ "BFBBFFFRRL\n"
			+ "FFBBFFFRRL\n"
			+ "BFBBFFFLRL\n"
			+ "FBBFFFFLLL\n"
			+ "BBFFFFBRRL\n"
			+ "FFBFBFFLRL\n"
			+ "FFBBFFBLLR\n"
			+ "BFFFFBFRLR\n"
			+ "BBFFBBBRLR\n"
			+ "FBFBBBFRRR\n"
			+ "FBFBFFFRRL\n"
			+ "BBFBBFFRLR\n"
			+ "FBFBBBFLLR\n"
			+ "BFBFBBBRLR\n"
			+ "BFBBBBFLRR\n"
			+ "BFBBBBBLRL\n"
			+ "FBFFFFFRLL\n"
			+ "BFBBFBBLLR\n"
			+ "BFFBFFBLRL\n"
			+ "FBBFBBFRLR\n"
			+ "FBBBFFBRRL\n"
			+ "BFFFFFBLRR\n"
			+ "BBFFFBFRRR\n"
			+ "BFBFFFFLRR\n"
			+ "BFBFBFFRRL\n"
			+ "BFBBBFBRRL\n"
			+ "FFFFFBFLLL\n"
			+ "FBBFFBFLLR\n"
			+ "FFBFBFBLLR\n"
			+ "FBFFBBFLLL\n"
			+ "BFFBFFFLLL\n"
			+ "FFBFBFBRRR\n"
			+ "FBBFBFBLRL\n"
			+ "FBFFFFFRRL\n"
			+ "FFFBBFBRLR\n"
			+ "BBFBFFBLLL\n"
			+ "FFBFFFBLRL\n"
			+ "FFBBBBFLRL\n"
			+ "FFBFFBFRRL\n"
			+ "FBFFFFBLRR\n"
			+ "FBBBBBBRRR\n"
			+ "FFFFFBBLLL\n"
			+ "FBFBFBBLRR\n"
			+ "FBFFBBBRRL\n"
			+ "FFBFBBBLRR\n"
			+ "BFBFFBBRRL\n"
			+ "BFBFFFBRLL\n"
			+ "FFBBBFFRRR\n"
			+ "BFFFFBBRRR\n"
			+ "FFFBBBBLLR\n"
			+ "BFBFBFBRRR\n"
			+ "FFFBBFFLRR\n"
			+ "FFFBFBFRRR\n"
			+ "FBBBBFFLLL\n"
			+ "BBFBFBBLRR\n"
			+ "BBFBFBFRRL\n"
			+ "BBFFFBBRLL\n"
			+ "FBBBBFBLRR\n"
			+ "FBBFBBBLLL\n"
			+ "FFBBBFBLRL\n"
			+ "FBBFBFFRRL\n"
			+ "FBFFFFBRRL\n"
			+ "BFFFFFFLRR\n"
			+ "BBFFFBFLLL\n"
			+ "FFFFBBFRLR\n"
			+ "FBFFBFFLLL\n"
			+ "FFBFBFBLRR\n"
			+ "FFBBBFBLRR\n"
			+ "FFFFBFBLRR\n"
			+ "BBFBFFBLRR\n"
			+ "BBFFFFFRRR\n"
			+ "FBBBFFBRLL\n"
			+ "FBBFBBFRRL\n"
			+ "FFBFBBBRRR\n"
			+ "BFFBFBBRLR\n"
			+ "FFFBFFFRRL\n"
			+ "BFBFFFFRLR\n"
			+ "FFBFFFFRLL\n"
			+ "FBFBBFFRLL\n"
			+ "FBFBBBBLLL\n"
			+ "BBFFBBFRRL\n"
			+ "FFFFFBBLRR\n"
			+ "FFBBFBBLLL\n"
			+ "FFFBBBBRLL\n"
			+ "FFFBFBBRLL\n"
			+ "BFBFFBFRLR\n"
			+ "FBBBFBBRLR\n"
			+ "FFFBFBFLRR\n"
			+ "BFFFBBBRLR\n"
			+ "FFBBFBBLRR\n"
			+ "FFBFBBFRLR\n"
			+ "FFFFFBFRLL\n"
			+ "FBBFBFFLLR\n"
			+ "FFFFBFBRLL\n"
			+ "BFFBBFFLLR\n"
			+ "BFBBBBBLRR\n"
			+ "FBFBBFBRRL\n"
			+ "FBFBBFFRRL\n"
			+ "BBFFBBBLLL\n"
			+ "BFFBBBBRRL\n"
			+ "FBBBFBBRRL\n"
			+ "BBFBBFFRRL\n"
			+ "FBBFBFBRRL\n"
			+ "FBFFBFFRRR\n"
			+ "FFFFBBBRRL\n"
			+ "FFFBBBBRRL\n"
			+ "BFBBFFFRRR\n"
			+ "FBBBFBBRLL\n"
			+ "FFBFFBFRRR\n"
			+ "FFFFBFBLLL\n"
			+ "FFBFFBBLLR\n"
			+ "FBBBFBFLRL\n"
			+ "FFFFBBFRLL\n"
			+ "BFFFFBFLLL\n"
			+ "FFBBFBFLRL\n"
			+ "FBFBFBBRLL\n"
			+ "FFBBBFFLLR\n"
			+ "FFFBFFBRRR\n"
			+ "FBFFBBBLLR\n"
			+ "FFFBBFBLLR\n"
			+ "BFBBBFFLLL\n"
			+ "FFFFBFBRRL\n"
			+ "BFFFBBBLRR\n"
			+ "FFFBBBBRRR\n"
			+ "BBFBFBBLRL\n"
			+ "FBFFBFFRLL\n"
			+ "FBFBBBBRRL\n"
			+ "FBBBBBBRLR\n"
			+ "FFFBFBFLLR\n"
			+ "FFFFBBFRRR\n"
			+ "BFBFBFBRRL\n"
			+ "FFFBFFBRLL\n"
			+ "FFBBBBFRRR\n"
			+ "BFFBBBFRRL\n"
			+ "FBBFFBBRRR\n"
			+ "FBFFBBFLRR\n"
			+ "FBFFFFBLRL\n"
			+ "FBBBFBBLRR\n"
			+ "BBFBFBBRRL\n"
			+ "FBBBFFBLLR\n"
			+ "FBFBBBFRRL\n"
			+ "BFFFBFBRLL\n"
			+ "BFFBBFFRRL\n"
			+ "FFBBBBFLRR\n"
			+ "FFBBFBBLRL\n"
			+ "FFBFFFFLRR\n"
			+ "FBBFBFFRLL\n"
			+ "FFBBBBFLLL\n"
			+ "FFBFFFBRRL\n"
			+ "BFFBFFFLLR\n"
			+ "BBFFFBBRLR\n"
			+ "FFBFBFFRLL\n"
			+ "FBFBFBBRRL\n"
			+ "FBBBFBBLRL\n"
			+ "FBFBFFBRLR\n"
			+ "FBFFBBFRRR\n"
			+ "FBFBFBBLLR\n"
			+ "FBBBBBFLRL\n"
			+ "FBFBBFFRRR\n"
			+ "FBFFBBBLRR\n"
			+ "BFFBBFFLRL\n"
			+ "FBFBFFBRRR\n"
			+ "FFFFBFBRRR\n"
			+ "BFBFBFBLLR\n"
			+ "BFFFFFBRLR\n"
			+ "BFBBBBBLLL\n"
			+ "FFBBFBFLRR\n"
			+ "BFBBBFFLRR\n"
			+ "FFBBBFFLLL\n"
			+ "FBBFFFFLRL\n"
			+ "BFBFBFFRLR\n"
			+ "FFFBFBBRRL\n"
			+ "FBFFBBBLRL\n"
			+ "FBFBFBBRRR\n"
			+ "FBFFFBFLLL\n"
			+ "BFFBFFFRRL\n"
			+ "BFFBBBBRLR\n"
			+ "FFFFFBFRRR\n"
			+ "FBBBFFFLRL\n"
			+ "BFFFBFBRRL\n"
			+ "FFFBBBFLLL\n"
			+ "FFBFFFBLRR\n"
			+ "FBFBBFFLLL\n"
			+ "FBBBBFBRLR\n"
			+ "FFFBFFBLLR\n"
			+ "FFBFFBBRLR\n"
			+ "BFFFBBFRRR\n"
			+ "BBFFFFFLRL\n"
			+ "FBFFFFBRLR\n"
			+ "BFBFBBBLLL\n"
			+ "FBFBFBFLLR\n"
			+ "BFFFFFBLLL\n"
			+ "BFFBFBFRLL\n"
			+ "BFFBFBBRRR\n"
			+ "BFBBFBBRRL\n"
			+ "BBFBBFBRRL\n"
			+ "BFBBFFBRLL\n"
			+ "BBFBFBBRLL\n"
			+ "FFBFFFFLRL\n"
			+ "FFBBFBFRLR\n"
			+ "FBBFFFFRRL\n"
			+ "BFFFFFFRRR\n"
			+ "FBBFFBFLLL\n"
			+ "BFFBBFBLRR\n"
			+ "FBFBFFBLRL\n"
			+ "BFBFFFBRLR\n"
			+ "BFBFFBFLLL\n"
			+ "FFBBBFBRRL\n"
			+ "BFFFBFFLLR\n"
			+ "FBFBFBBLLL\n"
			+ "BBFFFBBLLR\n"
			+ "BFBFFBFLRR\n"
			+ "FBFFFBBLRL\n"
			+ "FBFBBBFRLR\n"
			+ "BFFFBFFRLR\n"
			+ "BBFFBBFRLR\n"
			+ "FBBFBBFLLR\n"
			+ "BFFFBBFLLR\n"
			+ "FFBFFFBLLR\n"
			+ "FBBBBBFRRR\n"
			+ "FFFBFFFLLL\n"
			+ "BFBFFFBRRL\n"
			+ "BFBBBBFRLL\n"
			+ "FFBFBBBLLR\n"
			+ "BFBBFBFLLR\n"
			+ "FBFFBBFLRL\n"
			+ "FFFBFFFLLR\n"
			+ "BFBFBFBLRL\n"
			+ "BBFFBBBRRR\n"
			+ "FBFBBFBRLL\n"
			+ "FFFFBFFRLR\n"
			+ "FBFFBBFRLL\n"
			+ "FBFFFBFLRR\n"
			+ "FBBFFFBLRL\n"
			+ "FBBBBBFLLR\n"
			+ "FFFBFBBLLR\n"
			+ "BBFFFFBRRR\n"
			+ "BFBFFBBRRR\n"
			+ "BFFBFBBRRL\n"
			+ "BBFFBBFRLL\n"
			+ "BFFFFBFRRL\n"
			+ "BFFFBBBRRL\n"
			+ "FFBBFFFLLL\n"
			+ "FFFFBBBLLR\n"
			+ "BBFFBBFLLR\n"
			+ "FFFBFBBRRR\n"
			+ "BBFFFBFRRL\n"
			+ "FFBBBBFRLR\n"
			+ "FBBFFFBRRR\n"
			+ "BFFFBFBLLL\n"
			+ "FFBFBFBLRL\n"
			+ "FBFFFFBLLR\n"
			+ "BBFBFFBRRL\n"
			+ "BFBBBFFRLL\n"
			+ "FBFBFFFLRR\n"
			+ "FBFBFFFLLR\n"
			+ "BFBFBBBRRL\n"
			+ "FBFFFFFLLR\n"
			+ "BFBFFFFLRL\n"
			+ "FBBFBBBRLL\n"
			+ "BFBFBFFLLL\n"
			+ "BFBBFBBLRL\n"
			+ "FBFFFBBLLL\n"
			+ "BFFFFFFLLL\n"
			+ "BBFBFFBLLR\n"
			+ "FFBFBBBLLL\n"
			+ "FBBBBBBRLL\n"
			+ "BFFFBBBLLR\n"
			+ "FBFBBBBLRR\n"
			+ "FBBFFFBLLL\n"
			+ "FFFBFBFRRL\n"
			+ "FFFFBBFRRL\n"
			+ "FBFFFBFRRL\n"
			+ "BBFFFBFRLR\n"
			+ "FFFBBFFLLL\n"
			+ "FFFFBFFLRL\n"
			+ "FBFBBBBLLR\n"
			+ "FBBBFFFRRR\n"
			+ "FFFBBBFLRR\n"
			+ "BFBFBBFRRR\n"
			+ "BBFBFFBRLR\n"
			+ "BBFBBFBRLL\n"
			+ "BFFBBFBLRL\n"
			+ "FBFBFBFRRL\n"
			+ "BFFFFFFRRL\n"
			+ "BBFFFFBRLL\n"
			+ "BFFBBFBLLR\n"
			+ "BFFBFBFLRR\n"
			+ "FBFBFBBRLR\n"
			+ "BFBFFBBLRL\n"
			+ "FFFBBBFLRL\n"
			+ "FBBBFFFLRR\n"
			+ "BBFFFFFRRL\n"
			+ "FFFBFBBLRR\n"
			+ "FFBFFBBRLL\n"
			+ "FFBBBBBLLR\n"
			+ "BFBBFBBLLL\n"
			+ "BBFBFFBRRR\n"
			+ "FBFFFFBRRR\n"
			+ "FFBBBBBRRR\n"
			+ "FBFBBFBLRL\n"
			+ "FFFBBBFRLR\n"
			+ "BBFFBFFLLR\n"
			+ "FFFFFBBRLL\n"
			+ "BFFFFFBRRL\n"
			+ "FBBBFFFRLL\n"
			+ "FFBBBFBRRR\n"
			+ "BBFFFBBRRL\n"
			+ "FFFBFFFRRR\n"
			+ "FFFBBBBLLL\n"
			+ "BFBFFBFLRL\n"
			+ "BFBBBBFRLR\n"
			+ "FBBFBFBLRR\n"
			+ "BFBFFFBLRR\n"
			+ "FBBBBFFRRR\n"
			+ "BFBFBFFRRR\n"
			+ "BBFBFBFRRR\n"
			+ "FBBFBFBLLR\n"
			+ "FFFBBFBRRL\n"
			+ "BFFBFFBLLR\n"
			+ "BFBFFFFRRR\n"
			+ "FBFFBFFRLR\n"
			+ "FBFFFBBRLL\n"
			+ "FBFFBFFRRL\n"
			+ "FBFBFFBLLR\n"
			+ "FFFBBFFRRL\n"
			+ "FBFBFFFLLL\n"
			+ "BFFBFBFLLR\n"
			+ "FBBFBBFLRR\n"
			+ "BBFFFFBRLR\n"
			+ "BFFFBFFLRL\n"
			+ "FBBFBFFLRL\n"
			+ "FFBFFFFRLR\n"
			+ "FFBFFFFLLR\n"
			+ "FBBFBFBRLR\n"
			+ "FFFFBBFLRL\n"
			+ "FFFFBBFLLL\n"
			+ "FFFFBBBRLR\n"
			+ "BFBFBFFLRL\n"
			+ "BFBBFFBRLR\n"
			+ "FBFFFFBRLL\n"
			+ "BFFFBBFRLL\n"
			+ "FBFBFBFRLL\n"
			+ "FFFBBFBLRR\n"
			+ "FFBFBBBLRL\n"
			+ "BFFBFFFRLL\n"
			+ "BFBBFFBLLR\n"
			+ "BBFFBFBLRR\n"
			+ "BFFBBBFLRL\n"
			+ "FBBFFFFLRR\n"
			+ "BFBBBBBLLR\n"
			+ "FFFFFBBLRL\n"
			+ "FFBBBBBRLR\n"
			+ "FFFFFBBRRR\n"
			+ "BFBBBBBRLL\n"
			+ "FBBBBBBLRL\n"
			+ "BBFFBBBRRL\n"
			+ "BFBBFBFLLL\n"
			+ "BBFFFBFRLL\n"
			+ "FFFBBFFRLR\n"
			+ "FFFBFFBRRL\n"
			+ "BFFFFBFRLL\n"
			+ "BFFBBFFRRR\n"
			+ "BFFFBBFRRL\n"
			+ "FBBFFFFRLR\n"
			+ "BFFBFFBRRR\n"
			+ "BFBBFFBRRL\n"
			+ "BFFFBFBLRR\n"
			+ "BFFBBBBLRR\n"
			+ "FBBBFBFLRR\n"
			+ "BFBBBFBRLR\n"
			+ "FFBBBFFLRL\n"
			+ "FFFFBFFLLR\n"
			+ "FBBFFBBRLR\n"
			+ "BFFBFFBLLL\n"
			+ "FBBBBFFLLR\n"
			+ "FBBFBFBLLL\n"
			+ "BFBFFFFLLL\n"
			+ "FBBBFBFRRR\n"
			+ "FBFFFBFRLL\n"
			+ "FFBBBBBLLL\n"
			+ "BBFBBFFLLR\n"
			+ "FFBFBBBRLR\n"
			+ "BBFBFFFLLL\n"
			+ "FFFFFBBRRL\n"
			+ "BFFBBBFLLL\n"
			+ "BFFBFFFRLR\n"
			+ "FFBBBBFRRL\n"
			+ "BFBBBBBRLR\n"
			+ "BFFBFBFLLL\n"
			+ "BFFBBFFLRR\n"
			+ "FBBFBBFRLL\n"
			+ "BFBFBBFLLR\n"
			+ "FBFFFBFRRR\n"
			+ "FBFBBBFLRL\n"
			+ "BFFBFBBLRL\n"
			+ "BBFBBFBLRR\n"
			+ "BBFBFFBLRL\n"
			+ "BBFBFBBRRR\n"
			+ "FBBBBFBRLL\n"
			+ "FBFBFBBLRL\n"
			+ "BBFBFBFLLR\n"
			+ "FBFFBFBRLR\n"
			+ "FFBBFFBLRR\n"
			+ "FFFBFBFLRL\n"
			+ "BFFBFBBRLL\n"
			+ "FBBBBFFLRR\n"
			+ "BFBBFFFLLR\n"
			+ "BFBFFBFRLL\n"
			+ "BBFBBFBLLL\n"
			+ "FBBBBFFLRL\n"
			+ "FBFBFFBLLL\n"
			+ "BFFBBFFRLR\n"
			+ "FBBFFFBLLR\n"
			+ "BFFBFBFRLR\n"
			+ "FBBFFBFLRL\n"
			+ "FFBFFBFRLL\n"
			+ "BFFFBFFRRL\n"
			+ "BFBBFBFRRR\n"
			+ "FFBBBFFRLL\n"
			+ "FBBBBBFLLL\n"
			+ "BFBBFFBLRR\n"
			+ "FFFFFBBLLR\n"
			+ "FFFFFFBRLR\n"
			+ "FBBFBBFLRL\n"
			+ "BFBFBBFLRR\n"
			+ "BBFFBBBLRR\n"
			+ "FFFFFBFRRL\n"
			+ "BFFFFBFRRR\n"
			+ "BFFFBFBRLR\n"
			+ "BFFFFBBLLR\n"
			+ "FBBBFBFRLL\n"
			+ "BFFFBBFLLL\n"
			+ "BFBBBFFLLR\n"
			+ "BBFFBFFRLR\n"
			+ "FBFBFBFLRL\n"
			+ "FFBBFFBLRL\n"
			+ "BFBBBFBLLL\n"
			+ "FFFFBFBRLR\n"
			+ "FBFBFFBRRL\n"
			+ "BFFFFBFLRR\n"
			+ "BFFBBBFRLR\n"
			+ "FFFFBBBRLL\n"
			+ "FBBBBFFRLR\n"
			+ "BFBFBFFRLL\n"
			+ "FBBBBBFRLL\n"
			+ "BFBFFFBRRR\n"
			+ "FBBBBBFRLR\n"
			+ "BFFBFFFRRR\n"
			+ "FFBBFFBRRL\n"
			+ "BFBBBBFLRL\n"
			+ "FFFBBBFRRL\n"
			+ "FFFFBFFRRR\n"
			+ "FFFBBFBRRR\n"
			+ "BBFBFFFLLR\n"
			+ "BFBBFBBRLL\n"
			+ "BFFFFBBLRR\n"
			+ "BBFFFBBLLL\n"
			+ "FFFBBBFRRR\n"
			+ "FFBFBBFRRL\n"
			+ "FBFBBBFLRR\n"
			+ "FBFFBFBLLL\n"
			+ "BFFBFBBLRR\n"
			+ "FFBFFFBRLL\n"
			+ "FBBBBFFRRL\n"
			+ "BBFBFFFRRL\n"
			+ "FFBFFBFLRR\n"
			+ "BFFBBFBRLR\n"
			+ "FFBBBFBLLR\n"
			+ "FBBFBFFRLR\n"
			+ "BBFBBFBRLR\n"
			+ "BFFBFFBRLL\n"
			+ "FFBFFFFRRR\n"
			+ "BBFFFFFLRR\n"
			+ "FFBFBFBRRL\n"
			+ "BBFFBFBRLR\n"
			+ "FBBBBFBLLL\n"
			+ "FBBFFBBLLL\n"
			+ "FFBFFBBLLL\n"
			+ "BFBFBBFRRL\n"
			+ "FBFFFBBLRR\n"
			+ "FBFFBFFLRL\n"
			+ "BFBBBFFLRL\n"
			+ "FBFBBFBLRR\n"
			+ "FBFBBBFLLL\n"
			+ "FFBBFBBLLR\n"
			+ "FFFFBFFRLL\n"
			+ "BBFFFFFLLL\n"
			+ "FFBBFBFRRL\n"
			+ "BFFFBFFLRR\n"
			+ "FFBFBBFLRR\n"
			+ "FBBFBFBRLL\n"
			+ "BFFBBFBRRR\n"
			+ "FBFBBFFLLR\n"
			+ "BFBBBFFRLR\n"
			+ "BBFFBFFRRL\n"
			+ "BBFFBBFRRR\n"
			+ "BFBBFFBLLL\n"
			+ "BFBFBFBRLR\n"
			+ "FBFFFBFRLR\n"
			+ "FBFBBFBRLR\n"
			+ "FFBBBBBLRL\n"
			+ "BFFFBBBLLL\n"
			+ "FBFFBFBRLL\n"
			+ "FBFFFBBRRL\n"
			+ "BBFBBFFLLL\n"
			+ "BBFFBFBLLR\n"
			+ "FBFBBFBRRR\n"
			+ "FBFBBBBRLR\n"
			+ "FBFBBFFRLR\n"
			+ "BFFBBBFLRR\n"
			+ "FBBBFFBRLR\n"
			+ "BFBBBBFLLL\n"
			+ "FFFBFBFRLL\n"
			+ "BBFBFBBLLR\n"
			+ "FFBFFBBLRL\n"
			+ "FBBBFFFRLR\n"
			+ "FFBBFBBRRL\n"
			+ "BFBFBBBLRR\n"
			+ "BBFBBFFRRR\n"
			+ "FBBBBBFLRR\n"
			+ "BBFBFBFLRL\n"
			+ "BFFFFBFLLR\n"
			+ "FBFBFFFRLR\n"
			+ "FBBBBFBRRL\n"
			+ "BFBFFFFLLR\n"
			+ "FFBFBFFLRR\n"
			+ "BFBFFFBLLR\n"
			+ "FFBFBBFLLL\n"
			+ "BBFBBFFLRR\n"
			+ "BBFFFBFLRR\n"
			+ "BFBBFFFRLL\n"
			+ "FFFFBBBLRR\n"
			+ "BFBFBBFRLL\n"
			+ "BFBFFBBRLL\n"
			+ "FFBBBBBRLL\n"
			+ "BBFFBFFLLL\n"
			+ "BFBBBBFRRL\n"
			+ "FBBBFFFLLL\n"
			+ "FFBFBFFRRR\n"
			+ "BFBFFBBRLR\n"
			+ "FFFFBFBLRL\n"
			+ "FBFFFBBRRR\n"
			+ "BFBFFBFRRL\n"
			+ "BFBBFBFRLR\n"
			+ "FBFBBBBRLL\n"
			+ "FFBBFFFRRR\n"
			+ "BFBFFFBLLL\n"
			+ "FFFBBFFLLR\n"
			+ "FFBFBFBRLR\n"
			+ "FBBBBBBRRL\n"
			+ "FFBBFBBRLL\n"
			+ "FFBFFFBRLR\n"
			+ "FBBFFFBRLL\n"
			+ "FBBBFBBRRR\n"
			+ "BFFFBBBRLL\n"
			+ "FBBBFBFLLR\n"
			+ "BBFFBFFLRL\n"
			+ "FBBFBBBLLR\n"
			+ "FBBBBBBLRR\n"
			+ "BFBBBBBRRR\n"
			+ "BFBFBBBRRR\n"
			+ "BFBBFFFLLL\n"
			+ "FFBBFFBRLL\n"
			+ "BBFBBFBLLR\n"
			+ "FBFFBBFLLR\n"
			+ "FFFFFBFRLR\n"
			+ "BBFFFBFLRL\n"
			+ "FBBFFBFLRR\n"
			+ "FFBFFBFRLR\n"
			+ "FBFFBFBLLR\n"
			+ "FFFBFBBLLL\n"
			+ "BBFFBBFLRR\n"
			+ "BBFFBFFRLL\n"
			+ "FBBFBFFLLL\n"
			+ "BFFFFBBRLL\n"
			+ "FFBBFFBLLL\n"
			+ "FFBFFBBRRL\n"
			+ "BFFBBBFRRR\n"
			+ "FBBFBFFRRR\n"
			+ "BFFBBBBLLL\n"
			+ "FFBBFBBRLR\n"
			+ "FFBBFFBRLR\n"
			+ "BFFFFBBRRL\n"
			+ "FFBBBBBRRL\n"
			+ "FBFFBFBRRL\n"
			+ "BFFBFBFRRL\n"
			+ "BBFBBBFLLL\n"
			+ "FBBFFBBLRL\n"
			+ "BFBFBFBRLL\n"
			+ "FBFFFFFLRL\n"
			+ "FFFBFFFLRR\n"
			+ "FBBFBBBLRR\n"
			+ "FFFFFBFLRR\n"
			+ "FBBBBFBLLR\n"
			+ "BFFBFBFRRR\n"
			+ "BFFFFBBLLL\n"
			+ "FFFFBBFLRR\n"
			+ "BFBBFBFLRR\n"
			+ "FFBFFBBLRR\n"
			+ "BBFFFFFRLL\n"
			+ "BFBFBFFLLR\n"
			+ "BBFBFBFRLL\n"
			+ "BBFFBBFLLL\n"
			+ "FBFBBBFRLL\n"
			+ "FBBFBBFLLL\n"
			+ "BFBBFFFRLR\n"
			+ "BFBFFBBLLL\n"
			+ "FBBBBBFRRL\n"
			+ "FFBBFBFRRR\n"
			+ "FBFFFFBLLL\n"
			+ "FFFFFBBRLR\n"
			+ "BFBBFBBRLR\n"
			+ "BFBBBBFLLR\n"
			+ "BFFBBBFLLR\n"
			+ "FFBBFBFLLR\n"
			+ "FFBBBFBRLL\n"
			+ "FFFFBBBRRR\n"
			+ "FBBFFFFRLL\n"
			+ "FFBFFFBRRR\n"
			+ "FBBFBFBRRR\n"
			+ "FFBBBFFRLR\n"
			+ "BFBFFFFRLL\n"
			+ "FBFFFBFLRL\n"
			+ "FFBFFBBRRR\n"
			+ "FBFBBFBLLL\n"
			+ "BFBFBBFLLL\n"
			+ "FFBBBBFLLR\n"
			+ "FBFBBBBLRL\n"
			+ "BFBBFBFLRL\n"
			+ "BFFFBBBLRL\n"
			+ "BFBBBBFRRR\n"
			+ "FFFBBBFRLL\n"
			+ "FFBFBFFLLL\n"
			+ "BFBFFFFRRL\n"
			+ "FFFBFBBRLR\n"
			+ "BFBFBFBLRR\n"
			+ "FBFFBBFRLR\n"
			+ "BBFFFFBLLL\n"
			+ "BFFBBBBRLL\n"
			+ "BFFFFBBLRL\n"
			+ "BBFBBFBRRR\n"
			+ "BFFFFFFLLR\n"
			+ "BBFFBBBLLR\n"
			+ "FBBFFFFLLR\n"
			+ "BBFFBFBRLL\n"
			+ "FBBBFFBRRR\n"
			+ "FBBFFBBLLR\n"
			+ "BBFFFFBLRR\n"
			+ "FBFFFFFLLL\n"
			+ "FBBFBFFLRR\n"
			+ "BFBBFBFRLL\n"
			+ "BFBBBFBRRR\n"
			+ "FFBFBBFRRR\n"
			+ "FBFBFFFRLL\n"
			+ "FFFBBFFRRR\n"
			+ "FFFFFBFLRL\n"
			+ "BFBFFBFLLR\n"
			+ "FBBBFFFRRL\n"
			+ "FBBBBBBLLR\n"
			+ "FBBFFFBRRL\n"
			+ "FFBBFFFRLL\n"
			+ "BBFBFFFRRR\n"
			+ "FFFBBFBLRL\n"
			+ "BFFBBBFRLL\n"
			+ "FFFFFFBRRR\n"
			+ "BFBFFBBLRR\n"
			+ "BBFFBBFLRL\n"
			+ "FFFBBBFLLR\n"
			+ "BFBBBFBLRR\n"
			+ "FBBFFBBRRL\n"
			+ "FFBFFBFLLR\n"
			+ "BBFBBFBLRL\n"
			+ "FFFBFFFRLL\n"
			+ "BFBFBBBLLR\n"
			+ "FFFBFFFLRL\n"
			+ "BFFFFBBRLR\n"
			+ "BBFFBFFRRR\n"
			+ "BFBBFBFRRL\n"
			+ "BBFBBFFLRL\n"
			+ "FFBBBBFRLL\n"
			+ "FBFFBBBLLL\n"
			+ "FBFBBFFLRL\n"
			+ "BFFFBBBRRR\n"
			+ "BFBBBBBRRL\n"
			+ "FBBBFFFLLR";

	private static final String[] BOARDING_PASSES = INPUT.split("\n");
	
	static int passId(String pZone) {
		String b = pZone.replace('F', '0').replace('B', '1').replace('R', '1').replace('L', '0');
		return new BigInteger(b, 2).intValue();
	}
	
	static Set<Integer> seats = new HashSet<>();
	public static void main(String[] args) {
		int max = 0;
		// 
		for (int row = 0; row < BOARDING_PASSES.length; row++) {
			System.out.println(BOARDING_PASSES[row]);
			int passId = passId(BOARDING_PASSES[row]);
			seats.add(passId);
			if (max < passId) {
				max = passId;
			}
		}
		System.out.println("" + max + " is the highest seat ID");
		
		for (int i = 1; i < max; i++) {
			if (!seats.contains(i)) {
				System.out.println("empty seat: " + i);
			}
		}

	}

}
