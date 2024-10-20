public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");

        for(int i =1; i <= 10; i++)
        {
            System.out.println(i);
        }

        //задача 2
        System.out.println("Задача 2");

        for(int i =10; i >= 1; i--)
        {
            System.out.println(i);
        }




        //задача 3
        System.out.println("Задача 3");

        for(int i =0; i <= 17; i=i+2)
        {
            System.out.println(i);
        }

        //задача 4
        System.out.println("Задача 4");

        for(int i =10; i >= -10; i--)
        {
            System.out.println(i);
        }



        //задача 5
        System.out.println("Задача 5");

        for(int i =1904; i <= 2096; i=i+4)
        {
            System.out.println(i + " год является високосным");
        }

        //задача 6
        System.out.println("Задача 6");

        for(int i =7; i <= 98; i=i+7)
        {
            System.out.print(i + " ");
        }

        //задача 7
        System.out.println("Задача 7");

        for(int i =1; i <= 512; i=i*2)
        {
            System.out.print(i + " ");
        }

        //задача 8
        System.out.println("Задача 8");

        int sum = 0;
        for(int i =1; i <= 12; i++)
        {
            sum += 29_000;
            System.out.println("Месяц " +  i + ", сумма накоплений равна " + sum + " рублей");
        }

        //задача 9
        System.out.println("Задача 9");

        double investment = 0f;
        for(int i =1; i <= 12; i++)
        {
            investment = investment * 1.01;
            investment += 29_000;
            System.out.println("Месяц " +  i + ", сумма накоплений равна " + investment + " рублей");
        }

        //задача 10
        System.out.println("Задача 10");

        for (int i = 1; i<= 10; i++){
            System.out.println("2*" + i + "=" + (i*2));
        }

    }
}