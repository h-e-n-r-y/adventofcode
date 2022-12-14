package de.henry.adventofcode.y2020;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Solves the "Shuttle Search"-Riddle of December 13th 2020.
 * https://adventofcode.com/2020
 * 
 * @author henry
 *
 */
public class Day13 {
	

	private static final String INPUT = "1003055\n"
			+ "37,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,41,x,x,x,x,x,x,x,x,x,433,x,x,x,x,x,x,x,23,x,x,x,x,x,x,x,x,17,x,19,x,x,x,x,x,x,x,x,x,29,x,593,x,x,x,x,x,x,x,x,x,x,x,x,13";

	static Logger logger = LoggerFactory.getLogger(Day13.class);
			
	static List<Integer> bus = load(INPUT);
	static int time;
	
	static List<Integer> load(String pInput) {
		String[] i = INPUT.split("\n");
		time = Integer.parseInt(i[0]);
		String[] b = i[1].split(",");
		List<Integer> bl = new ArrayList<>();
		for (String id : b) {
			try {
				bl.add(Integer.valueOf(id));
			} catch (NumberFormatException nex) {
				//
			}
		}
		return bl;
	}
	
	
	public static void main(String[] args) {

		int min = Integer.MAX_VALUE;
		int bestBus = 0;
		
		for (int id : bus) {
			int diff = id - (time % id);
			if (min > diff) {
				min = diff;
				bestBus = id;
			}
		}
		
		logger.debug("best bus {} to wait: {} multiplied: {}", bestBus, min, bestBus * min);
		
	}



}
