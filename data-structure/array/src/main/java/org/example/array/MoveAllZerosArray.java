package org.example.array;

public class MoveAllZerosArray {
    public static void moveAllZerosToEndArray(int[] arr) {
        int len = arr.length;

        int countZeros = 0;

        for (int i = 0; i < len; i++) {
            if (arr[i]!=0){
                arr[countZeros++] = arr[i];
            }
        }

        while (countZeros < len) {
            arr[countZeros++] = 0;
        }


    }
}
