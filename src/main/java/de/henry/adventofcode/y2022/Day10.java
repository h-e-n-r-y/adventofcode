package de.henry.adventofcode.y2022;

import java.util.ArrayList;
import java.util.List;

public class Day10 {

    public static void main(String[] args) {
        List<Integer> l = Day10.process(INPUT);
        System.out.println("Signal Strength: " + Day10.calculateSignalStrength(l));

        dumpScreen(l);
    }
    static List<Integer> process(String pProgram) {
        List<Integer> x = new ArrayList<>();
        int curX = 1;
        x.add(curX);
        for (String instr : pProgram.split("\n")) {
            // addx 4
            // noop
            x.add(curX);
            if (!"noop".equals(instr)) {
                curX += Integer.parseInt(instr.substring(5));
                x.add(curX);
            }
        }
        return x;
    }

    static int calculateSignalStrength(List<Integer> x) {
        int s = 0;
        for (int i=20; i<=220; i+=40) {
            int s1 = x.get(i - 1) * i;
            s += s1;
        }
        return s;
    }

    static void dumpScreen(List<Integer> x) {
        String[] screen = {"", "", "", "", "", ""};
        for(int i=0; i<240; i++) {
            int row = i % 40;
            if (Math.abs(x.get(i) - row) <= 1) {
                screen[i/40]+='#';
            } else {
                screen[i/40]+='.';
            }
        }

        for (String l : screen) {
            System.out.println(l);
        }
    }

    static final String INPUT =
            "noop\n" +
            "addx 5\n" +
            "noop\n" +
            "addx 3\n" +
            "addx -2\n" +
            "addx 4\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "addx 7\n" +
            "addx 3\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "addx 5\n" +
            "noop\n" +
            "noop\n" +
            "addx 5\n" +
            "addx -10\n" +
            "addx 2\n" +
            "addx 14\n" +
            "noop\n" +
            "addx -38\n" +
            "noop\n" +
            "noop\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx 2\n" +
            "addx 3\n" +
            "noop\n" +
            "addx 20\n" +
            "addx -19\n" +
            "addx 28\n" +
            "addx -21\n" +
            "addx 2\n" +
            "addx 3\n" +
            "noop\n" +
            "addx 2\n" +
            "addx -4\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx -4\n" +
            "addx 11\n" +
            "addx -27\n" +
            "addx 28\n" +
            "addx -38\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx -1\n" +
            "noop\n" +
            "addx 6\n" +
            "addx 3\n" +
            "addx -2\n" +
            "noop\n" +
            "noop\n" +
            "addx 7\n" +
            "addx 2\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "addx 5\n" +
            "addx 3\n" +
            "noop\n" +
            "addx 2\n" +
            "addx -11\n" +
            "addx 6\n" +
            "addx 8\n" +
            "noop\n" +
            "addx 3\n" +
            "addx -37\n" +
            "addx 1\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx 3\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "addx -5\n" +
            "addx 13\n" +
            "addx 2\n" +
            "addx -8\n" +
            "addx 9\n" +
            "addx 4\n" +
            "noop\n" +
            "addx 5\n" +
            "addx -2\n" +
            "addx -14\n" +
            "addx 21\n" +
            "addx 1\n" +
            "noop\n" +
            "noop\n" +
            "addx -38\n" +
            "addx 2\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx 3\n" +
            "addx -2\n" +
            "noop\n" +
            "addx 11\n" +
            "addx -6\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx 3\n" +
            "noop\n" +
            "addx 2\n" +
            "addx -10\n" +
            "addx 15\n" +
            "noop\n" +
            "addx -24\n" +
            "addx 17\n" +
            "addx 10\n" +
            "noop\n" +
            "addx 3\n" +
            "addx -38\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx 3\n" +
            "addx -2\n" +
            "addx 2\n" +
            "addx 7\n" +
            "addx 1\n" +
            "addx -1\n" +
            "noop\n" +
            "addx 5\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "addx 3\n" +
            "noop\n" +
            "addx -21\n" +
            "addx 28\n" +
            "addx 1\n" +
            "noop\n" +
            "addx 2\n" +
            "noop\n" +
            "addx 3\n" +
            "noop\n" +
            "noop";
}
