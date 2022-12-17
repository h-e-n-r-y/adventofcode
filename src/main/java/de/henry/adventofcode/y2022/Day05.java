package de.henry.adventofcode.y2022;

import java.util.Stack;

public class Day05 {

    private static Stack<Character>[] stacks;

    public static void main(String[] args) {
        loadStacks(STACKS);
        processMoves(MOVES, false);
        printResult();

        loadStacks(STACKS);
        processMoves(MOVES, true);
        printResult();

    }

    private static void printResult() {
        System.out.println("Result:");
        for (Stack<Character> s : stacks) {
            System.out.print(s.peek());
        }
    }

    private static void loadStacks(String pStacks) {
        String[] lines = pStacks.split("\n");
        String bottom = lines[lines.length - 1];
        stacks = new Stack[(bottom.length() + 1) / 4];
        for (int i = 0; i < stacks.length; i++) {
            stacks[i] = new Stack<>();
        }
        for (int i = lines.length - 1; i>=0; i--) {
            for (int stack=0; stack < stacks.length; stack++) {
                String line = lines[i];
                char crate = line.charAt(stack*4 + 1);
                if (crate != ' ') {
                    stacks[stack].push(crate);
                }
            }
        }
        System.out.println("BEFORE\n======");
        printStacks();
    }

    private static void processMoves(String pMoves, boolean newCrane) {
        for (String move : pMoves.split("\n")) {
            // move 2 from 8 to 2
            String[] m = move.split(" ");
            int repeat = Integer.parseInt(m[1]);
            int from = Integer.parseInt(m[3]) - 1;
            int to = Integer.parseInt(m[5]) - 1;
            System.out.print("move " + repeat + "x from " + from + " to " + to + ":");
            if (newCrane) {
                Stack<Character> s = new Stack<>();
                for (int i = 0; i < repeat; i++) {
                    Character crate = stacks[from].pop();
                    //System.out.print(" " + crate);
                    s.push(crate);
                }
                for (int i = 0; i < repeat; i++) {
                    Character crate = s.pop();
                    System.out.print(" " + crate);
                    stacks[to].push(crate);
                }
            } else {
                for (int i = 0; i < repeat; i++) {
                    Character crate = stacks[from].pop();
                    System.out.print(" " + crate);
                    stacks[to].push(crate);
                }
            }
            System.out.println();
        }
        System.out.println("\nAFTER\n=====");
        printStacks();
    }

    private static void printStacks() {
        for (Stack<Character> s : stacks) {
            s.forEach(System.out::print);
            System.out.println();
        }
    }

    static final String STACKS =
            "    [H]         [D]     [P]        \n" +
            "[W] [B]         [C] [Z] [D]        \n" +
            "[T] [J]     [T] [J] [D] [J]        \n" +
            "[H] [Z]     [H] [H] [W] [S]     [M]\n" +
            "[P] [F] [R] [P] [Z] [F] [W]     [F]\n" +
            "[J] [V] [T] [N] [F] [G] [Z] [S] [S]\n" +
            "[C] [R] [P] [S] [V] [M] [V] [D] [Z]\n" +
            "[F] [G] [H] [Z] [N] [P] [M] [N] [D]";

