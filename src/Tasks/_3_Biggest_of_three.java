package Tasks;

import java.util.Scanner;

public class _3_Biggest_of_three {
    //Вводится три РАЗНЫХ ЦЕЛЫХ числа. Требуется найти максимальное среди них и вывести строку *Максимальное число = n*
    public static void main(String[] args) {
        System.out.println("Задача поиска максимального числа из трех");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int n1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int n2 = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int n3 = scanner.nextInt();

        if (n1 > n2 & n1 > n3){
            System.out.println("Наибольшее число = " + n1);
        }
        else if (n2 > n1 & n2 > n3){
            System.out.println("Наибольшее число = " + n2);
        }
        if (n3 > n2 & n3 > n1){
            System.out.println("Наибольшее число = " + n3);
        }
    }
}
