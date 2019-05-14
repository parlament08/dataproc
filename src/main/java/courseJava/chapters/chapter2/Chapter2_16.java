package courseJava.chapters.chapter2;

/* 
    Created by md_itverdohleb on 14.05.2019.
*/


import java.util.Scanner;

public class Chapter2_16 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int a = input.nextInt();
        System.out.println("Enter second integer:");
        int b = input.nextInt();

        System.out.println(Compare(a,b));

    }

    private static String Compare (int a, int b){

        if (a > b) {
            return  a + " is larger";
        } else if (b > a) {
            return  b + " is larger";
        } else {
            return "these numbers are equal";
        }
    }

}
