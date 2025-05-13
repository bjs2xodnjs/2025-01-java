package ch04;

public class Misson05 {
    public static void main(String[] args) {
        int starCount = (int)(Math.random() * 6.0) +2; // (1) 2~7 사이 랜덤값
        System.out.printf("starCount : %d\n",starCount);

        // starCount = 3;
        // ***
//        for(int i=0; i<3; i++)
//        System.out.printf("*");

        // starCount = 7;
        //*******

        // statCount = 2;
        //**
        for(int i=0; i<starCount; i++) {
            System.out.printf("*");
        }

    }
}
