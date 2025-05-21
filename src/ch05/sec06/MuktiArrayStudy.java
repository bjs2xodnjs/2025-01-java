package ch05.sec06;

public class MuktiArrayStudy {
    public static void main(String[] args) {
        /*
        int num = 10;

        int[] arr1 = { num, 20, 30 }; int 배열의 주소값을 넣을 수 있다
        int[] arr1 = { 40, 50, 60 };

        int[][] parent = { arr1, arr2 }; // 2차원 배열

        int[][][] parent2 = null; // 3차원 배열
        int[][][] parent3 = null;
         */

        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = { 40, 50, 60 };

        int[][] parent = { arr1, arr2 };
        System.out.println(parent[0][1]); // 20
        System.out.println(parent[1][1]); // 50
    }
}
