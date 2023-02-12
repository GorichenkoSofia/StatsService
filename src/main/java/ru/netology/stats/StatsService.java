package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }

        return result;
    }

    public long avarage(long[] sales) {
        long result = sum(sales);
        return result / sales.length;
    }


    public int maximum(long[] sales) {
        int maximumMonth = 0;
        long maximSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= maximSale) {
                maximSale = sales[i];
                maximumMonth = i;
            }
        }
        return maximumMonth + 1;
    }

    public int minimum(long[] sales) {
        int minimumMonth = 0;
        long minSale = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                minimumMonth = i;
            }
        }
        return minimumMonth + 1;

    }

    public int belowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < avarage(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int AboveAvarage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > avarage(sales)) {
                counter++;
            }
        }
        return counter;
    }
}