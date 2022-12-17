package de.henry.adventofcode.y2020;

import java.util.Arrays;

/**
 * Solves the "Find 2020-summands in a given list"-Riddle of December 1st 2020. 
 * https://adventofcode.com/2020.
 * 
 * @author henry
 *
 */
public final class DayOne {
    private static final int[] INPUT = {
            1801,
            1324,
            1924,
            1848,
            1735,
            1721,
            1948,
            1667,
            1832,
            1773,
            1972,
            1777,
            1866,
            1850,
            1786,
            1617,
            1806,
            1923,
            789,
            1645,
            1530,
            1989,
            1720,
            1681,
            1807,
            1716,
            1935,
            1944,
            1878,
            1859,
            1602,
            1154,
            1824,
            1993,
            1952,
            1849,
            1695,
            523,
            1845,
            1879,
            1744,
            1374,
            1567,
            1725,
            1986,
            2006,
            1739,
            1751,
            1709,
            1800,
            2008,
            1715,
            1728,
            1677,
            1388,
            1815,
            1750,
            1827,
            1737,
            1819,
            1916,
            1909,
            1726,
            1753,
            1899,
            1981,
            1558,
            1852,
            1762,
            551,
            1881,
            1891,
            1957,
            1976,
            1383,
            1847,
            1968,
            1736,
            1828,
            1851,
            1975,
            1794,
            1785,
            1837,
            1979,
            1798,
            1789,
            1534,
            1877,
            1724,
            1843,
            1812,
            1743,
            1951,
            1900,
            1887,
            1766,
            1991,
            1839,
            1700,
            1858,
            1864,
            2004,
            1870,
            1985,
            1919,
            1466,
            1754,
            1964,
            946,
            1907,
            1942,
            1911,
            321,
            1930,
            1854,
            1644,
            1757,
            1719,
            1741,
            1853,
            1706,
            1659,
            1945,
            1821,
            1950,
            1761,
            1838,
            1770,
            1927,
            1447,
            1803,
            2000,
            2010,
            1765,
            1691,
            1742,
            1936,
            1929,
            1902,
            1539,
            1816,
            1553,
            1982,
            1813,
            1896,
            1772,
            267,
            1829,
            1912,
            1787,
            1782,
            1763,
            1461,
            1883,
            1894,
            2005,
            1758,
            1717,
            1749,
            1733,
            1775,
            1767,
            1705,
            1959,
            1903,
            1880,
            2003,
            1544,
            1732,
            1833,
            1926,
            1980,
            1946,
            1978,
            1710,
            1831,
            1906,
            1922,
            1861,
            1694,
            1875,
            307,
            1920,
            1934,
            1966,
            1804,
            1799,
            1548,
            1871,
            1769,
            1997,
            1639,
            1830,
            917,
            1797,
            1672,
            1921,
            1965,
            1662
    };

    private static final int YEAR = 2020;

    private DayOne() {
    }

    private static void sum(int[] outerIndex) {
        int startIndex = 0;
        if (outerIndex.length > 0) {
            startIndex = outerIndex[outerIndex.length - 1] + 1;
        } 
        for (int i = startIndex; i < INPUT.length; i++) {
            int outersum = 0;
            for (int s = 0; s < outerIndex.length; s++) {
                outersum += INPUT[outerIndex[s]];
            }
            // System.out.println("testing " + Arrays.toString(outerIndex) + ", " + i);
            if (outersum + INPUT[i] == YEAR) {
                System.out.print("Found a solution with " + (outerIndex.length + 1) + " summands: ");
                Long multiply = 1L;
                for (int s = 0; s < outerIndex.length; s++) {
                    System.out.print("" + INPUT[outerIndex[s]] + "*");
                    multiply *= INPUT[outerIndex[s]];
                }
                System.out.println("" + INPUT[i] + "=" + multiply * INPUT[i]);
            }
            if (outersum + INPUT[i] < YEAR) {
                // descend...
                int[] newOuterIndex = Arrays.copyOf(outerIndex, outerIndex.length + 1);
                newOuterIndex[outerIndex.length] = i;
                sum(newOuterIndex);
            }
        }
    }

    /**
     * Solves the Advent Riddle Day 1: find n summands that add up to YEAR and multiply.
     * @param args The arguments of the program. Will be ignored.
     */
    public static void main(String[] args) {

        int[] start = {};
        sum(start);
    }
}
