package courseJava.chapters.chapter2;

/* 
    Created by md_itverdohleb on 14.05.2019.
*/


public class Chapter2_30 {

    public static void main(String[] args) {

        Separate(54875);

    }
    private static void Separate(int number){
        if (number / 10 > 0){
            Separate(number / 10);
        }
        System.out.printf("%d ", number % 10);
    }

}
