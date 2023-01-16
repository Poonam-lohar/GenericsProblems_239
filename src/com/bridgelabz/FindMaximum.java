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
    public Float maxOfFloat(Float x,Float y,Float z) {

        Float max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;

    }

    public String maxOfString(String x,String y,String z) {

        String max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;

    }



    public static void main(String[] args) {

        System.out.println("Welcome To Find Maximum number Program...");
        System.out.println("Maximum Integer value between 3 values : "+maxOfInteger(3,8,9));
        FindMaximum findMaximum = new FindMaximum();
        System.out.println("Maximum Float value between 3 values : "+findMaximum.maxOfFloat(3.1f,8.5f,9.6f));
        System.out.println("Maximum String value between 3 values: "+findMaximum.maxOfString("Apple","Peach","Banana"));


    }
}
