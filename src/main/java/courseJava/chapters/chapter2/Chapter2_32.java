package courseJava.chapters.chapter2;

/* 
    Created by md_itverdohleb on 14.05.2019.
*/


public class Chapter2_32 {

    public static void main(String[] args) {

        int arr[] = {4, 0, 2, 8, -1, 7};
        TypeOfNumbers(arr);
    }

    private static void TypeOfNumbers(int[] arr){

        String result = "";

        for (Integer number : arr){

            if (number < 0){
                result = number + " number is negative";
            } else if (number > 0){
                result = number +  " number is positive";
            } else {
                result = number +  " number is zero";
            }

            System.out.println(result);

        }

    }
}
