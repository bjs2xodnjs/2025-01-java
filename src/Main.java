/*
my name is hong

Pascal Case : MyNameIsHong
Camel Case: MyNameIsHong

클래스라는 그릇을 만들어야 한다.
그릇에는 코드가 작성된다. (메소드, 변수 등등)
클래스 이름은 파일 이름과 같아야 한다.
메소드는 함수라고 보면 된다.
메인 메소드는 굉장히 중요한 메소드이다. 프로그램의 시작점.
메소드를 만든 것은 "메소드 정의"한다. 라고 표현
메소드를 사용하는 것은 "메소드 호출" 라고 표현.
메소드가 호출되면 메소드 내용이 한줄씩 한줄씩 실행이 된다.
*/

// class 이름은 Pascal Case 로 작성을 해야한다.


public class Main {
    public static void main(String[] args) { // 메소드 (Method), 메인 메소드

        System.out.printf("반갑다 얘들아"); // 콘솔에 내용을 출력하라.

        for (int i = 1; i <= 20; i++) { // 반복문, for문, for-loop
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