    static final String MOVES =
            "move 2 from 8 to 2\n" +
            "move 3 from 9 to 2\n" +
            "move 1 from 3 to 8\n" +
            "move 5 from 1 to 7\n" +
            "move 2 from 9 to 2\n" +
            "move 8 from 2 to 4\n" +
            "move 6 from 7 to 2\n" +
            "move 2 from 1 to 7\n" +
            "move 4 from 5 to 9\n" +
            "move 4 from 5 to 6\n" +
            "move 1 from 8 to 3\n" +
            "move 1 from 8 to 5\n" +
            "move 2 from 9 to 8\n" +
            "move 8 from 6 to 4\n" +
            "move 4 from 3 to 6\n" +
            "move 10 from 2 to 3\n" +
            "move 1 from 5 to 1\n" +
            "move 1 from 7 to 4\n" +
            "move 2 from 9 to 8\n" +
            "move 18 from 4 to 8\n" +
            "move 1 from 1 to 6\n" +
            "move 4 from 7 to 3\n" +
            "move 12 from 8 to 4\n" +
            "move 4 from 7 to 9\n" +
            "move 5 from 6 to 9\n" +
            "move 2 from 2 to 7\n" +
            "move 3 from 9 to 5\n" +
            "move 3 from 5 to 9\n" +
            "move 1 from 2 to 8\n" +
            "move 10 from 3 to 1\n" +
            "move 2 from 7 to 8\n" +
            "move 10 from 1 to 9\n" +
            "move 1 from 3 to 5\n" +
            "move 16 from 9 to 8\n" +
            "move 1 from 3 to 2\n" +
            "move 3 from 8 to 3\n" +
            "move 1 from 5 to 9\n" +
            "move 3 from 6 to 7\n" +
            "move 2 from 7 to 2\n" +
            "move 1 from 3 to 8\n" +
            "move 5 from 4 to 1\n" +
            "move 4 from 9 to 5\n" +
            "move 2 from 2 to 5\n" +
            "move 2 from 1 to 9\n" +
            "move 23 from 8 to 4\n" +
            "move 6 from 5 to 2\n" +
            "move 5 from 2 to 6\n" +
            "move 1 from 9 to 6\n" +
            "move 2 from 2 to 4\n" +
            "move 35 from 4 to 9\n" +
            "move 1 from 6 to 1\n" +
            "move 2 from 8 to 7\n" +
            "move 1 from 6 to 8\n" +
            "move 3 from 1 to 7\n" +
            "move 1 from 7 to 1\n" +
            "move 3 from 6 to 2\n" +
            "move 4 from 3 to 7\n" +
            "move 6 from 7 to 9\n" +
            "move 1 from 6 to 9\n" +
            "move 1 from 8 to 1\n" +
            "move 2 from 2 to 9\n" +
            "move 2 from 8 to 2\n" +
            "move 3 from 7 to 3\n" +
            "move 2 from 1 to 9\n" +
            "move 5 from 9 to 3\n" +
            "move 1 from 4 to 2\n" +
            "move 1 from 1 to 4\n" +
            "move 7 from 3 to 9\n" +
            "move 1 from 3 to 4\n" +
            "move 2 from 4 to 7\n" +
            "move 24 from 9 to 4\n" +
            "move 12 from 9 to 3\n" +
            "move 1 from 3 to 1\n" +
            "move 1 from 1 to 2\n" +
            "move 2 from 2 to 6\n" +
            "move 1 from 6 to 5\n" +
            "move 1 from 6 to 8\n" +
            "move 3 from 2 to 4\n" +
            "move 1 from 7 to 4\n" +
            "move 1 from 5 to 3\n" +
            "move 1 from 9 to 8\n" +
            "move 23 from 4 to 8\n" +
            "move 17 from 8 to 5\n" +
            "move 12 from 9 to 8\n" +
            "move 10 from 8 to 7\n" +
            "move 1 from 8 to 6\n" +
            "move 5 from 4 to 3\n" +
            "move 3 from 5 to 1\n" +
            "move 3 from 1 to 6\n" +
            "move 6 from 5 to 4\n" +
            "move 10 from 3 to 1\n" +
            "move 9 from 1 to 7\n" +
            "move 2 from 4 to 9\n" +
            "move 1 from 1 to 6\n" +
            "move 4 from 8 to 1\n" +
            "move 4 from 3 to 7\n" +
            "move 4 from 6 to 5\n" +
            "move 1 from 9 to 6\n" +
            "move 1 from 9 to 2\n" +
            "move 1 from 1 to 7\n" +
            "move 1 from 2 to 7\n" +
            "move 3 from 1 to 7\n" +
            "move 9 from 5 to 9\n" +
            "move 7 from 9 to 7\n" +
            "move 2 from 9 to 1\n" +
            "move 3 from 5 to 9\n" +
            "move 3 from 4 to 8\n" +
            "move 1 from 1 to 2\n" +
            "move 1 from 2 to 6\n" +
            "move 1 from 1 to 6\n" +
            "move 5 from 8 to 7\n" +
            "move 1 from 8 to 1\n" +
            "move 1 from 3 to 9\n" +
            "move 1 from 1 to 6\n" +
            "move 2 from 9 to 5\n" +
            "move 2 from 3 to 9\n" +
            "move 4 from 6 to 3\n" +
            "move 1 from 9 to 4\n" +
            "move 2 from 4 to 8\n" +
            "move 1 from 4 to 8\n" +
            "move 1 from 9 to 5\n" +
            "move 1 from 6 to 8\n" +
            "move 23 from 7 to 8\n" +
            "move 27 from 8 to 2\n" +
            "move 2 from 8 to 1\n" +
            "move 23 from 2 to 6\n" +
            "move 3 from 5 to 3\n" +
            "move 4 from 2 to 5\n" +
            "move 2 from 3 to 1\n" +
            "move 2 from 9 to 3\n" +
            "move 4 from 1 to 4\n" +
            "move 13 from 7 to 9\n" +
            "move 1 from 5 to 6\n" +
            "move 2 from 5 to 9\n" +
            "move 1 from 5 to 3\n" +
            "move 3 from 9 to 3\n" +
            "move 5 from 9 to 5\n" +
            "move 2 from 4 to 2\n" +
            "move 1 from 4 to 9\n" +
            "move 11 from 6 to 9\n" +
            "move 9 from 6 to 1\n" +
            "move 17 from 9 to 5\n" +
            "move 3 from 7 to 4\n" +
            "move 3 from 6 to 3\n" +
            "move 14 from 5 to 2\n" +
            "move 5 from 3 to 1\n" +
            "move 2 from 9 to 4\n" +
            "move 2 from 3 to 8\n" +
            "move 5 from 5 to 9\n" +
            "move 2 from 5 to 4\n" +
            "move 7 from 1 to 8\n" +
            "move 2 from 9 to 5\n" +
            "move 3 from 9 to 8\n" +
            "move 8 from 4 to 2\n" +
            "move 2 from 7 to 8\n" +
            "move 10 from 2 to 9\n" +
            "move 10 from 2 to 6\n" +
            "move 8 from 9 to 7\n" +
            "move 2 from 3 to 9\n" +
            "move 3 from 9 to 8\n" +
            "move 5 from 3 to 9\n" +
            "move 7 from 7 to 9\n" +
            "move 3 from 2 to 9\n" +
            "move 10 from 8 to 5\n" +
            "move 1 from 7 to 6\n" +
            "move 1 from 2 to 3\n" +
            "move 4 from 1 to 6\n" +
            "move 2 from 8 to 4\n" +
            "move 1 from 4 to 6\n" +
            "move 2 from 6 to 3\n" +
            "move 2 from 3 to 1\n" +
            "move 1 from 4 to 9\n" +
            "move 4 from 1 to 5\n" +
            "move 2 from 5 to 2\n" +
            "move 2 from 8 to 4\n" +
            "move 1 from 3 to 5\n" +
            "move 3 from 5 to 7\n" +
            "move 2 from 2 to 9\n" +
            "move 3 from 7 to 6\n" +
            "move 3 from 8 to 5\n" +
            "move 10 from 5 to 7\n" +
            "move 3 from 6 to 4\n" +
            "move 11 from 6 to 1\n" +
            "move 3 from 6 to 2\n" +
            "move 12 from 1 to 3\n" +
            "move 1 from 7 to 5\n" +
            "move 9 from 7 to 3\n" +
            "move 5 from 5 to 1\n" +
            "move 4 from 4 to 6\n" +
            "move 2 from 1 to 7\n" +
            "move 1 from 2 to 6\n" +
            "move 2 from 7 to 8\n" +
            "move 1 from 2 to 4\n" +
            "move 1 from 9 to 5\n" +
            "move 3 from 6 to 7\n" +
            "move 1 from 5 to 2\n" +
            "move 9 from 9 to 5\n" +
            "move 1 from 2 to 8\n" +
            "move 1 from 4 to 8\n" +
            "move 1 from 1 to 8\n" +
            "move 1 from 4 to 2\n" +
            "move 1 from 7 to 2\n" +
            "move 1 from 6 to 2\n" +
            "move 1 from 6 to 8\n" +
            "move 6 from 9 to 6\n" +
            "move 1 from 3 to 4\n" +
            "move 9 from 3 to 5\n" +
            "move 1 from 1 to 3\n" +
            "move 2 from 2 to 6\n" +
            "move 1 from 3 to 5\n" +
            "move 14 from 5 to 1\n" +
            "move 1 from 2 to 6\n" +
            "move 5 from 6 to 4\n" +
            "move 3 from 8 to 2\n" +
            "move 5 from 6 to 1\n" +
            "move 5 from 4 to 6\n" +
            "move 1 from 7 to 1\n" +
            "move 3 from 9 to 3\n" +
            "move 7 from 5 to 7\n" +
            "move 1 from 4 to 6\n" +
            "move 2 from 7 to 5\n" +
            "move 3 from 6 to 1\n" +
            "move 3 from 8 to 1\n" +
            "move 14 from 3 to 4\n" +
            "move 8 from 4 to 2\n" +
            "move 1 from 6 to 1\n" +
            "move 15 from 1 to 6\n" +
            "move 7 from 1 to 6\n" +
            "move 6 from 1 to 3\n" +
            "move 3 from 3 to 1\n" +
            "move 2 from 4 to 5\n" +
            "move 1 from 4 to 2\n" +
            "move 19 from 6 to 8\n" +
            "move 2 from 1 to 8\n" +
            "move 4 from 5 to 4\n" +
            "move 7 from 8 to 2\n" +
            "move 2 from 3 to 1\n" +
            "move 13 from 8 to 6\n" +
            "move 4 from 4 to 9\n" +
            "move 2 from 4 to 8\n" +
            "move 2 from 1 to 6\n" +
            "move 1 from 3 to 5\n" +
            "move 19 from 2 to 3\n" +
            "move 13 from 3 to 1\n" +
            "move 1 from 4 to 9\n" +
            "move 1 from 2 to 8\n" +
            "move 3 from 7 to 1\n" +
            "move 14 from 6 to 9\n" +
            "move 2 from 6 to 4\n" +
            "move 18 from 9 to 4\n" +
            "move 3 from 7 to 2\n" +
            "move 15 from 1 to 4\n" +
            "move 2 from 1 to 8\n" +
            "move 5 from 3 to 1\n" +
            "move 1 from 3 to 6\n" +
            "move 5 from 8 to 9\n" +
            "move 3 from 9 to 5\n" +
            "move 1 from 9 to 5\n" +
            "move 1 from 8 to 9\n" +
            "move 1 from 6 to 2\n" +
            "move 3 from 9 to 4\n" +
            "move 2 from 6 to 7\n" +
            "move 30 from 4 to 6\n" +
            "move 22 from 6 to 9\n" +
            "move 6 from 9 to 4\n" +
            "move 4 from 6 to 7\n" +
            "move 1 from 1 to 6\n" +
            "move 1 from 9 to 8\n" +
            "move 1 from 7 to 6\n" +
            "move 3 from 5 to 3\n" +
            "move 5 from 6 to 5\n" +
            "move 2 from 7 to 9\n" +
            "move 4 from 1 to 5\n" +
            "move 1 from 6 to 4\n" +
            "move 1 from 8 to 7\n" +
            "move 2 from 6 to 4\n" +
            "move 17 from 9 to 8\n" +
            "move 2 from 2 to 7\n" +
            "move 2 from 3 to 1\n" +
            "move 8 from 4 to 8\n" +
            "move 1 from 3 to 8\n" +
            "move 8 from 4 to 2\n" +
            "move 2 from 1 to 2\n" +
            "move 1 from 4 to 6\n" +
            "move 4 from 7 to 1\n" +
            "move 1 from 6 to 8\n" +
            "move 19 from 8 to 3\n" +
            "move 5 from 5 to 1\n" +
            "move 5 from 5 to 9\n" +
            "move 2 from 9 to 3\n" +
            "move 6 from 1 to 9\n" +
            "move 1 from 7 to 5\n" +
            "move 1 from 7 to 4\n" +
            "move 2 from 5 to 7\n" +
            "move 2 from 2 to 4\n" +
            "move 4 from 9 to 8\n" +
            "move 12 from 8 to 7\n" +
            "move 2 from 1 to 9\n" +
            "move 1 from 7 to 4\n" +
            "move 4 from 4 to 5\n" +
            "move 3 from 9 to 3\n" +
            "move 9 from 2 to 6\n" +
            "move 2 from 7 to 5\n" +
            "move 1 from 1 to 9\n" +
            "move 5 from 9 to 7\n" +
            "move 9 from 6 to 2\n" +
            "move 6 from 2 to 8\n" +
            "move 21 from 3 to 2\n" +
            "move 12 from 2 to 9\n" +
            "move 3 from 5 to 9\n" +
            "move 3 from 3 to 8\n" +
            "move 5 from 9 to 6\n" +
            "move 13 from 2 to 3\n" +
            "move 3 from 6 to 2\n" +
            "move 10 from 9 to 8\n" +
            "move 6 from 3 to 1\n" +
            "move 3 from 2 to 9\n" +
            "move 2 from 6 to 7\n" +
            "move 5 from 3 to 9\n" +
            "move 4 from 1 to 9\n" +
            "move 3 from 8 to 5\n" +
            "move 1 from 1 to 7\n" +
            "move 6 from 5 to 7\n" +
            "move 12 from 9 to 7\n" +
            "move 1 from 1 to 8\n" +
            "move 11 from 8 to 5\n" +
            "move 9 from 5 to 7\n" +
            "move 1 from 3 to 1\n" +
            "move 4 from 8 to 7\n" +
            "move 1 from 1 to 7\n" +
            "move 2 from 8 to 3\n" +
            "move 42 from 7 to 4\n" +
            "move 3 from 7 to 9\n" +
            "move 4 from 7 to 5\n" +
            "move 1 from 7 to 8\n" +
            "move 1 from 8 to 5\n" +
            "move 1 from 7 to 5\n" +
            "move 1 from 3 to 4\n" +
            "move 1 from 3 to 9\n" +
            "move 1 from 9 to 6\n" +
            "move 1 from 6 to 4\n" +
            "move 1 from 3 to 5\n" +
            "move 3 from 9 to 2\n" +
            "move 16 from 4 to 8\n" +
            "move 3 from 2 to 4\n" +
            "move 1 from 5 to 4\n" +
            "move 30 from 4 to 6\n" +
            "move 15 from 8 to 3\n" +
            "move 2 from 4 to 5\n" +
            "move 1 from 8 to 7\n" +
            "move 13 from 3 to 6\n" +
            "move 1 from 7 to 8\n" +
            "move 1 from 3 to 8\n" +
            "move 1 from 3 to 8\n" +
            "move 4 from 5 to 2\n" +
            "move 6 from 5 to 2\n" +
            "move 2 from 8 to 6\n" +
            "move 43 from 6 to 2\n" +
            "move 1 from 6 to 1\n" +
            "move 18 from 2 to 4\n" +
            "move 24 from 2 to 6\n" +
            "move 19 from 6 to 3\n" +
            "move 4 from 6 to 3\n" +
            "move 2 from 6 to 3\n" +
            "move 3 from 3 to 2\n" +
            "move 1 from 1 to 3\n" +
            "move 23 from 3 to 6\n" +
            "move 12 from 4 to 3\n" +
            "move 7 from 3 to 9\n" +
            "move 13 from 2 to 9\n" +
            "move 1 from 8 to 4\n" +
            "move 4 from 3 to 8\n" +
            "move 6 from 4 to 2\n" +
            "move 10 from 9 to 3\n" +
            "move 6 from 2 to 9\n" +
            "move 8 from 3 to 5\n" +
            "move 3 from 5 to 3\n" +
            "move 13 from 6 to 5\n" +
            "move 4 from 3 to 9\n" +
            "move 1 from 4 to 2\n" +
            "move 4 from 8 to 3\n" +
            "move 1 from 2 to 5\n" +
            "move 14 from 9 to 5\n" +
            "move 2 from 5 to 4\n" +
            "move 2 from 4 to 3\n" +
            "move 1 from 9 to 5\n" +
            "move 4 from 6 to 1\n" +
            "move 1 from 6 to 2\n" +
            "move 6 from 3 to 2\n" +
            "move 5 from 6 to 8\n" +
            "move 2 from 3 to 7\n" +
            "move 1 from 8 to 1\n" +
            "move 25 from 5 to 7\n" +
            "move 3 from 7 to 9\n" +
            "move 5 from 2 to 9\n" +
            "move 12 from 9 to 8\n" +
            "move 3 from 1 to 6\n" +
            "move 16 from 8 to 2\n" +
            "move 1 from 9 to 2\n" +
            "move 1 from 6 to 2\n" +
            "move 1 from 1 to 3\n" +
            "move 21 from 7 to 3\n" +
            "move 2 from 7 to 1\n" +
            "move 1 from 7 to 8\n" +
            "move 2 from 2 to 1\n" +
            "move 2 from 6 to 3\n" +
            "move 18 from 2 to 9\n" +
            "move 2 from 5 to 1\n" +
            "move 1 from 2 to 1\n" +
            "move 3 from 5 to 2\n" +
            "move 13 from 9 to 1\n" +
            "move 3 from 9 to 2\n" +
            "move 1 from 8 to 7\n" +
            "move 3 from 2 to 6\n" +
            "move 2 from 5 to 1\n" +
            "move 17 from 3 to 8\n" +
            "move 3 from 3 to 8\n" +
            "move 2 from 9 to 1\n" +
            "move 1 from 7 to 5\n" +
            "move 1 from 5 to 3\n" +
            "move 2 from 6 to 4\n" +
            "move 1 from 6 to 1\n" +
            "move 15 from 8 to 2\n" +
            "move 2 from 3 to 6\n" +
            "move 1 from 8 to 5\n" +
            "move 2 from 6 to 8\n" +
            "move 13 from 2 to 9\n" +
            "move 4 from 9 to 8\n" +
            "move 9 from 8 to 9\n" +
            "move 3 from 3 to 4\n" +
            "move 4 from 9 to 7\n" +
            "move 1 from 8 to 6\n" +
            "move 1 from 7 to 5\n" +
            "move 2 from 5 to 1\n" +
            "move 1 from 6 to 3\n" +
            "move 4 from 4 to 5\n" +
            "move 1 from 4 to 6\n" +
            "move 1 from 3 to 7\n" +
            "move 1 from 5 to 6\n" +
            "move 2 from 7 to 2\n" +
            "move 4 from 2 to 3\n" +
            "move 3 from 2 to 7\n" +
            "move 1 from 3 to 6\n" +
            "move 1 from 9 to 6\n" +
            "move 2 from 5 to 2\n" +
            "move 3 from 9 to 5\n" +
            "move 1 from 6 to 1\n" +
            "move 3 from 5 to 4\n" +
            "move 12 from 1 to 2\n" +
            "move 2 from 2 to 4\n" +
            "move 2 from 7 to 8\n" +
            "move 2 from 3 to 9\n" +
            "move 1 from 4 to 7\n" +
            "move 1 from 5 to 2\n" +
            "move 1 from 8 to 3\n" +
            "move 2 from 3 to 6\n" +
            "move 7 from 2 to 8\n" +
            "move 3 from 4 to 1\n" +
            "move 7 from 8 to 5\n" +
            "move 7 from 9 to 2\n" +
            "move 1 from 4 to 5\n" +
            "move 3 from 7 to 6\n" +
            "move 5 from 6 to 9\n" +
            "move 6 from 9 to 5\n" +
            "move 4 from 9 to 6\n" +
            "move 1 from 8 to 5\n" +
            "move 1 from 7 to 4\n" +
            "move 1 from 4 to 2\n" +
            "move 2 from 2 to 9\n" +
            "move 2 from 9 to 2\n" +
            "move 11 from 5 to 3\n" +
            "move 2 from 5 to 2\n" +
            "move 1 from 2 to 9\n" +
            "move 4 from 6 to 9\n" +
            "move 1 from 2 to 9\n" +
            "move 4 from 3 to 7\n" +
            "move 3 from 6 to 4\n" +
            "move 1 from 5 to 7\n" +
            "move 18 from 1 to 3\n" +
            "move 11 from 3 to 2\n" +
            "move 1 from 7 to 9\n" +
            "move 1 from 5 to 9\n" +
            "move 14 from 3 to 6\n" +
            "move 15 from 2 to 4\n" +
            "move 5 from 2 to 5\n" +
            "move 1 from 2 to 5\n" +
            "move 1 from 1 to 9\n" +
            "move 8 from 4 to 1\n" +
            "move 5 from 5 to 9\n" +
            "move 9 from 4 to 9\n" +
            "move 4 from 7 to 4\n" +
            "move 5 from 4 to 8\n" +
            "move 2 from 9 to 6\n" +
            "move 8 from 1 to 8\n" +
            "move 1 from 5 to 3\n" +
            "move 1 from 3 to 4\n" +
            "move 1 from 1 to 8\n" +
            "move 13 from 6 to 3\n" +
            "move 9 from 9 to 5\n" +
            "move 1 from 2 to 8\n" +
            "move 8 from 5 to 1\n" +
            "move 1 from 2 to 7";
}
