package de.henry.adventofcode.y2022;

import org.junit.jupiter.api.Test;

import javax.script.ScriptException;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day11Test {

    String testInput =
            "Monkey 0:\n" +
                    "  Starting items: 79, 98\n" +
                    "  Operation: new = old * 19\n" +
                    "  Test: divisible by 23\n" +
                    "    If true: throw to monkey 2\n" +
                    "    If false: throw to monkey 3\n" +
                    "\n" +
                    "Monkey 1:\n" +
                    "  Starting items: 54, 65, 75, 74\n" +
                    "  Operation: new = old + 6\n" +
                    "  Test: divisible by 19\n" +
                    "    If true: throw to monkey 2\n" +
                    "    If false: throw to monkey 0\n" +
                    "\n" +
                    "Monkey 2:\n" +
                    "  Starting items: 79, 60, 97\n" +
                    "  Operation: new = old * old\n" +
                    "  Test: divisible by 13\n" +
                    "    If true: throw to monkey 1\n" +
                    "    If false: throw to monkey 3\n" +
                    "\n" +
                    "Monkey 3:\n" +
                    "  Starting items: 74\n" +
                    "  Operation: new = old + 3\n" +
                    "  Test: divisible by 17\n" +
                    "    If true: throw to monkey 0\n" +
                    "    If false: throw to monkey 1";

    @Test
    public void test() throws ScriptException {
        List<Day11.Monkey> monkeys = Day11.readMonkeyData(testInput, true);
        for (int round = 1; round <= 20; round++) {
            Day11.round(monkeys);
        }
        Collections.sort(monkeys, (m1, m2) -> m2.inspectionCount.compareTo(m1.inspectionCount));
        for (Day11.Monkey m : monkeys) {
            System.out.println(m.name + ": " + m.inspectionCount);
        }
        System.out.println("Level of monkey business: " + (monkeys.get(0).inspectionCount * monkeys.get(1).inspectionCount));
        assertEquals(10605, monkeys.get(0).inspectionCount * monkeys.get(1).inspectionCount);
    }

    @Test
    public void test10000() throws ScriptException {
        List<Day11.Monkey> monkeys = Day11.readMonkeyData(testInput, false);
        for (int round = 1; round <= 10000; round++) {
            Day11.round(monkeys);
            if (round < 20 || round % 1000 == 0) {
                Day11.dump(round, monkeys);
            }
        }
        Collections.sort(monkeys, (m1, m2) -> m2.inspectionCount.compareTo(m1.inspectionCount));
        for (Day11.Monkey m : monkeys) {
            System.out.println(m.name + ": " + m.inspectionCount);
        }
        System.out.println("Level of monkey business: " + (monkeys.get(0).inspectionCount * monkeys.get(1).inspectionCount));
        assertEquals(2713310158L, monkeys.get(0).inspectionCount * monkeys.get(1).inspectionCount);
    }

}