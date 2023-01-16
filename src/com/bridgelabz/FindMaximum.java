package com.bridgelabz;

public class FindMaximum {

    public static Float maxOfFloat(Float x,Float y,Float z) {

        Float max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;

    }

    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum number Program...");
        System.out.println("Maximum Integer value between 3 values : "+maxOfFloat(3.1f,8.5f,9.6f));

    }
}
