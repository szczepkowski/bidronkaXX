package pl.com.coders.bidronkaXX.math;

import java.util.List;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(List<Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }

//        for (Integer i : list) {
//            sum = sum + i;
//        }
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


}
