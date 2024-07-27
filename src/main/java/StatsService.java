package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) { // сумма продаж
        long sum = 0;

        for (long sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public long AverageSales(long[] sales) { // средняя сумма продаж
        long average = sumSales(sales) / sales.length;

        return average;

    }

    public int maxSumMonth(long[] sales) { // номер месяца с максимальными продажами
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSumMonth(long[] sales) { // номер месяца с минимальными продажами
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int AboveAverageSales(long[] sales) { //количество месяцев с продажами выше среднего
        long average = AverageSales(sales);
        int counter = 0;

        for (long sum : sales) {
            if (sum > average) {
                counter++;
            }
        }
        return counter;
    }

    public int BelowAverageSales(long[] sales) { // количество месяцев с продажами ниже среднего
        long average = AverageSales(sales);
        int counter = 0;

        for (long sum : sales) {
            if (sum < average) {
                counter++;
            }
        }
        return counter;
    }

}