package com.bridglabz;

public class GenericMax {
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 2, b = 4, c = 6;
        Float x = 2.3f, y = 7.8f, z = 6.7f;
        String l = "Apple", m = "Banana", n = "Peach";
        getMaximum(a, b, c);
        getMaximum(x, y, z);
        getMaximum(l, m, n);
    }

    private static void getMaximum(String l, String m, String n) {
        String max = l;
        if (m.compareTo(l) > 0) {
            max = m;
        }
        if (n.compareTo(max) > 0) {
            max = n;
        }
        System.out.println("Maximum Number of String is::" + max);
    }

    private static void getMaximum(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum Number of FloatValue is::" + max);
    }

    private static void getMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum Number of Integer is::" + max);
    }
}

