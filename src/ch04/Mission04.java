package ch04;

import java.util.Scanner;

public class Mission04 {
    public static void main(String[] args) {
//        int score = (int) (Math.random() * 201.0); // 0~200 사이의 랜덤값
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력해주세요: ");
        int score = scan.nextInt();
//        System.out.printf("score: %d\n", score);

        if (score < 0 || score > 100) {// 0미만 혹은 100초과인 경우
            System.out.println("측정 불가");
        } else if (score >= 90) { //0 ~ 100 사이
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else {
            System.out.println("D학점");

            System.out.println("---끝---");
        }

    }

}