package courseJava.chapters.chapter2;

/* 
    Created by md_itverdohleb on 14.05.2019.
*/


public class Chapter2_15 {

    public static void main(String[] args) {

        System.out.println("2 + 5 = " + Sum(2, 5) + " // "
                + "10 - 6 = " + Substraction(10,6) + " // "
                + "3 * 5 = " + Multiplication(3,5) + " // "
                + "30 / 3 = " + Division(30,3));

    }
    private static Integer Sum(int a, int b){
        return a + b;
    }
    private static Integer Substraction(int a, int b){
        return a - b;
    }
    private static Integer Multiplication(int a, int b){
        return a * b;
    }
    private static Integer Division(int a, int b){
        return a / b;
    }

}
