public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");

        int money = 0;
        int goal = 2_459_000;
        int month = 1;

        while(money < goal){
            money = money + 15_000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + money + " рублей");
            month++;
        }

        //задача 2
        System.out.println("Задача 2");

        int i = 1;

        while (i <= 10){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (i = 10;i > 0;i--){
            System.out.print(i + " ");

        }

        //задача 3
        System.out.println("Задача 3");

        int population = 12_000_000;
        int growth = 17;
        int loss = 8;

        for(i = 1; i<=10; i++){
            population = population + (growth - loss)*(population/1000);
            System.out.println("Год " +  i + " численность населения составляет " + population);
        }

        //задача 4
        System.out.println("Задача 4");

        double percent = 0.07;
        double deposit = 15_000;
        i =0;

        System.out.printf("месяц " + i + " вклад - %.0f", deposit);
        System.out.println();

        while (deposit < 12_000_000){
            i++;
            deposit = deposit + deposit * percent;
            System.out.printf("месяц " + i + " вклад - %.0f", deposit);
            System.out.println();

        }

        //задача 5
        System.out.println("Задача 5");


        deposit = 15_000;
        i =0;

        System.out.printf("месяц " + i + " вклад - %.0f", deposit);
        System.out.println();

        while (deposit < 12_000_000){
            i++;
            deposit = deposit + deposit * percent;
            if ( i % 6 ==0)
            {
                System.out.printf("месяц " + i + " вклад - %.0f", deposit);
                System.out.println();
            }
            if (deposit>12_000_000){
                System.out.printf("месяц " + i + " вклад - %.0f", deposit);
                System.out.println();
            }
        }

        //задача 6
        System.out.println("Задача 6");


        month = 0;
        int year = 0;
        deposit = 15_000;
        while(year < 9){
            month++;
            year = month/12;
            deposit = deposit + deposit * percent;

            if ( month % 6 ==0)
            {
                System.out.printf("год " + year + " месяц " + month + " вклад - %.0f", deposit);
                System.out.println();
            }

        }

        //задача 7
        System.out.println("Задача 7");

        int fridayID = 1;

        for (int day = 1; day<=31; day++ ){
            if (day == fridayID){
                System.out.print("Сегодня пятница, ");
                System.out.println(day + " число. Необходимо подготовить отчет ");
                fridayID +=7;
            }
        }

        //задача 8
        System.out.println("Задача 8");

        year = 0;
        int current_year = 2024;
        int comet_year = 0;
        while(year< current_year){
            year++;
            if(year > (current_year - 200) && year%79 == 0){
                System.out.println("Год кометы - " + year);
                comet_year = year;
            }

        }
        System.out.println("Год кометы " + (comet_year + 79));

    }
}