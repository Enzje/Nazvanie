package Tasks;

import java.util.Scanner;

public class Sum_index {
    //На вход поступает число - количество чисел в массиве.
    //Происходит заполнение этого массива числами с клавиатуры
    //Задача - вывести сумму чисел,
    // всех нечетных индексов в массиве
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество чисел");
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i< size;i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i< size; i++){
            System.out.println( "Исходный массив: " + array[i]);
        }

    }
}

