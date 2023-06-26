package Tasks;

import java.util.Scanner;

public class _1_Number_in_diapazon {
    public static void main(String[] args) {
        System.out.println("Задача поиска указания числа в диапазоне");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        int n1 = 12;
        int n2 = 19;
        if (n1 < number && n2 > number){
            System.out.println("Число находится в интервале между " + n1 + " и " + n2);
        }
        else {
            System.out.println("Число не в указанном диапазоне");
        }
    }
}
