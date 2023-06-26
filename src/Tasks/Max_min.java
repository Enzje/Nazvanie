package Tasks;

import java.util.Scanner;

public class Max_min {
    //на вход поступает какое то количетсов чисел, задание: найтиминимальное значение, максимальное

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i< size;i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i< size; i++){
            System.out.println( "Исходный массив: " + array[i]);
        }
        int min = array[0];
        int max = array[0];
        for (int j =0; j < size;j++){
            if (min > array[j]){
                min = array[j];

            }
            if (max < array[j]){
                max = array[j];
            }

        }
        System.out.println("Min: " +min);
        System.out.println("Max: "+ max);



    }
}