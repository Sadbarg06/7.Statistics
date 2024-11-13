package ru.netology.stats.statistics.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void statisticSumAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expented = 180;
        long actual = service.sumAllSales(sales);
        Assertions.assertEquals(expented, actual);
    }

    @Test
    public void statisticAverageAmountSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expented = 15;
        long actual = service.averageAmountSales(sales);
        Assertions.assertEquals(expented, actual);

    }

    @Test
    public void statisticMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expented = 8;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expented, actual);
    }

    @Test
    public void statisticMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expented = 9;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expented, actual);
    }

    @Test
    public void statisticSalesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expented = 5;
        long actual = service.SalesBelowAverages(sales);
        Assertions.assertEquals(expented, actual);
    }

    @Test
    public void statisticSalesAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expented = 5;
        long actual = service.SalesAboveAverage(sales);
        Assertions.assertEquals(expented, actual);
    }
}
