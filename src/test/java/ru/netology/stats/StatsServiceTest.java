package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void sumSalesAllMonths() {
        StatsService service = new StatsService();

        long[] byMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sumSales(byMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSumSalesAllMonths() {
        StatsService service = new StatsService();

        long[] byMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 15;
        long actual = service.averageSumSales(byMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesAllMonths() {
        StatsService service = new StatsService();

        long[] byMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSales(byMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesAllMonths() {
        StatsService service = new StatsService();

        long[] byMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;
        long actual = service.minSales(byMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countMonthsBelowAverageAllMonths() {
        StatsService service = new StatsService();

        long[] byMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.countMonthsBelowAverage(byMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void countMonthsAboveAverageAllMonths() {
        StatsService service = new StatsService();

        long[] byMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.countMonthsAboveAverage(byMonth);

        Assertions.assertEquals(expected, actual);
    }
}
