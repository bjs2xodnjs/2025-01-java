package ch05.sec06;

public class Misson04 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50} ;

        // arr 배열이 가지고 있는 숫자 모두 더한값 출력

        int num = 0;
        for(int i=0; i < arr.length; i++) {
            num += num + arr[i]; //num = num + arr[1]

        }
        System.out.println(num);
    }
}
