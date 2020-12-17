package de.henry.adventofcode;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Solves the "Seating System"-Riddle of December 11th 2020.
 * https://adventofcode.com/2020
 * 
 * @author henry
 *
 */
public class DayTwelve {
	

	private static final String INPUT = "W5\n"
			+ "F91\n"
			+ "S3\n"
			+ "R90\n"
			+ "F98\n"
			+ "S3\n"
			+ "E1\n"
			+ "F51\n"
			+ "E3\n"
			+ "S5\n"
			+ "E4\n"
			+ "N2\n"
			+ "R180\n"
			+ "N3\n"
			+ "F25\n"
			+ "N1\n"
			+ "W4\n"
			+ "R90\n"
			+ "S1\n"
			+ "E1\n"
			+ "F18\n"
			+ "W2\n"
			+ "F13\n"
			+ "W5\n"
			+ "R180\n"
			+ "S5\n"
			+ "L90\n"
			+ "W1\n"
			+ "F23\n"
			+ "L270\n"
			+ "F7\n"
			+ "R180\n"
			+ "E2\n"
			+ "R90\n"
			+ "E4\n"
			+ "S3\n"
			+ "L90\n"
			+ "W2\n"
			+ "R90\n"
			+ "F47\n"
			+ "R90\n"
			+ "W5\n"
			+ "L270\n"
			+ "F8\n"
			+ "E2\n"
			+ "F72\n"
			+ "W3\n"
			+ "N4\n"
			+ "E1\n"
			+ "S2\n"
			+ "R90\n"
			+ "F8\n"
			+ "S1\n"
			+ "L270\n"
			+ "F59\n"
			+ "L90\n"
			+ "F100\n"
			+ "L90\n"
			+ "W1\n"
			+ "R90\n"
			+ "F73\n"
			+ "E5\n"
			+ "R180\n"
			+ "E2\n"
			+ "N4\n"
			+ "E3\n"
			+ "N3\n"
			+ "E1\n"
			+ "F42\n"
			+ "W3\n"
			+ "S3\n"
			+ "L180\n"
			+ "F8\n"
			+ "W5\n"
			+ "R180\n"
			+ "R180\n"
			+ "F88\n"
			+ "W3\n"
			+ "F49\n"
			+ "W3\n"
			+ "S1\n"
			+ "R270\n"
			+ "N1\n"
			+ "F63\n"
			+ "W1\n"
			+ "F87\n"
			+ "W3\n"
			+ "S4\n"
			+ "L90\n"
			+ "E2\n"
			+ "N5\n"
			+ "F12\n"
			+ "E3\n"
			+ "F32\n"
			+ "W3\n"
			+ "R180\n"
			+ "L90\n"
			+ "S2\n"
			+ "L180\n"
			+ "N4\n"
			+ "F41\n"
			+ "S2\n"
			+ "R180\n"
			+ "S3\n"
			+ "E3\n"
			+ "N1\n"
			+ "L270\n"
			+ "E3\n"
			+ "F33\n"
			+ "R90\n"
			+ "F94\n"
			+ "R270\n"
			+ "S5\n"
			+ "E3\n"
			+ "F75\n"
			+ "S3\n"
			+ "R180\n"
			+ "W2\n"
			+ "N4\n"
			+ "W4\n"
			+ "R90\n"
			+ "F61\n"
			+ "N3\n"
			+ "F33\n"
			+ "E5\n"
			+ "R180\n"
			+ "S3\n"
			+ "F39\n"
			+ "N5\n"
			+ "R90\n"
			+ "R180\n"
			+ "W3\n"
			+ "F67\n"
			+ "L90\n"
			+ "R90\n"
			+ "F83\n"
			+ "E3\n"
			+ "S2\n"
			+ "L270\n"
			+ "W2\n"
			+ "F13\n"
			+ "S5\n"
			+ "E5\n"
			+ "L90\n"
			+ "N2\n"
			+ "W5\n"
			+ "N4\n"
			+ "F68\n"
			+ "N1\n"
			+ "F95\n"
			+ "W1\n"
			+ "F56\n"
			+ "S1\n"
			+ "F55\n"
			+ "L90\n"
			+ "F85\n"
			+ "W5\n"
			+ "L90\n"
			+ "F25\n"
			+ "E3\n"
			+ "S3\n"
			+ "W3\n"
			+ "N3\n"
			+ "W5\n"
			+ "F27\n"
			+ "L90\n"
			+ "E5\n"
			+ "N2\n"
			+ "F62\n"
			+ "R180\n"
			+ "S3\n"
			+ "E4\n"
			+ "R90\n"
			+ "F31\n"
			+ "S2\n"
			+ "F24\n"
			+ "R180\n"
			+ "F20\n"
			+ "S2\n"
			+ "F26\n"
			+ "R90\n"
			+ "F55\n"
			+ "W1\n"
			+ "R90\n"
			+ "N3\n"
			+ "F53\n"
			+ "L180\n"
			+ "W4\n"
			+ "N3\n"
			+ "E3\n"
			+ "R90\n"
			+ "S2\n"
			+ "R90\n"
			+ "R90\n"
			+ "S5\n"
			+ "W1\n"
			+ "W3\n"
			+ "F100\n"
			+ "R90\n"
			+ "F27\n"
			+ "E2\n"
			+ "R90\n"
			+ "N5\n"
			+ "R90\n"
			+ "S1\n"
			+ "L90\n"
			+ "S3\n"
			+ "E5\n"
			+ "S5\n"
			+ "F23\n"
			+ "S5\n"
			+ "W2\n"
			+ "S5\n"
			+ "R180\n"
			+ "E5\n"
			+ "F79\n"
			+ "R90\n"
			+ "S5\n"
			+ "E3\n"
			+ "F68\n"
			+ "E3\n"
			+ "N1\n"
			+ "W4\n"
			+ "R90\n"
			+ "F46\n"
			+ "W3\n"
			+ "R90\n"
			+ "F31\n"
			+ "W2\n"
			+ "N4\n"
			+ "R90\n"
			+ "F33\n"
			+ "E4\n"
			+ "S2\n"
			+ "R180\n"
			+ "F69\n"
			+ "E2\n"
			+ "N5\n"
			+ "E4\n"
			+ "N1\n"
			+ "F30\n"
			+ "L90\n"
			+ "E2\n"
			+ "F40\n"
			+ "W4\n"
			+ "F27\n"
			+ "W2\n"
			+ "N3\n"
			+ "F30\n"
			+ "E3\n"
			+ "N1\n"
			+ "R90\n"
			+ "N2\n"
			+ "W3\n"
			+ "R90\n"
			+ "W2\n"
			+ "S5\n"
			+ "W3\n"
			+ "F77\n"
			+ "S3\n"
			+ "W2\n"
			+ "F86\n"
			+ "L90\n"
			+ "N3\n"
			+ "F45\n"
			+ "R180\n"
			+ "F58\n"
			+ "R90\n"
			+ "F75\n"
			+ "N2\n"
			+ "E1\n"
			+ "N1\n"
			+ "E4\n"
			+ "R90\n"
			+ "S4\n"
			+ "S2\n"
			+ "R180\n"
			+ "E4\n"
			+ "S4\n"
			+ "R180\n"
			+ "F16\n"
			+ "W1\n"
			+ "L180\n"
			+ "E5\n"
			+ "F10\n"
			+ "N5\n"
			+ "E3\n"
			+ "S1\n"
			+ "W1\n"
			+ "F36\n"
			+ "S4\n"
			+ "S3\n"
			+ "F28\n"
			+ "N3\n"
			+ "F21\n"
			+ "S5\n"
			+ "W4\n"
			+ "F78\n"
			+ "W4\n"
			+ "R180\n"
			+ "F93\n"
			+ "E5\n"
			+ "F47\n"
			+ "R90\n"
			+ "W2\n"
			+ "S1\n"
			+ "F52\n"
			+ "R270\n"
			+ "W5\n"
			+ "F24\n"
			+ "N5\n"
			+ "S3\n"
			+ "E2\n"
			+ "L270\n"
			+ "L90\n"
			+ "N4\n"
			+ "R90\n"
			+ "E1\n"
			+ "N1\n"
			+ "F73\n"
			+ "N4\n"
			+ "F67\n"
			+ "W4\n"
			+ "R90\n"
			+ "E5\n"
			+ "F8\n"
			+ "W3\n"
			+ "F5\n"
			+ "S5\n"
			+ "E4\n"
			+ "N5\n"
			+ "R180\n"
			+ "N2\n"
			+ "F46\n"
			+ "L90\n"
			+ "F69\n"
			+ "W5\n"
			+ "R90\n"
			+ "W3\n"
			+ "N3\n"
			+ "L180\n"
			+ "F78\n"
			+ "W1\n"
			+ "F47\n"
			+ "F9\n"
			+ "N4\n"
			+ "F76\n"
			+ "N4\n"
			+ "F2\n"
			+ "L90\n"
			+ "S1\n"
			+ "F61\n"
			+ "L90\n"
			+ "E1\n"
			+ "R90\n"
			+ "W2\n"
			+ "F75\n"
			+ "R90\n"
			+ "W1\n"
			+ "N3\n"
			+ "R90\n"
			+ "F22\n"
			+ "N2\n"
			+ "E5\n"
			+ "L180\n"
			+ "E2\n"
			+ "F20\n"
			+ "E4\n"
			+ "F29\n"
			+ "R90\n"
			+ "S5\n"
			+ "E1\n"
			+ "R90\n"
			+ "S3\n"
			+ "F51\n"
			+ "S1\n"
			+ "R90\n"
			+ "E2\n"
			+ "F15\n"
			+ "R90\n"
			+ "S2\n"
			+ "R180\n"
			+ "F18\n"
			+ "W3\n"
			+ "L90\n"
			+ "N4\n"
			+ "F20\n"
			+ "S1\n"
			+ "R90\n"
			+ "S2\n"
			+ "F30\n"
			+ "W4\n"
			+ "S2\n"
			+ "W2\n"
			+ "F52\n"
			+ "E4\n"
			+ "F76\n"
			+ "W5\n"
			+ "R90\n"
			+ "F2\n"
			+ "L180\n"
			+ "F82\n"
			+ "E1\n"
			+ "R180\n"
			+ "F94\n"
			+ "E4\n"
			+ "N1\n"
			+ "F78\n"
			+ "N1\n"
			+ "W2\n"
			+ "L90\n"
			+ "E1\n"
			+ "F14\n"
			+ "W1\n"
			+ "F50\n"
			+ "E5\n"
			+ "L90\n"
			+ "E4\n"
			+ "N5\n"
			+ "E3\n"
			+ "F51\n"
			+ "L90\n"
			+ "F91\n"
			+ "S2\n"
			+ "L90\n"
			+ "W4\n"
			+ "F46\n"
			+ "N1\n"
			+ "F52\n"
			+ "R90\n"
			+ "F91\n"
			+ "W5\n"
			+ "S4\n"
			+ "W3\n"
			+ "R90\n"
			+ "W3\n"
			+ "F94\n"
			+ "R90\n"
			+ "S3\n"
			+ "W3\n"
			+ "R90\n"
			+ "F88\n"
			+ "E5\n"
			+ "F15\n"
			+ "L90\n"
			+ "F46\n"
			+ "R90\n"
			+ "S5\n"
			+ "E5\n"
			+ "S3\n"
			+ "L180\n"
			+ "S1\n"
			+ "F29\n"
			+ "R270\n"
			+ "F13\n"
			+ "S4\n"
			+ "W2\n"
			+ "R90\n"
			+ "F40\n"
			+ "N3\n"
			+ "F85\n"
			+ "S3\n"
			+ "F18\n"
			+ "N3\n"
			+ "R180\n"
			+ "S5\n"
			+ "E1\n"
			+ "S5\n"
			+ "R90\n"
			+ "W1\n"
			+ "L90\n"
			+ "F94\n"
			+ "R270\n"
			+ "E5\n"
			+ "S1\n"
			+ "L270\n"
			+ "W5\n"
			+ "F78\n"
			+ "S5\n"
			+ "E1\n"
			+ "N3\n"
			+ "F98\n"
			+ "N1\n"
			+ "E2\n"
			+ "W3\n"
			+ "F80\n"
			+ "N4\n"
			+ "E1\n"
			+ "F78\n"
			+ "S1\n"
			+ "L270\n"
			+ "E4\n"
			+ "R90\n"
			+ "F15\n"
			+ "W4\n"
			+ "R90\n"
			+ "E5\n"
			+ "F53\n"
			+ "N1\n"
			+ "W4\n"
			+ "F19\n"
			+ "E1\n"
			+ "S2\n"
			+ "F21\n"
			+ "N2\n"
			+ "W2\n"
			+ "F2\n"
			+ "E4\n"
			+ "F27\n"
			+ "W5\n"
			+ "R180\n"
			+ "F85\n"
			+ "R180\n"
			+ "F40\n"
			+ "W3\n"
			+ "N1\n"
			+ "F52\n"
			+ "E2\n"
			+ "F77\n"
			+ "L180\n"
			+ "E1\n"
			+ "N3\n"
			+ "R90\n"
			+ "F55\n"
			+ "N2\n"
			+ "R90\n"
			+ "E5\n"
			+ "S3\n"
			+ "L90\n"
			+ "F88\n"
			+ "N3\n"
			+ "W5\n"
			+ "R90\n"
			+ "S3\n"
			+ "F85\n"
			+ "F52\n"
			+ "L90\n"
			+ "W3\n"
			+ "R270\n"
			+ "S5\n"
			+ "F34\n"
			+ "N2\n"
			+ "W1\n"
			+ "F65\n"
			+ "W2\n"
			+ "N4\n"
			+ "L180\n"
			+ "N1\n"
			+ "F73\n"
			+ "E2\n"
			+ "N5\n"
			+ "E3\n"
			+ "S4\n"
			+ "R90\n"
			+ "W4\n"
			+ "N5\n"
			+ "F24\n"
			+ "N3\n"
			+ "L90\n"
			+ "N4\n"
			+ "F99\n"
			+ "E2\n"
			+ "N2\n"
			+ "L180\n"
			+ "W3\n"
			+ "S4\n"
			+ "W5\n"
			+ "N2\n"
			+ "L180\n"
			+ "F66\n"
			+ "R90\n"
			+ "W1\n"
			+ "R180\n"
			+ "F100\n"
			+ "S2\n"
			+ "E4\n"
			+ "R90\n"
			+ "W4\n"
			+ "F51\n"
			+ "S1\n"
			+ "W2\n"
			+ "F26\n"
			+ "N3\n"
			+ "N1\n"
			+ "E2\n"
			+ "S2\n"
			+ "F11\n"
			+ "R90\n"
			+ "F25\n"
			+ "E4\n"
			+ "F78\n"
			+ "N2\n"
			+ "N2\n"
			+ "R180\n"
			+ "F68\n"
			+ "N3\n"
			+ "R180\n"
			+ "W4\n"
			+ "F21\n"
			+ "E2\n"
			+ "N2\n"
			+ "E5\n"
			+ "S5\n"
			+ "E3\n"
			+ "F23\n"
			+ "R90\n"
			+ "F30\n"
			+ "W5\n"
			+ "F3\n"
			+ "L90\n"
			+ "F82\n"
			+ "N4\n"
			+ "W5\n"
			+ "S3\n"
			+ "E2\n"
			+ "N4\n"
			+ "F4\n"
			+ "S2\n"
			+ "R90\n"
			+ "W3\n"
			+ "R90\n"
			+ "F14\n"
			+ "W4\n"
			+ "F14\n"
			+ "W4\n"
			+ "F92\n"
			+ "S1\n"
			+ "W4\n"
			+ "S5\n"
			+ "S3\n"
			+ "F77\n"
			+ "S1\n"
			+ "F45\n"
			+ "N1\n"
			+ "L180\n"
			+ "E5\n"
			+ "F86\n"
			+ "L90\n"
			+ "E4\n"
			+ "F12\n"
			+ "S1\n"
			+ "E3\n"
			+ "F46\n"
			+ "W1\n"
			+ "L90\n"
			+ "F20\n"
			+ "S4\n"
			+ "F89\n"
			+ "N2\n"
			+ "S2\n"
			+ "F18\n"
			+ "E4\n"
			+ "F37\n"
			+ "S4\n"
			+ "F48\n"
			+ "W4\n"
			+ "L180\n"
			+ "F93\n"
			+ "R90\n"
			+ "W5\n"
			+ "L90\n"
			+ "S1\n"
			+ "E4\n"
			+ "L90\n"
			+ "S4\n"
			+ "E4\n"
			+ "S5\n"
			+ "E4\n"
			+ "L90\n"
			+ "E5\n"
			+ "R180\n"
			+ "N4\n"
			+ "R90\n"
			+ "W2\n"
			+ "F44\n"
			+ "S1\n"
			+ "L180\n"
			+ "F15\n"
			+ "W2\n"
			+ "F84\n"
			+ "S5\n"
			+ "L90\n"
			+ "N5\n"
			+ "W4\n"
			+ "R180\n"
			+ "F11\n"
			+ "R90\n"
			+ "F47\n"
			+ "S4\n"
			+ "R180\n"
			+ "S4\n"
			+ "F48\n"
			+ "L90\n"
			+ "W4\n"
			+ "L90\n"
			+ "S2\n"
			+ "F22\n"
			+ "E3\n"
			+ "F85\n"
			+ "N4\n"
			+ "F53\n"
			+ "R90\n"
			+ "F65\n"
			+ "L90\n"
			+ "S3\n"
			+ "R90\n"
			+ "F80\n"
			+ "R90\n"
			+ "F40\n"
			+ "R90\n"
			+ "F9\n"
			+ "L180\n"
			+ "W5\n"
			+ "N5\n"
			+ "W1\n"
			+ "S4\n"
			+ "F87\n"
			+ "S5\n"
			+ "F43\n"
			+ "S3\n"
			+ "L90\n"
			+ "E5\n"
			+ "R180\n"
			+ "S4\n"
			+ "W2\n"
			+ "N3\n"
			+ "N3\n"
			+ "F98\n"
			+ "E2\n"
			+ "R90\n"
			+ "W5\n"
			+ "F4\n"
			+ "L90\n"
			+ "E4\n"
			+ "F48\n"
			+ "S5\n"
			+ "F81\n"
			+ "E3\n"
			+ "S3\n"
			+ "L90\n"
			+ "S2\n"
			+ "F62\n"
			+ "E1\n"
			+ "F17\n"
			+ "S3\n"
			+ "F95\n"
			+ "N3\n"
			+ "W5\n"
			+ "E2\n"
			+ "R90\n"
			+ "R180\n"
			+ "W5\n"
			+ "L90\n"
			+ "W3\n"
			+ "F31\n"
			+ "S3\n"
			+ "W3\n"
			+ "S4\n"
			+ "L90\n"
			+ "W5\n"
			+ "R90\n"
			+ "W4\n"
			+ "S3\n"
			+ "L90\n"
			+ "S2\n"
			+ "F11\n"
			+ "S4\n"
			+ "F93";

