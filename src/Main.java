public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");

        checkLeapYear(2021);

        //задача 2
        System.out.println("Задача 2");

    }
    public static void checkLeapYear(int year) {
         if ( year%4 == 0 && (year%100 != 0 || year%400 == 0) && year > 1584 ){
            System.out.println(year + " год — високосный год");
        }
        else {
            System.out.println(year + " год — невисокосный год");
        }
    }
}