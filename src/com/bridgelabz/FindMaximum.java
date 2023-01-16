package com.bridgelabz;

public class FindMaximum {

    public static Integer maxOfInteger(Integer x,Integer y,Integer z) {

        Integer max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;

    }

    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum number Program...");
        System.out.println("Maximum Integer value between 3 values : "+maxOfInteger(3,8,9));

    }
}
