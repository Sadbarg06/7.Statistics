package ru.netology.stats.statistics.service;

public class StatsService {

    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long averageAmountSales(long[] sales) {
        long averageAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            averageAmount = (averageAmount + sales[i]);
        }
        return averageAmount / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
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

    public long SalesBelowAverages(long[] sales) {
        long belowAverageMonth = 0;
        long averageAmount = averageAmountSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAmount) {
                belowAverageMonth += 1;
            }
        }
        return belowAverageMonth;
    }

    public long SalesAboveAverage(long[] sales) {
        long aboveAverageMonth = 0;
        long averageAmount = averageAmountSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageAmount) {
                aboveAverageMonth += 1;
            }
        }
        return aboveAverageMonth;
    }

}