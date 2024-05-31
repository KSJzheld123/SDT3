package org.example;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        int avg = sum / a.length;

        System.out.println(sum);

        System.out.println(avg);

    }
}
