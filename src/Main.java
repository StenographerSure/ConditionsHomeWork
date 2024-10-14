public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");

        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //задача 2
        System.out.println("Задача 2");

        int clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else{
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        else if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }



        //задача 3
        System.out.println("Задача 3");

        int year = 2021;

        if ( year%4 == 0 && (year%100 != 0 || year%400 == 0) && year > 1584 ){
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }

        //задача 4
        System.out.println("Задача 4");

        int deliveryDistance = 95;

        if (deliveryDistance <= 20 ){
            System.out.println("Потребуется дней: " + 1);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + 2);
        }
        else if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Потребуется дней: " + 3);
        }
        else {
            System.out.println("Доставки нет");
        }

        //задача 5
        System.out.println("Задача 5");

        int monthNumber = 12;
        if (monthNumber > 12) {
            System.out.println("Месяц задан некорректно");
        }
        else {
            switch (monthNumber) {
                case 1:
                    System.out.println("Зима");
                    break;
                case 2:
                    System.out.println("Зима");
                    break;
                case 3:
                    System.out.println("Весна");
                    break;
                case 4:
                    System.out.println("Весна");
                    break;
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                    System.out.println("Лето");
                    break;
                case 7:
                    System.out.println("Лето");
                    break;
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                    System.out.println("Осень");
                    break;
                case 10:
                    System.out.println("Осень");
                    break;
                case 11:
                    System.out.println("Осень");
                    break;
                case 12:
                    System.out.println("Зима");
                    break;
            }
        }
    }
}