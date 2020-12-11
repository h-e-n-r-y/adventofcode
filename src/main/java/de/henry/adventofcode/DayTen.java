package de.henry.adventofcode;


import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Solves the "joltage adapter"-Riddle of December 10th 2020.
 * https://adventofcode.com/2020
 * 
 * @author henry
 *
 */
public class DayTen {
	

	private static final String INPUT = "44\n"
			+ "41\n"
			+ "48\n"
			+ "17\n"
			+ "35\n"
			+ "146\n"
			+ "73\n"
			+ "3\n"
			+ "16\n"
			+ "159\n"
			+ "11\n"
			+ "29\n"
			+ "32\n"
			+ "63\n"
			+ "65\n"
			+ "62\n"
			+ "126\n"
			+ "151\n"
			+ "6\n"
			+ "124\n"
			+ "87\n"
			+ "115\n"
			+ "122\n"
			+ "43\n"
			+ "12\n"
			+ "85\n"
			+ "2\n"
			+ "98\n"
			+ "59\n"
			+ "156\n"
			+ "149\n"
			+ "66\n"
			+ "10\n"
			+ "82\n"
			+ "26\n"
			+ "79\n"
			+ "56\n"
			+ "22\n"
			+ "74\n"
			+ "49\n"
			+ "25\n"
			+ "69\n"
			+ "54\n"
			+ "19\n"
			+ "108\n"
			+ "18\n"
			+ "55\n"
			+ "131\n"
			+ "140\n"
			+ "15\n"
			+ "125\n"
			+ "37\n"
			+ "129\n"
			+ "91\n"
			+ "51\n"
			+ "158\n"
			+ "117\n"
			+ "136\n"
			+ "142\n"
			+ "109\n"
			+ "64\n"
			+ "36\n"
			+ "160\n"
			+ "150\n"
			+ "42\n"
			+ "118\n"
			+ "101\n"
			+ "78\n"
			+ "28\n"
			+ "105\n"
			+ "110\n"
			+ "40\n"
			+ "157\n"
			+ "70\n"
			+ "97\n"
			+ "139\n"
			+ "152\n"
			+ "47\n"
			+ "104\n"
			+ "81\n"
			+ "27\n"
			+ "116\n"
			+ "132\n"
			+ "143\n"
			+ "1\n"
			+ "80\n"
			+ "75\n"
			+ "141\n"
			+ "133\n"
			+ "9\n"
			+ "50\n"
			+ "153\n"
			+ "123\n"
			+ "111\n"
			+ "119\n"
			+ "130\n"
			+ "112\n"
			+ "94\n"
			+ "90\n"
			+ "86";

	static Logger logger = LoggerFactory.getLogger(DayTen.class);
			
	static int[] numbers = load(INPUT);
	
	static int[] load(String pInput) {
		String[] n = pInput.split("\n");
		int[] nmbrs = new int[n.length];
		int i=0;
		for (String s : n) {
			nmbrs[i++] = Integer.parseInt(s);
		}
		Arrays.sort(nmbrs);
		return nmbrs;
	}
	
	static int joltDiffFactorAllAdapters(int[] adapters) {
		int one = 1;
		int three = 1;
		for (int i=1; i<adapters.length; i++) {
			if (adapters[i] - adapters[i-1] == 1) {
				one++;
			} else if (adapters[i] - adapters[i-1] == 3) {
				three++;
			}
		}
		return one * three;
	}

	static final int factor[] = {1, 1, 2, 4, 7};
	static long joltDiffAdaptersCombinations(int[] adapters) {
		int[] delta = new int[adapters.length];
		delta[0] = adapters[0];
		for (int i=1; i<adapters.length; i++) {
			delta[i] = adapters[i] - adapters[i-1];
		}
			
		long combinations = 1;
		int onecount = 0;
		for (int i=0; i<delta.length; i++) {
			if (delta[i] == 3) {
				combinations *= factor[onecount];
				onecount = 0;
			} else {
				onecount++;
			}
		}
		return combinations * factor[onecount];
	}
	
	public static void main(String[] args) {
		logger.info("number of 1-jolt differences multiplied by the number of 3-jolt differences is {}", joltDiffFactorAllAdapters(numbers));
		logger.info("the total number of distinct ways you can arrange the adapters to connect the charging outlet is {}", joltDiffAdaptersCombinations(numbers));
	}

}
