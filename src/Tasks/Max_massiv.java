
package Tasks;

import java.util.Scanner;

public class Max_massiv {
    //на вход поступает какое то количетсов чисел, задание: найтиминимальное значение, максимальное

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Введите исходный массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("- исходный массив.");
        //min_max(array);
        //sr_znach(array);
        //sum_chisel(array);

    }


    static void min_max(int array[]) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }


        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    static void sr_znach(int array[]) {
        double sum = 0, sr_znach = 0;

        for (int i = 0; i < array.length; i++)
            sum += array[i];

        sr_znach = sum / array.length;
        System.out.println("Среднее значение массива равно: " + sr_znach);

    }

    static void sum_chisel(int array[]) {
        int b = 0;
        for (int i = 0; i < array.length; i++) {
            while (array[i] != 0) {
                b = b + array[i] % 10;
                array[i] = array[i] / 10;

            }

            //a = a + array[i] % 10;
            //b = (array[i] - a) / 10;
            //sum = a + b;
        }
        System.out.println("Сумма цтфр равна " + b);

    }
}
