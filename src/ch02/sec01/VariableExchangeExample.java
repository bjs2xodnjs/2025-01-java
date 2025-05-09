package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.println("x:" + x + ", y:" + y); // x: 3, y: 5

    // temp 원래 가지고 있는 X의 값을 이동하는 것.
      int temp = x;
      x = y;
      y = temp;
      System.out.println("x:" + x + ", y:" + y);





        // System.out.println("x:" + x + ", y:" + y); //x: 5, y: 3
    }
}
