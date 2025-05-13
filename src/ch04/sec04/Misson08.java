package ch04.sec04;

public class Misson08 {
    public static void main(String[] args) {
        int sum = 0;

//    sum = sum + 1;
//    sum = sum + 2;
//    sum = sum + 3;
//
//    System.out.println("sum:" + sum); //6




        // 1~100 모두 더한 값
        for(int i=1; i < 101; i++) {
            sum = sum + i;
        }
        System.out.println("sum:" + sum);
    }
}
