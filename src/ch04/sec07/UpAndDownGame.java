package ch04.sec07;

import java.util.Scanner;

public class UpAndDownGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int) (Math.random() * 100.0) + 1;
        System.out.println("answer: " + answer); // 32가 나왔다고 보자.

        boolean p = true;
        while (p) {
            System.out.println("1~100 사이 숫자입력");
            int num = scanner.nextInt();
            if(num < answer) {
                System.out.println("Down!");
            } else if(num < answer) {
                System.out.println("UP!");

            } else {


            }




        }
    }
}
