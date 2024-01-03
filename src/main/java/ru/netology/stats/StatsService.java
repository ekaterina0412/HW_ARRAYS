package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum = sum + sale;
        }

        return sum;
    }

    public long averageSumSales(long[] sales) {
        long averageSum = 0;
        long sum = sumSales(sales);

        averageSum = sum / 12;

        return averageSum;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int countMonthsBelowAverage(long[] sales) {
        int countMonths = 0;
        long averageSum = averageSumSales(sales);

        for (long sale : sales) {
            if (sale < averageSum) {
                countMonths++;
            }
        }

        return countMonths;
    }

    public int countMonthsAboveAverage(long[] sales) {
        int countMonths = 0;
        long averageSum = averageSumSales(sales);

        for (long sale : sales) {
            if (sale > averageSum) {
                countMonths++;
            }
        }

        return countMonths;
    }
}
