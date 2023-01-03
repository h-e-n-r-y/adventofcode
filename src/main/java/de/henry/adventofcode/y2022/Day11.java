package de.henry.adventofcode.y2022;

import javax.script.*;
import java.util.*;

public class Day11 {

    public static void main(String[] args) throws ScriptException {
        List<Monkey> monkeys = readMonkeyData(INPUT, true);
        for (int round = 1; round <= 20; round++) {
            round(monkeys);
        }
        Collections.sort(monkeys, (m1, m2) -> m2.inspectionCount.compareTo(m1.inspectionCount));
        dump(20, monkeys);
        System.out.println("Level of monkey business: " + (monkeys.get(0).inspectionCount * monkeys.get(1).inspectionCount));
    }

    protected static void round(List<Monkey> monkeys) throws ScriptException {
        for (Monkey monkey : monkeys) {
                monkey.turn(monkeys);
        }
    }

    static ScriptEngine calculator = new ScriptEngineManager().getEngineByName("nashorn");

    public static void dump(int round, List<Monkey> monkeys) {
        System.out.println("After round: " + round);
        for (Monkey m : monkeys) {
            System.out.println(m.name + ": " + m.inspectionCount + "  " + m.items);
        }
        System.out.println();

    }

    static class Monkey {

        Monkey(boolean divideByThree) {
            divideLevelBythree = divideByThree;
        }
        boolean divideLevelBythree;
        String name;
        Queue<Long> items = new LinkedList<>();

        String worryLevelCode;
        int divisibleBy;

        int trueMonkeyNr;
        int falseMonkeyNr;

        Long inspectionCount = 0L;

        public void turn(List<Monkey> monkeys) throws ScriptException {

            Long worryLevel = items.poll();
            while (worryLevel != null) {
                if (divideLevelBythree) {
                    Bindings bindings = calculator.getBindings(ScriptContext.ENGINE_SCOPE);
                    bindings.put("old", new Double(worryLevel));
                    bindings.put("newLevel", new Double(worryLevel));
                    String script = "var old;\nvar newLevel = " + worryLevelCode;
                    calculator.eval(script);
                    Double result = (Double) bindings.get("newLevel");
                    long wl = result.longValue();
                    wl /= 3;
                    if (wl % divisibleBy == 0) {
                        monkeys.get(trueMonkeyNr).items.add(wl);
                        //System.out.println("\t " + this.name + ": " + wl + " to " + monkeys.get(trueMonkeyNr).name);
                    } else {
                        monkeys.get(falseMonkeyNr).items.add(wl);
                        //System.out.println("\t " + this.name + ": " + wl + " to " + monkeys.get(falseMonkeyNr).name);
                    }
                }
                inspectionCount++;

                worryLevel = items.poll();
            }
        }
    }

    static List<Monkey> readMonkeyData(String pInput, boolean divideLevelByThree) {
        List<Monkey> monkeys = new ArrayList<>();
        Monkey cur = new Monkey(divideLevelByThree);
        for (String l : pInput.split("\n")) {
            if (l.isEmpty()) {
                cur = new Monkey(divideLevelByThree);
                continue;
            }
            if (l.startsWith("Monkey ")) {
                cur.name = l.substring(0, l.length() - 1);
                monkeys.add(cur);
                continue;
            }
            if (l.startsWith("  Starting items: ")) {
                for (String s : l.substring(18).split(", ")) {
                    cur.items.add(Long.parseLong(s));
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
