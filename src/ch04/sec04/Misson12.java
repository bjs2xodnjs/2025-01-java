package ch04.sec04;

public class Misson12 {
    public static void main(String[] args) {
        /*
        2 x 1 = 2\t  3 x 1 = 3\t 4 x 1 = 4\t ... 9 x 1 = 9\n
        2 x 2 = 4\t  3 x 2 = 6\t 4 x 2 = 8\t...
        2 x 3 = 4\t  3 x 3 = 9\t 4 x 3 = 12\t
        ......
         */
        for(int i=1; i<10; i++ ) {
            for(int k=2; k<10; k++ ) {
                System.out.printf("%d x %d = %d\t", k, i, i * k );
            }
            System.out.println();
        }

    }
}
