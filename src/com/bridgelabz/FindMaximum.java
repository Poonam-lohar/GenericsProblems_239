package com.bridgelabz;

public class FindMaximum<E extends Comparable<E>> {

    E x,y,z,p,q;

    public FindMaximum(E x,E y,E z,E p,E q) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.p = p;
        this.q = q;

    }

    public static <E extends Comparable <E>> E maxOfValue(E x,E y,E z,E p,E q) {

         E max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        if (p.compareTo(max) > 0) {
            max = p;
        }
        if (q.compareTo(max) > 0) {
            max = q;
        }
        return max;

    }
    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum number Program...");
        System.out.println("Maximum Integer value between 3 values : "+maxOfValue(3,8,9,5,4));
        System.out.println("Maximum Float value between 3 values : "+maxOfValue(3.1f,8.5f,9.6f,5.3f,7.5f));
        System.out.println("Maximum String value between 3 values: "+maxOfValue("Apple","Peach","Banana","Orange","Grapes"));
    }
}