	static Logger logger = LoggerFactory.getLogger(DayTwelve.class);
			
	static Step[] steps = load(INPUT);
	
	static Pos ship = new Pos();
	static Pos wayPoint = new Pos(10, 1);
	
	static DIR dir = DIR.E;
	
	
	static Step[] load(String pInput) {
		String[] n = pInput.split("\n");
		Step[] step = new Step[n.length];
		int i=0;
		for (String s : n) {
			step[i] = new Step();
			step[i].action = ACTION.valueOf(s.substring(0, 1));
			step[i].amount = Integer.parseInt(s.substring(1));
			i++;
		}
		return step;
	}
	
	enum DIR {
		E,
		S,
		W,
		N;
		
		static DIR fromDegrees(DIR start, int pDegrees) {
			int o = (start.ordinal() + 360 + pDegrees * DIR.values().length / 360) % DIR.values().length;
			return DIR.values()[o];
		}
	}
	
	enum ACTION {
		E,
		S,
		W,
		N,
		F,
		R,
		L;
		
		DIR toDir() {
			return DIR.values()[ordinal()];
		}
	}
	
	static void step(Step s) {
		switch (s.action) {
		case E:
		case W:
		case S:
		case N:
			go(ship, s.action.toDir(), s.amount);
			break;
		case F:
			go(ship, dir, s.amount);
			break;
		case R: 
			dir = DIR.fromDegrees(dir, s.amount);
			break;
		case L:
			dir = DIR.fromDegrees(dir, -s.amount);
			break;
		}
		
	}

