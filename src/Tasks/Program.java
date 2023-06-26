package Tasks;

import java.util.Scanner;

public class Program {
    /*В цикле программа просит у пользователя ввести два числа и выводит результат их умножения.

    После вывода результата умножения программа спрашивает, надо ли завершить выполнение.
    И если пользователь введет число 1, то программа завершает цикл. Если введено любое другое число,
     то программа продолжает спрашивать у пользователя два числа и умножать их.
    */
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = 0;
        do
        {
            System.out.println("Введите первое число: ");
            int num1 = in.nextInt();
            System.out.println("Введите второе число: ");
            int num2 = in.nextInt();
            //Первый способ
            System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
            //Второй способ
            System.out.println(num1 + " * " + num2 + " = " + num1 * num2);

            System.out.println("Для выхода из программы нажмите цифру 1, для подолжения любую другую цифру");
            n = in.nextInt();
        }
        while(n!=1);
    }
}
