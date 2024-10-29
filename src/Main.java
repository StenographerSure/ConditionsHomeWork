import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //задача 1
        System.out.println("Задача 1");

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] d_array = {1.57, 7.654, 9.986};

        int[] voluntary = {173, 86, 1984, 40_000};

        //задача 2
        System.out.println("Задача 2");

        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i<array.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < d_array.length; i++){
            System.out.print(d_array[i]);
            if (i<d_array.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = 0; i < voluntary.length; i++){
            System.out.print(voluntary[i]);
            if (i<voluntary.length - 1){
                System.out.print(", ");
            }
        }

        System.out.println();

        //задача 3
        System.out.println("Задача 3");

        for (int i = array.length - 1 ; i >= 0 ; i--){
            System.out.print(array[i]);
            if (i> 0){
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = d_array.length - 1 ; i >= 0 ; i--){
            System.out.print(d_array[i]);
            if (i> 0){
                System.out.print(", ");
            }
        }

        System.out.println();

        for (int i = voluntary.length - 1 ; i >= 0 ; i--){
            System.out.print(voluntary[i]);
            if (i> 0){
                System.out.print(", ");
            }
        }

        System.out.println();

        //задача 4
        System.out.println("Задача 4");

        for (int i = 0; i < array.length; i++){
            if (array[i]%2 != 0){
                array[i]++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}