	static void stepNew(Step s) {
		switch (s.action) {
		case E:
		case W:
		case S:
		case N:
			go(wayPoint, s.action.toDir(), s.amount);
			break;
		case F:
			go(ship, wayPoint, s.amount);
			break;
		case R: 
			turn(wayPoint, s.amount);
			break;
		case L:
			turn(wayPoint, -s.amount);
			break;
		}
		
	}


	private static void go(Pos pPos, DIR pDir, int pAmount) {
		switch (pDir) {
		case E:
			pPos.pose += pAmount;
			break;
		case W:
			pPos.pose -= pAmount;
			break;
		case S:
			pPos.posn -= pAmount;
			break;
		case N:
			pPos.posn += pAmount;
			break;
		}
	}
	
	private static void go(Pos pPos, Pos pTarget, int pAmount) {
		pPos.pose += pAmount * pTarget.pose;
		pPos.posn += pAmount * pTarget.posn;
	}
	
	private static void turn(Pos pTarget, int pAmount) {
		Pos p = pTarget.copy();
		int q = ((pAmount + 360) / 90) % 4;
		switch (q) {
		case -1: 
		case 3: 
			pTarget.pose = -p.posn;
			pTarget.posn = p.pose;
			break;
		case 1: 
		case -3: 
			pTarget.pose = p.posn;
			pTarget.posn = -p.pose;
			break;
		case -2: 
		case 2: 
			pTarget.pose = -p.pose;
			pTarget.posn = -p.posn;
			break;
		default:
			throw new RuntimeException("invalid amount: " + pAmount);
		}
	}
	
	
	public static void main(String[] args) {
		
		go(steps);
		
		logger.debug("position north: {} east: {} manhattan dist: {}", ship.posn, ship.pose, Math.abs(ship.posn) + Math.abs(ship.pose));
		
		ship = new Pos();
		
		goNew(steps);
		
		logger.debug("position north: {} east: {} manhattan dist: {}", ship.posn, ship.pose, Math.abs(ship.posn) + Math.abs(ship.pose));
		
		
		
	}


	static void go(Step[] pSteps) {
		for (Step s : pSteps) {
			step(s);
		}
	}
	
	static void goNew(Step[] pSteps) {
		for (Step s : pSteps) {
			stepNew(s);
		}
	}
	
	static class Step {
		ACTION action;
		int amount;
	}
	
	static class Pos {
		int pose;
		int posn;
		
		Pos() {
		}
		Pos(int e, int n) {
			pose = e;
			posn = n;
		}
		
		Pos copy() {
			return new Pos(pose, posn);
		}
	}

}
