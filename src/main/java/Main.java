import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] byMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        System.out.println(service.sumSales(byMonth));
        System.out.println(service.averageSumSales(byMonth));
        System.out.println(service.maxSales(byMonth));
        System.out.println(service.minSales(byMonth));
        System.out.println(service.countMonthsBelowAverage(byMonth));
        System.out.println(service.countMonthsAboveAverage(byMonth));
    }
}
