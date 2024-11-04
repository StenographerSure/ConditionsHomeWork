import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");

        int[] book = new int[5];

        for (int i = 0; i< 5; i++)
        {
           book[i] = i+1;
        }

        int sum = 0;

        for (int i : book)
        {
            sum += i;
        }

        System.out.printf("Сумма трат за месяц составила %d рублей\n", sum);

        //задача 2
        System.out.println("Задача 2");

        int[] book_2 = new int[5];

        for (int i = 0; i< 5; i++)
        {
            book_2[i] = i+1;
        }

        int min = book_2[0];
        int max = book_2[0];

        for (int i = 0; i< 5; i++)
        {
            if(min > book_2[i]){
                min = book_2[i];
            }
        }
        System.out.printf("Минимальная трата рублей за неделю составила %d рублей\n", min);

        for (int i = 0; i< 5; i++)
        {
            if(max < book_2[i]){
                max = book_2[i];
            }
        }
        System.out.printf("Максимальная трата рублей за неделю составила %d рублей\n", max);

        //задача 3
        System.out.println("Задача 3");

        int[] book_3 = new int[5];

        for (int i = 0; i< 5; i++)
        {
            book_3[i] = i+1;
        }

        sum = 0;

        for (int i : book_3)
        {
            sum += i;
        }
        double average = (sum/book_3.length);

        System.out.printf("Средняя сумма трат за месяц составила %.1f рублей\n", average);

        //задача 4
        System.out.println("Задача 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        char temp = ' ';

        for (int i = 0; i < reverseFullName.length/2; i++){
            temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[(reverseFullName.length-1)-i];
            reverseFullName[(reverseFullName.length-1)-i] = temp;
        }

        for(char symbol: reverseFullName){
            System.out.print(symbol);
        }

    }
}