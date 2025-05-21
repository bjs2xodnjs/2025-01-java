package ch05.sec06;

import java.util.Arrays;

public class Misson03result {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,70,90};
        System.out.println (Arrays.toString(arr));
        System.out.println("-------------------------");

        //

        System.out.printf("[%d", arr[0]);
        for (int i=1; i<arr.length; i++) {
            System.out.printf(", %d", arr[i]);//


            }
        System.out.print("]");
        }


    }

