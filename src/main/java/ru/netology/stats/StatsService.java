package ru.netology.stats;

public class StatsService {

    public long totalMonth(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    public long averageMonth(long[] sales) {
        return totalMonth(sales) / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowAverageSales(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale < averageMonth(sales)) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverageSales(long[] sales) {
        int count = 0;
        for (long sale : sales) {
            if (sale > averageMonth(sales)) {
                count++;
            }
        }
        return count;
    }
}
