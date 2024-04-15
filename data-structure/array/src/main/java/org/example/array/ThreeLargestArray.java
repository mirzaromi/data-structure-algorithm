package org.example.array;

public class ThreeLargestArray {
    public static void printThreeLargestInArray(int[] arr) {
        int first = 0, second = 0, third = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int x = arr[i];

            if (x > first){
                third = second;
                second = first;
                first = x;
            } else if (x > second && x != first) {
                third = second;
                second = x;
            } else if (x > third && x != second){
                third = x;
            }
        }

        System.out.println("first = "+first);
        System.out.println("second = "+second);
        System.out.println("third = "+third);
    }
}
