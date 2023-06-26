package Tasks;

import java.util.Scanner;

public class Average_number {
    public static void main(String[] args) {
        /*
        Напишите программу на Java,
        которая принимает число - количество чисел, а так же сами числа в качестве входных данных
        для вычисления и печати среднего числа(Сумма всех чисел деленное на их количетсво).
        Напишите для этой программы отдельный метод  и вызовите его в методе мейн,метод ничего не возвращает,
        искомый результат выводится на печать. Результат отображается с плавающей точкой,
        округление производится до трех знаков после запятой.
        */
        average();
    }
    static void average(){
        //Сумма всех чисел
        int summa = 0;

        //Среднее значение
        double average_result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int count = scanner.nextInt();

        if(count == 0){
            System.out.println(average_result);
        }
        else {
            //Инициализация пустого массива с количеством элементов равным введенному значению count
            int array[] = new int[count];

            //Последовательное заполнение массива числами
            for (int i = 0; i < count; i++){
                System.out.println("Введите число " + (i + 1));
                array[i] = scanner.nextInt();

                //Подсчет суммы чисел
                summa = summa + array[i];
            }
            //Среднее значение с плавающей точкой, поэтому привели к типу данных double
            average_result =  (double) summa / (double) count;

            //printf выполняет конструкцию окгругления полученного числа
            // до указанного количества знаков после запятой
            System.out.printf("%.3f", average_result);
        }

        //Цикл для проверки коректности заполнения массива с клавиатуры
        //for (int i = 0; i < count; i++) {
        //    System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        //}
    }
}

