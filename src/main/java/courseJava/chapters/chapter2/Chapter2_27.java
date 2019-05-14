package courseJava.chapters.chapter2;

/* 
    Created by md_itverdohleb on 14.05.2019.
*/


public class Chapter2_27 {

    public static void main(String[] args) {

        //I tried to do using matrix
        int[][] array = new int[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = 0;
                if (i % 2 != 0) {
                    System.out.print(" " + array[i][j]);
                } else {
                    System.out.print(" " + array[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("-----------");

        //my solution
        Asterisks();

    }

    private static void Asterisks() {
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                System.out.println("* * * * * * * *");
            } else {
                System.out.println(" * * * * * * * *");
            }
        }
    }

}
