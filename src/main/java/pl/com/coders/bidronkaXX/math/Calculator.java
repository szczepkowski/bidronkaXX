package pl.com.coders.bidronkaXX.math;

import pl.com.coders.bidronkaXX.domain.Product;

import java.util.List;

public class Calculator {

    public int addFloats(int a, int b) {
        return a + b;
    }

    public float addFloats(List<Float> list) {
        float sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }

        return sum;
    }

    public float add(List<Product> products) {
        float sum = 0;


        List<Float> prices = products.stream().map(product -> product.getPrice()).toList();

        for (int i = 0; i < prices.size(); i++) {
            sum = sum + prices.get(i);
        }

        return sum;
    }

    public int remove(List<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum = sum - list.get(i);
        }

        return sum;
    }

    public long multiply(List<Integer> list) {

        int sum = 1;

        for (int i = 0; i < list.size(); i++) {
            sum = sum * list.get(i);
        }

        return sum;
    }

    public float divide(List<Float> list) {

        float sum = 1;

        for (int i = 0; i < list.size(); i++) {
            sum = sum / list.get(i);
        }

        return sum;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public float divide(float a, float b) {
        if (b == 0) {
            throw new IllegalArgumentException("Nie dzieliemy przez 0");
        }
        return a / b;
    }

    public int powerOf(int number, int powerOf) {
        if (number == 0) {
            throw new IllegalArgumentException("number nie moze byc zero");
        }

        int sum = 1;

        for (int i = 0; i < powerOf; i++) {
            sum = sum * number;
        }

        return sum;
    }

    public int fib(int n){
        return 0;
    }
}

//0 1 1 2 3 5 8 13 21 34
