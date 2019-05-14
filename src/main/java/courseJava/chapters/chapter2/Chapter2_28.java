package courseJava.chapters.chapter2;

/* 
    Created by md_itverdohleb on 14.05.2019.
*/


public class Chapter2_28 {

    private final static double Pi = 3.14159;

    public static void main(String[] args) {

        Circle(4);

    }

    private static void Circle(int radius){

        Integer diameter = 2 * radius;
        Double circumference = 2 * Pi * radius;
        Double area = Pi * (radius * radius);

        System.out.printf("diameter: %d; circumference: %f; area: %f", diameter,circumference,area);
    }
}
