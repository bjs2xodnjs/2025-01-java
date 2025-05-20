package ch05.sec06;

public class Misson05 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        // for 쓰기용 (10,11,12....)
        for (int i=0; i<arr.length; i++) {
            arr[i] = i + 10;
        }

        // 읽기용
        for(int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }

    }
}
