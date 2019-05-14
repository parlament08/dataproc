package courseJava.chapters.chapter2;

/* 
    Created by md_itverdohleb on 14.05.2019.
*/


public class Chapter2_17 {

    public static void main(String[] args) {

        System.out.println("3+4+5=" + Sum(3,4,5) +
                " // " + "average="+Average(3,4,5) +
                " // " + Smallest(3,4,5) +
                " // " + Largest(3,4,5));

    }

    private static Integer Sum(int a, int b, int c){

        return a+b+c;
    }
    private static Integer Average(int a, int b, int c){

        return Math.round((a+b+c)/3);
    }
    private static String Smallest(int a, int b, int c){
        if ((a < b) && (a < c)){
            return a + " is smallest";
        } else if((b < a) && (b < c)) {
            return b + " is smallest";
        } else {
            return c + " is smallest";
        }
    }
    private static String Largest(int a, int b, int c){
        if ((a > b) && (a > c)){
            return a + " is largest";
        } else if((b > a) && (b > c)) {
            return b + " is largest";
        } else {
            return c + " is largest";
        }
    }

}
