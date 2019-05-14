package courseJava.chapters.chapter2;

/* 
    Created by md_itverdohleb on 14.05.2019.
*/

public class Chapter2_24 {

    public static void main(String[] args) {

        int arr[] = {4, 6, 2, 8, 9};
        Largest(arr);
        min(arr);
    }

    private static void Largest(int[] arr) {
        int index = 0;
        for (Integer number : arr) {
            if (number > index) {
                index = number;
            }
        }

        System.out.println(index + " is largest");
    }

    private static void min(int[] arr) {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println(smallest + " is smallest");
    }

}
