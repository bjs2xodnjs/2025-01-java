package ch04.sec03;

public class Misson02 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0);


        switch (score / 10) {
            case 10, 9:
                System.out.println("A학점");
                    break;
            case 8:
                System.out.println("B학점");
                        break;

            case 7:
                System.out.println("C학점");
                            break;

                default:
                System.out.println("D학점");
                break;





        }
    }
}
