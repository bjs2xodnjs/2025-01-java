package ch04.sec02;

public class IfElseIfElseExample {
    public static void main (String[] args) {
        boolean result = true;
        result = false;

        int score = 89;
        // 하나의 if (그룹)
        // else 문이 있으면 하나중에 실행이된다.
        if ( score >= 90) /* 메소드*/  {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");

            // if 추가 할 수 있다.
        } else if ( score >= 80) {
            System.out.println("점수가 80~89보다 작습니다.");
            System.out.println("등급은 B입니다.");
        } else if ( score >= 70) {
            System.out.println("점수가 88점 미만입니다.");
            System.out.println("등급은 C입니다.");
        } else {
            System.out.println("점수가 70점 미만입니다.");
            System.out.println("등급은 D입니다.");
        }
            System.out.println("--끝--");

    }
}
