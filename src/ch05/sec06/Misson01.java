package ch05.sec06;

import java.util.Arrays;

public class Misson01 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;


        for (int i=0; i<arr.length;  i++) {
            arr[i] = (i + 1) * 100;//



        }

        System.out.println(Arrays.toString(arr));
    }
}
