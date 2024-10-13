public class Main {
    public static void main(String[] args) {
        //HW
        //задача 1
        System.out.println("Задача 1");
        int age = 18;
        System.out.println("Если возраст человека равен " + age +", то ");
        if (age >= 18){
            System.out.println("Человеку 18 лет или больше");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }

        //задача 2
        System.out.println("Задача 2");
        int temp = 10;
        System.out.println("На улице " + temp + " градусов");
        if  (temp <= 5){
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else{
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //задача 3
        System.out.println("Задача 3");

        int currentSpeed = 65;
        System.out.println("Если скорость " + currentSpeed + ", то");

        if (currentSpeed <= 60){
            System.out.println("можно ездить спокойно");
        }
        else{
            System.out.println("придется заплатить штраф");
        }

        //задача 4
        System.out.println("Задача 4");

        int age_2 = 20;

        System.out.println("Если возраст человека равен " + age_2 + ",");

        if (age_2 > 2 && age_2 < 6){
            System.out.println("то ему нужно ходить в детский сад.");
        }
        else if (age_2 > 7 && age_2 < 17){
            System.out.println("то ему нужно ходить в школу.");
        }
        else if (age_2 >= 18 && age_2 <= 24){
            System.out.println("то его место в университете.");
        }
        else if (age_2 > 24){
            System.out.println("то ему пора ходить на работу");
        }
        else {
            System.out.println("то его возраст ещё слишком невелик для серьёзных решений.");
        }

        //задача 5
        System.out.println("Задача 5");

        int kidAge = 12;

        System.out.println("Если возраст ребенка равен " + kidAge + ",");

        if (kidAge < 5){
            System.out.println("то он не может кататься на аттракционе.");
        }
        else if (kidAge > 5 && kidAge < 14){
            System.out.println("то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        else {
            System.out.println("то он может кататься без сопровождения взрослого.");
        }

        //задача 6
        System.out.println("Задача 6");

        int wagonCapacity = 72;

        System.out.println("Если количество пассажиров - " + wagonCapacity + ",");

        if (wagonCapacity < 60){
            System.out.println("то в вагоне есть сидячее место.");
        }
        else if(wagonCapacity >= 60 && wagonCapacity < 102){
            System.out.println("то в вагоне ещё есть стоячее место.");
        }
        else {
            System.out.println("то в вагоне нет мест.");
        }

        //задача 7
        System.out.println("Задача 7");

        int one = 1;
        int two = 2;
        int three = 3;

        if(one > two){
            if(one > three){
                System.out.println("Biggest number - " + one);
            }
            else {
                System.out.println("Biggest number - " + three);
            }
        }
        else if (two > three){
            System.out.println("Biggest number - " + two);
        }
        else {
            System.out.println("Biggest number - " + three);
        }
    }
}