package org.example;


import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println("Hare Krishna!!!");
        Pair[] arr = new Pair[3];

        arr[0].x = 1;
        arr[0].y = 2;

        arr[1].x = 2;
        arr[0].y = 5;

        Arrays.sort(arr, (a, b) -> a.x - b.y);

        for (Pair ob : arr) {
            System.out.print(ob.x + " ");
        }
    }

    static class Pair {

        int x;

        int y;

        Pair(int x, int y) {

            this.x = x;
            this.y = y;
        }
    }

}

