package ch05.sec06;

public class MuktiArrayStudy2 {
    public static void main(String[] args) {
        int [][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                { 70, 80, 90 }

        };
        System.out.println("arr.length:" + arr.length);
        System.out.println("arr[0].length:" + arr[0].length);
        System.out.println("arr[0].length:" + arr[2].length);

        int[] child0 = arr[0];

        System.out.println("-----------------------");
        for (int i=0; i<arr.length; i++) {
            for(int k=0; k< arr[i].length; k++ ){
                System.out.println(arr[i] [k]);

            }
        }
    }
}
