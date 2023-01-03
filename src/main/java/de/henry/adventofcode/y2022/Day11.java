package de.henry.adventofcode.y2022;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day11 {

    public static void main(String[] args) {
        List<Monkey> monkeys = readMonkeyData(INPUT);
    }

    static ScriptEngine calculator = new ScriptEngineManager().getEngineByName("nashorn");

    static class Monkey {
        String name;
        Queue<Integer> items = new LinkedList<>();

        String worryLevelCode;
        int divisibleBy;

        int trueMonkeyNr;
        int falseMonkeyNr;

    }

    static List<Monkey> readMonkeyData(String pInput) {
        List<Monkey> monkeys = new ArrayList<>();
        Monkey cur = new Monkey();
        for (String l : pInput.split("\n")) {
            if (l.isEmpty()) {
                cur = new Monkey();
                continue;
            }
            if (l.startsWith("Monkey ")) {
                cur.name = l.substring(0, l.length() - 1);
                monkeys.add(cur);
                continue;
            }
            if (l.startsWith("  Starting items: ")) {
                for (String s : l.substring(18).split(", ")) {
                    cur.items.add(Integer.parseInt(s));
                }
                continue;
            }
            if (l.startsWith("  Operation: new = ")) {
                cur.worryLevelCode = l.substring(19);
                continue;
            }
            if (l.startsWith("  Test: divisible by ")) {
                cur.divisibleBy = Integer.parseInt(l.substring(21));
                continue;
            }
            if (l.startsWith("    If true: throw to monkey ")) {
                cur.trueMonkeyNr = Integer.parseInt(l.substring(29));
                continue;
            }
            if (l.startsWith("    If false: throw to monkey ")) {
                cur.falseMonkeyNr = Integer.parseInt(l.substring(30));
            }
        }
        return monkeys;
    }

    private static final String INPUT = "Monkey 0:\n" +
            "  Starting items: 65, 78\n" +
            "  Operation: new = old * 3\n" +
            "  Test: divisible by 5\n" +
            "    If true: throw to monkey 2\n" +
            "    If false: throw to monkey 3\n" +
            "\n" +
            "Monkey 1:\n" +
            "  Starting items: 54, 78, 86, 79, 73, 64, 85, 88\n" +
            "  Operation: new = old + 8\n" +
            "  Test: divisible by 11\n" +
            "    If true: throw to monkey 4\n" +
            "    If false: throw to monkey 7\n" +
            "\n" +
            "Monkey 2:\n" +
            "  Starting items: 69, 97, 77, 88, 87\n" +
            "  Operation: new = old + 2\n" +
            "  Test: divisible by 2\n" +
            "    If true: throw to monkey 5\n" +
            "    If false: throw to monkey 3\n" +
            "\n" +
            "Monkey 3:\n" +
            "  Starting items: 99\n" +
            "  Operation: new = old + 4\n" +
            "  Test: divisible by 13\n" +
            "    If true: throw to monkey 1\n" +
            "    If false: throw to monkey 5\n" +
            "\n" +
            "Monkey 4:\n" +
            "  Starting items: 60, 57, 52\n" +
            "  Operation: new = old * 19\n" +
            "  Test: divisible by 7\n" +
            "    If true: throw to monkey 7\n" +
            "    If false: throw to monkey 6\n" +
            "\n" +
            "Monkey 5:\n" +
            "  Starting items: 91, 82, 85, 73, 84, 53\n" +
            "  Operation: new = old + 5\n" +
            "  Test: divisible by 3\n" +
            "    If true: throw to monkey 4\n" +
            "    If false: throw to monkey 1\n" +
            "\n" +
            "Monkey 6:\n" +
            "  Starting items: 88, 74, 68, 56\n" +
            "  Operation: new = old * old\n" +
            "  Test: divisible by 17\n" +
            "    If true: throw to monkey 0\n" +
            "    If false: throw to monkey 2\n" +
            "\n" +
            "Monkey 7:\n" +
            "  Starting items: 54, 82, 72, 71, 53, 99, 67\n" +
            "  Operation: new = old + 1\n" +
            "  Test: divisible by 19\n" +
            "    If true: throw to monkey 6\n" +
            "    If false: throw to monkey 0";
}
