package courseJava.chapters.chapter3.chapter3_14;


public class DateTest {

    public static void main(String[] args){

        DateClass dateClass = new DateClass(12,4,1990);

        System.out.println(dateClass.DisplayDate(dateClass.getDay(), dateClass.getMonth(), dateClass.getYear()));

    }
}
