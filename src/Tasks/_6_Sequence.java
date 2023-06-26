package Tasks;

import java.util.Scanner;

public class _6_Sequence {
    //Вводится число от 1 до 9 включительно, нужно вывести последовательность умножения для этого числа
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;

        System.out.println("Введите число от 1 до 9");
        int num = scanner.nextInt();
        if (num < 1 || num > 9 ){
            System.out.println("Вы ввели неверное значение");
        }
        else {
            //Первый вариант вывода послежовательности
            //while (res <= 81){
            //    System.out.print(res + " ");
            //    res +=num;
            //}
            //Второй вариант вывода послежовательности
            for (int i = 1; i <=9; i++){
                System.out.print(num * i + " ");
            }
        }
    }
}
