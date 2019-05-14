package courseJava.chapters.chapter2;

/* 
    Created by md_itverdohleb on 14.05.2019.
*/


public class Chapter2_25 {

    public static void main(String[] args) {

        Chapter2_25 chapter2_25 = new Chapter2_25();
        System.out.println(chapter2_25.OddEven(8));
    }

    private String OddEven(int a){

        if (a % 2 == 0){
            return  a + " is even";
        } else {
            return a + " is odd";
        }
    }
}
