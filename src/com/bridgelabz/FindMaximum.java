package com.bridgelabz;

public class FindMaximum<E extends Comparable<E>> {

    E x,y,z;

    public FindMaximum() {
        this.x = x;
        this.y = y;
        this.z = z;

    }

    public static <E extends Comparable <E>> E maxOfValue(E x,E y,E z) {

         E max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;

    }
    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum number Program...");
        System.out.println("Maximum Integer value between 3 values : "+maxOfValue(3,8,9));
        FindMaximum findMaximum = new FindMaximum();
        System.out.println("Maximum Float value between 3 values : "+findMaximum.maxOfValue(3.1f,8.5f,9.6f));
        System.out.println("Maximum String value between 3 values: "+findMaximum.maxOfValue("Apple","Peach","Banana"));


    }
}
