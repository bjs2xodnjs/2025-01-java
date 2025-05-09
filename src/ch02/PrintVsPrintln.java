package ch02;

public class PrintVsPrintln {
    public static void main (String[] args) {
        //Print 안녕안녕이 옆으로 출력된다.
        System.out.print("안녕\n");
        System.out.print("안녕\n");
        System.out.print("안녕\n");

        System.out.print("안녕\\n");
        System.out.print("  '안녕'\\n");
        System.out.print("  \"안녕\" \n");


        System.out.print("안녕하세요\n반갑습니다.\n");
        System.out.print("안녕하세요\n반갑습니다.");
        // System.out.print(";;;;;");

        //printf
        int age = 22;
        String name = "홍길동";
        float height = 172.5f;
        // age, name, height 변수를 활용하여 아래처럼 출력시켜 주세요.
        // 제 이름은 홍길동이고 나이는 22살이며 키는 172.5cm 입니다.

        System.out.println("제 이름은 " + name + " 이고 나이는 " + age + "살이며 키는 " + height + " cm 입니다."  );
        System.out.printf("제 이름은 %s 이고 나이는 %d살이며 키는 %.1fcm입니다. \n", name, age, height );


        System.out.println();
        System.out.println("-----------");


        // println 바로 다음줄로
        // println + 개행(이스케이프 문자 \n
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }
}
