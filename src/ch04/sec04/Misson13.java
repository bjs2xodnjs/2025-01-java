package ch04.sec04;

public class Misson13 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0 ) +3; // 3~8까지 랜덤값
        System.out.println("star" + star);

        for(int i = 1; i <= star; i++ ) {
            for(int k = 0; k < i; k++ ) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
// 12   23
//
// * 12.0) +12;
//
//
// 7     30
//* 24.0) +7;
//
// 2 8
//* 7.0) +2;

