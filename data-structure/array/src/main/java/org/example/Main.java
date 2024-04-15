package org.example;

import org.example.array.ArrayUtils;
import org.example.array.MoveAllZerosArray;
import org.example.array.RotatationArray;
import org.example.array.ThreeLargestArray;


public class Main {
    public static void main(String[] args) {
        int[] arr = {
                -2, -3, 4, -1, -2, 1, 5, -3
        };

        System.out.println(findLargestSumContiguousSubarray(arr));

    }

    public static int findLargestSumContiguousSubarray(int[] arr) {
        int maxSoFar = 0, maxEndingHere = 0, len = arr.length;
        for (int i = 0; i < len; i++) {
            maxEndingHere+=arr[i];
            if (maxSoFar<maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere<0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }



}