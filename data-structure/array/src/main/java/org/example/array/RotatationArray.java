package org.example.array;

import java.util.Objects;

public class RotatationArray {
    public static void rotateNtimes(int[] arr, int rotationTimes, String rotationWay) {
        if (Objects.equals(rotationWay.toLowerCase(), "left")){
            while (rotationTimes>0) {
                rotateLeft(arr);
                rotationTimes--;
            }
        } else if (Objects.equals(rotationWay.toLowerCase(), "right")) {
            while (rotationTimes>0) {
                rotateRight(arr);
                rotationTimes--;
            }
        } else {
            System.out.println("rotation way not found");
        }
    }

    public static void rotateLeft(int[] arr) {
        int len = arr.length;
        int firstArr = arr[0];

        for (int i = 0; i < len-1; i++) {
            arr[i] = arr[i+1];
        }

        arr[len-1] = firstArr;

    }

    public static void rotateRight(int[] arr) {
        int len = arr.length;
        int lastArr = arr[len-1];

        for (int i = len-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = lastArr;

    }
}
