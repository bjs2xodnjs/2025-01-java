package ch04.sec02;

public class IfExample {
    public static void main (String[] args) {
        boolean result = true;
        result = false;

        int score = 93;
        // if 둘 중 하나만 실행되어야 한다. 둘은 별개이다.
        if ( score >= 90) /* 메소드*/  {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
        if ( score < 90)
        {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B입니다.");
        }


    }
}
