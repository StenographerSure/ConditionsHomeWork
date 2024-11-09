import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");

        checkLeapYear(2021);

        //задача 2
        System.out.println("Задача 2");

        checkCompatibility(1, 2023);

        //задача 3
        System.out.println("Задача 3");

        estimateDeliveryTime(75);
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && year > 1584) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkCompatibility(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= LocalDate.now().getYear()) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void estimateDeliveryTime(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставки нет");
        }
    }
}