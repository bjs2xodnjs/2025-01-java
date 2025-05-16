package ch04.sec05;

import java.util.Scanner;

public class Misson01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int speed = 0;

        /*
        합계를 구할 숫자를 입력하세요 (종료: 0)
        >> 100
        >> 200
        >> 300
        >> 400
        >> 0
         */





            boolean run = true;
            int num = 0;
            System.out.println("합계를 구할 숫자를 입력하세요. (종료: 0)");

            while(run) {
                System.out.println(">> ");
                int a = scanner.nextInt();
                if( a == 0) {
                    run = false;
                } else {
                    num = num + a;
                    System.out.printf("현재 합계: %,d\n", num);
                }


                System.out.println ("합계:" + num);
            }


    }


    }


