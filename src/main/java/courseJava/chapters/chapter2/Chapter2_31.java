package courseJava.chapters.chapter2;

/* 
    Created by md_itverdohleb on 14.05.2019.
*/


public class Chapter2_31 {

    public static void main(String[] args) {

        SquaresCubes();
    }

    private static void SquaresCubes(){

        System.out.println("number  square  cube");
        for (int i = 0; i <= 10; i++){
            if ((i > 3) && (i <10)){
                System.out.println(i +"       "+ i*i + "      " + i*i*i);
            } else if(i > 9){
                System.out.println(i +"      "+ i*i + "     " + i*i*i);
            } else {
                System.out.println(i +"       "+ i*i + "       " + i*i*i);
            }
        }
    }
}
