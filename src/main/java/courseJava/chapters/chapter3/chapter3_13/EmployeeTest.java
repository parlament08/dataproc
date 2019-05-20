package courseJava.chapters.chapter3.chapter3_13;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Yury", "Tverdohleb", 600.0);
        Employee employee2 = new Employee("John", "Smith", 1000.0);

        System.out.printf("FIRST EMPLOYEE: first name - %s, last name - %s, his salary - %.2f%n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getSalary());

        System.out.printf("SECOND EMPLOYEE: first name - %s, last name - %s, his salary - %.2f%n",
                employee2.getFirstName(), employee2.getLastName(), employee2.getSalary());

        System.out.println("---------  Salary after Raise 10%  ------------");


        System.out.printf("FIRST EMPLOYEE: first name - %s, last name - %s, his salary after raise - %.2f%n",
                employee1.getFirstName(), employee1.getLastName(), employee1.getRaise(employee1.getSalary()));

        System.out.printf("SECOND EMPLOYEE: first name - %s, last name - %s, his salary after raise - %.2f%n",
                employee1.getFirstName(), employee2.getLastName(), employee2.getRaise(employee2.getSalary()));


    }

}
